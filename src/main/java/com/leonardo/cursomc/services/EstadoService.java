package com.leonardo.cursomc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leonardo.cursomc.domain.Cliente;
import com.leonardo.cursomc.domain.Estado;
import com.leonardo.cursomc.repositories.EstadoRepository;
import com.leonardo.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class EstadoService {
	@Autowired
	private EstadoRepository repo;
	
	public List<Estado> findAll() {
		List<Estado> estados = repo.findAllByOrderByNome();
		return estados;
		
	}
	
}
