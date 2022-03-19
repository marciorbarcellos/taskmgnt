package com.crja.taskmgnt.dto;

import com.crja.taskmgnt.entities.Tarefa;

public class TarefaDTO {
	
	private Long idTarefa;
	private String titulo;
	private String descricao;
	private String prazo;
	private String departamento;
	private Double duracao;
	private String pessoaAlocada;
	private Boolean status;

	public TarefaDTO() {
	}

	public TarefaDTO(Long idTarefa, String titulo, String descricao, String prazo, String departamento, Double duracao,
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
	
	public TarefaDTO(Tarefa tarefa) {
		idTarefa = tarefa.getidTarefa();
		titulo = tarefa.getTitulo();
		descricao = tarefa.getdescricao();
		prazo = tarefa.getPrazo();
		departamento = tarefa.getDepartamento();
		duracao = tarefa.getduracao();
		pessoaAlocada = tarefa.getPessoaAlocada();
		status = tarefa.getStatus();
	}

	public Long getIdTarefa() {
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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
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

	public Double getDuracao() {
		return duracao;
	}

	public void setDuracao(Double duracao) {
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
		return "TarefaDTO [idTarefa=" + idTarefa + ", titulo=" + titulo + ", descricao=" + descricao + ", prazo="
				+ prazo + ", departamento=" + departamento + ", duracao=" + duracao + ", pessoaAlocada=" + pessoaAlocada
				+ ", status=" + status + "]";
	}

}
