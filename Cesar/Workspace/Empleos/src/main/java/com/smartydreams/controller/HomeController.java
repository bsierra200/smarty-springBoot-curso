package com.smartydreams.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/home")
	public String mostrarHome(Model model) {
		//model.addAttribute("mensaje", "Hola Mundo 2");
		
		String nombre="Ingenieria en Sistemas";
		Date fechaPub = new Date();
		double salario = 12000.00;
		boolean vigente = true;
		
		model.addAttribute("Nombre", nombre);
		model.addAttribute("Fecha", fechaPub);
		model.addAttribute("Salario", salario);
		model.addAttribute("Vigente", vigente);
		
		
		return "home/home";
	}
}
