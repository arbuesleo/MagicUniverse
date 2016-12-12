package com.leonardo.gomes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.leonardo.gomes.dao.CartaDao;
import com.leonardo.gomes.pojo.RequestCartasPojo;

@Controller
public class HomeController {
	
	@Autowired
	CartaDao cartaDAo;
	
	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("cartas", cartaDAo.findAll());
		model.addAttribute("requestCartas", new RequestCartasPojo());
		return "index";
	}
	
	@PostMapping("/pesquisaCartas")
	public String pesquisaCartas(@ModelAttribute RequestCartasPojo requestCartas, Model model) {
		model.addAttribute("cartas", cartaDAo.findByNomeContainingIgnoreCase(requestCartas.getUrl()));
		model.addAttribute("requestCartas", requestCartas);
		return "index";
	}
}
