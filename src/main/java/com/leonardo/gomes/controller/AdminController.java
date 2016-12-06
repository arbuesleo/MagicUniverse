package com.leonardo.gomes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;

import com.leonardo.gomes.pojo.CartaPojoResponse;
import com.leonardo.gomes.pojo.RequestCartasPojo;

@Controller
public class AdminController {	
	@GetMapping("/admin")
	public String admin(Model model) {		
		model.addAttribute("requestCartas", new RequestCartasPojo());
		return "admin";		
	}
	
	//Fazer a importação com rest template
	@PostMapping("/importaCartas")
	public String importa(@ModelAttribute RequestCartasPojo requestCartas, Model model) {
		CartaPojoResponse cartasResponse = consomeApiCartas(requestCartas.getUrl());
		model.addAttribute("res", cartasResponse);
		return "index";
	}
	
	private CartaPojoResponse consomeApiCartas(String url) {
		return new RestTemplate().getForObject(url,CartaPojoResponse.class);
	}


}
