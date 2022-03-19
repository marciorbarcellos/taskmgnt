package com.crja.taskmgnt.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crja.taskmgnt.entities.Tarefa;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
	
}
