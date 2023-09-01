package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.models.Planeta;
import com.example.demo.repository.IPlanetaRepository;

@Controller
@RequestMapping("/planeta")
public class PlanetaController {

	@Autowired
	private IPlanetaRepository planetaRepository;
	
	@GetMapping("/planetas")
	public String listarPlanetas(Model model) {

		List<Planeta> planetas = planetaRepository.findAll();
		model.addAttribute("planetas", planetas);
		return "lista-planetas";
	}
}
