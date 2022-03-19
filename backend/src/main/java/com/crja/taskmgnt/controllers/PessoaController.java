package com.crja.taskmgnt.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.crja.taskmgnt.dto.PessoaDTO;
import com.crja.taskmgnt.services.PessoaService;

@RestControllerAdvice
@RequestMapping(value = "/pessoa")
public class PessoaController {
	
	@Autowired
	private PessoaService service;
	
	@GetMapping
	public Page<PessoaDTO> findAll(Pageable pageable) {
		return service.findAll(pageable);
	}
	
	@GetMapping(value = "/{id}")
	public PessoaDTO findById(@PathVariable Long id) {
		return service.findById(id);
	}
}
