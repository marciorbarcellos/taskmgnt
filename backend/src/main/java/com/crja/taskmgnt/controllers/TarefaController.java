package com.crja.taskmgnt.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.crja.taskmgnt.dto.TarefaDTO;
import com.crja.taskmgnt.services.TarefaService;

@RestControllerAdvice
@RequestMapping(value = "/tarefa")
public class TarefaController {
	
	@Autowired
	private TarefaService service;
	
	@GetMapping
	public Page<TarefaDTO> findAll(Pageable pageable) {
		return service.findAll(pageable);
	}
	
	@GetMapping(value = "/{id}")
	public TarefaDTO findById(@PathVariable Long id) {
		return service.findById(id);
	}
}
