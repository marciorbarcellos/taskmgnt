package com.crja.taskmgnt.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.crja.taskmgnt.dto.TarefaDTO;
import com.crja.taskmgnt.entities.Tarefa;
import com.crja.taskmgnt.repositories.TarefaRepository;

@Service
public class TarefaService {
	
	@Autowired
	private TarefaRepository repository;
	
	@Transactional(readOnly = true)
	public Page<TarefaDTO> findAll(Pageable pageable) {
		Page<Tarefa> result = repository.findAll(pageable);
		Page<TarefaDTO> page = result.map(x -> new TarefaDTO(x));
		return page;
	}
	
	@Transactional(readOnly = true)
	public TarefaDTO findById(Long Id) {
		Tarefa result = repository.findById(Id).get();
		TarefaDTO dto = new TarefaDTO(result);
		return dto;
	}

}
