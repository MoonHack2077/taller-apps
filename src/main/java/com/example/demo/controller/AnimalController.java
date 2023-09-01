package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.models.Animal;
import com.example.demo.repository.IAnimalRepository;

@Controller
@RequestMapping("/animal")
public class AnimalController {
	
	@Autowired
	private IAnimalRepository animalRepository;
	
	@GetMapping("/animales")
	public String listarAnimales(Model model) {
		
		List<Animal> animales = animalRepository.findAll();
		model.addAttribute("animales", animales);
		return "lista-animales";
	}
}
