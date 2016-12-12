package com.leonardo.gomes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;

import com.leonardo.gomes.dao.CartaDao;
import com.leonardo.gomes.entity.CartaEntity;
import com.leonardo.gomes.pojo.CartaPojo;
import com.leonardo.gomes.pojo.CartaPojoResponse;
import com.leonardo.gomes.pojo.ForeignNamePojo;
import com.leonardo.gomes.pojo.RequestCartasPojo;

@Controller
public class AdminController {	
	
	@Autowired
	CartaDao cartaDao;
	
	@GetMapping("/admin")
	public String admin(Model model) {		
		model.addAttribute("requestCartas", new RequestCartasPojo());
		return "admin";		
	}
	
	
	@PostMapping("/importaCartas")
	@Async
	public void importa(@ModelAttribute RequestCartasPojo requestCartas, Model model) {
		
		 	HttpHeaders headers = new HttpHeaders();
	        headers.add( "user-agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:50.0) Gecko/20100101 Firefox/50.0" );
	        HttpEntity< String > entity = new HttpEntity< String >( headers );
	        ResponseEntity< CartaPojoResponse > res = new RestTemplate()
	            .exchange(requestCartas.getUrl(), HttpMethod.GET, entity, CartaPojoResponse.class);
	        List<CartaPojo> cartas = res.getBody().getCards();
	        
	       for (CartaPojo cartaPojo : cartas) {
	    	   if(cartaPojo.getMultiverseid() != 0 && (cartaPojo.getForeignNames() != null)){
	    		   for (ForeignNamePojo foregn : cartaPojo.getForeignNames()) {	    			   		
	    			   if("Portuguese (Brazil)".equals(foregn.getLanguage())){
	    				   cartaPojo.setName(foregn.getName());
	    				   cartaPojo.setImageUrl(foregn.getImageUrl());
			    		   CartaEntity cartaEntity = new CartaEntity(cartaPojo);
				    	   cartaDao.save(cartaEntity);
				    	   System.out.println(cartaEntity.getNome() + " - " + foregn.getLanguage());
	    			   }
		    	   }
	    	   }    	   
	    	   
	       }
	}
}
