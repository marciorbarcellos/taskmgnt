package com.crja.taskmgnt.dto;

import com.crja.taskmgnt.entities.Pessoa;

public class PessoaDTO {
	
	private Long id;
	private String nome;
	private String departamento;
	
	public PessoaDTO() {
	}

	public PessoaDTO(Long id, String nome, String departamento) {
		this.id = id;
		this.nome = nome;
		this.departamento = departamento;
	}
	
	public PessoaDTO(Pessoa pessoa) {
		id = pessoa.getId();
		nome = pessoa.getNome();
		departamento = pessoa.getDepartamento();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
}
