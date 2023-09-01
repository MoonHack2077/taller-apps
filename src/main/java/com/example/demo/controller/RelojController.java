package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.models.Reloj;
import com.example.demo.repository.IRelojRepository;

@Controller
@RequestMapping("/reloj")
public class RelojController {

	@Autowired
	private IRelojRepository relojRepository;
	
	@GetMapping("/relojes")
	public String listarRelojes(Model model) {

		List<Reloj> relojes = relojRepository.findAll();
		model.addAttribute("relojes", relojes);
		return "lista-relojes";
	}
}
