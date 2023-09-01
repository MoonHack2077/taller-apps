package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.models.Fruta;
import com.example.demo.repository.IFrutaRepository;

@Controller
@RequestMapping("/fruta")
public class FrutaController {

	@Autowired
	private IFrutaRepository frutaRepository;
	
	@GetMapping("/frutas")
	public String listaFrutas(Model model) {

		List<Fruta> frutas = frutaRepository.findAll();
		model.addAttribute("frutas", frutas);
		return "lista-frutas";
	}
}
