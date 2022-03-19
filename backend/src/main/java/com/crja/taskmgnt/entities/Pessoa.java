package com.crja.taskmgnt.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_pessoa")
public class Pessoa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPessoa;
	private String nome;
	private String departamento;

	public Pessoa() {
	}

	public Pessoa(Long idPessoa, String nome, String departamento) {
		this.idPessoa = idPessoa;
		this.nome = nome;
		this.departamento = departamento;
	}

	public Long getId() {
		return idPessoa;
	}

	public void setId(Long id) {
		this.idPessoa = id;
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

	@Override
	public String toString() {
		return "Pessoa [id=" + idPessoa + ", nome=" + nome + ", departamento=" + departamento + "]";
	}

}
