package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.models.Libro;
import com.example.demo.repository.ILibroRepository;

@Controller
@RequestMapping("/libro")
public class LibroController {

	@Autowired
	private ILibroRepository libroRepository;
	
	@GetMapping("/libros")
	public String listarLibros(Model model) {

		List<Libro> libros = libroRepository.findAll();
		model.addAttribute("libros", libros);
		return "lista-libros";
	}
}
