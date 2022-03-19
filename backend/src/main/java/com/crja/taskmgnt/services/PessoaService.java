package com.crja.taskmgnt.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.crja.taskmgnt.dto.PessoaDTO;
import com.crja.taskmgnt.entities.Pessoa;
import com.crja.taskmgnt.repositories.PessoaRepository;

@Service
public class PessoaService {
	
	@Autowired
	private PessoaRepository repository;
	
	@Transactional(readOnly = true)
	public Page<PessoaDTO> findAll(Pageable pageable) {
		Page<Pessoa> result = repository.findAll(pageable);
		Page<PessoaDTO> page = result.map(x -> new PessoaDTO(x));
		return page;
	}
	
	@Transactional(readOnly = true)
	public PessoaDTO findById(Long Id) {
		Pessoa result = repository.findById(Id).get();
		PessoaDTO dto = new PessoaDTO(result);
		return dto;
	}

}
