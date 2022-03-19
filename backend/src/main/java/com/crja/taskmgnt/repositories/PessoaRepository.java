package com.crja.taskmgnt.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crja.taskmgnt.entities.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
	
}
