package com.smartydreams.service;

import java.util.List;

import com.smartydreams.models.Vacante;

public interface iVacanteService {
	List<Vacante>buscarTodos();
	Vacante BuscarPorId(Integer idVacante);
}
