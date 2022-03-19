package com.crja.taskmgnt.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_tarefa")
public class Tarefa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idTarefa;
	private String titulo;
	private String descricao;
	private String prazo;
	private String departamento;
	private Double duracao;
	private String pessoaAlocada;
	private Boolean status;
	
	public Tarefa() {
	}

	public Tarefa(Long idTarefa, String titulo, String descricao, String prazo, String departamento, Double duracao,
			String pessoaAlocada, Boolean status) {
		this.idTarefa = idTarefa;
		this.titulo = titulo;
		this.descricao = descricao;
		this.prazo = prazo;
		this.departamento = departamento;
		this.duracao = duracao;
		this.pessoaAlocada = pessoaAlocada;
		this.status = status;
	}

	public Long getidTarefa() {
		return idTarefa;
	}

	public void setIdTarefa(Long idTarefa) {
		this.idTarefa = idTarefa;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getdescricao() {
		return descricao;
	}

	public void setdescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getPrazo() {
		return prazo;
	}

	public void setPrazo(String prazo) {
		this.prazo = prazo;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public Double getduracao() {
		return duracao;
	}

	public void setduracao(Double duracao) {
		this.duracao = duracao;
	}

	public String getPessoaAlocada() {
		return pessoaAlocada;
	}

	public void setPessoaAlocada(String pessoaAlocada) {
		this.pessoaAlocada = pessoaAlocada;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Tarefa [idTarefa=" + idTarefa + ", titulo=" + titulo + ", descricao=" + descricao + ", prazo=" + prazo
				+ ", departamento=" + departamento + ", duracao=" + duracao + ", pessoaAlocada=" + pessoaAlocada
				+ ", status=" + status + "]";
	}
	
}
