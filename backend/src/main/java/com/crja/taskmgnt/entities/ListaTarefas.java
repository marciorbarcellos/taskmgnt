package com.crja.taskmgnt.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_listaTarefas")
public class ListaTarefas {
	
	@EmbeddedId
	private ListaTarefaPK id = new ListaTarefaPK();
	
	private String descricao;
	
	public ListaTarefas() {
	}
	
	public void setPessoa(Pessoa pessoa) {
		id.setPessoa(pessoa);
	}
	
	public void setTarefa(Tarefa tarefa) {
		id.setTarefa(tarefa);
	}

	public ListaTarefaPK getId() {
		return id;
	}

	public void setId(ListaTarefaPK id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
