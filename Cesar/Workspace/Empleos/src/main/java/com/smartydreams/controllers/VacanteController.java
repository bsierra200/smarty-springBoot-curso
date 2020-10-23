package com.smartydreams.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.smartydreams.models.Vacante;
import com.smartydreams.service.iVacanteService;

@Controller
@RequestMapping("/vacantes")
public class VacanteController {
	
	@Autowired
	private iVacanteService serviceVacante;
	
	
	@GetMapping("/view/{id}")
	public String Detalle(@PathVariable("id")int idVacante, Model model) {
		Vacante vacante = serviceVacante.BuscarPorId(idVacante);
		model.addAttribute("vacante", vacante);
		
		return "home/detalle";
	}
	
	@GetMapping("/delete")
	public String eliminar(@RequestParam("id") int idVacante, Model model) {
		System.out.println("Borrando vacante con id: " + idVacante);
		model.addAttribute("id", idVacante);
		return "vacante/mensaje";
	}
}
