package br.com.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Set;

public class Professor extends Pessoa {

	
	private Set<Atividade> atividadeLeciona =  new LinkedHashSet<>();

	
	
	
	public Set<Atividade> getAtividadeLeciona() {
		return atividadeLeciona;
	}

	public void setAtividadeLeciona(Set<Atividade> atividadeLeciona) {
		this.atividadeLeciona = atividadeLeciona;
	}

	@Override
	public String toString() {
		return "Professor [Matricula=" + getMatricula() + ", Nome=" + getNome() + ", Cpf=" + getCpf()
				+ ", Data Nascimento=" + getDataNascimento() + ", Atividades Leciona=" + atividadeLeciona
				+ "]";
	}
	
	
	
	
}
