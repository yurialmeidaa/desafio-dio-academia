package br.com.desafio.dominio;

import java.util.HashSet;
import java.util.Set;

public class Atividade {

	private String nome;
	private String horario;
	
	private Set<Aluno> alunosInscritos = new HashSet<>();
	private Set<Professor> professorApto = new HashSet<>();

	
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public Set<Professor> getProfessorApto() {
		return professorApto;
	}

	public void setProfessorApto(Set<Professor> professorApto) {
		this.professorApto = professorApto;
	}

	public Set<Aluno> getAlunosInscritos() {
		return alunosInscritos;
	}

	public void setAlunosInscritos(Set<Aluno> alunosInscritos) {
		this.alunosInscritos = alunosInscritos;
	}

	@Override
	public String toString() {
		return "Atividade [nome=" + nome + "";
	}

	
	
	
}
