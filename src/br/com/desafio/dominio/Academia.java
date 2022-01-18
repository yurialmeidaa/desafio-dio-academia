package br.com.desafio.dominio;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Academia {

	private Set<Aluno> alunosMatriculados = new HashSet<>();
	private Set<Professor> professores = new HashSet<>();
	private Set<Atividade> atividades = new HashSet<>();

	public Set<Aluno> getAlunosMatriculados() {
		return alunosMatriculados;
	}

	public void setAlunosMatriculados(Set<Aluno> alunosMatriculados) {
		this.alunosMatriculados = alunosMatriculados;
	}

	public Set<Professor> getProfessores() {
		return professores;
	}

	public void setProfessores(Set<Professor> professores) {
		this.professores = professores;
	}

	public Set<Atividade> getAtividades() {
		return atividades;
	}

	public void setAtividades(Set<Atividade> atividades) {
		this.atividades = atividades;
	}

	@Override
	public String toString() {
		return "Academia [alunosMatriculados=" + alunosMatriculados + ", professores=" + professores + ", atividades="
				+ atividades + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((alunosMatriculados == null) ? 0 : alunosMatriculados.hashCode());
		result = prime * result + ((atividades == null) ? 0 : atividades.hashCode());
		result = prime * result + ((professores == null) ? 0 : professores.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Academia other = (Academia) obj;
		if (alunosMatriculados == null) {
			if (other.alunosMatriculados != null)
				return false;
		} else if (!alunosMatriculados.equals(other.alunosMatriculados))
			return false;
		if (atividades == null) {
			if (other.atividades != null)
				return false;
		} else if (!atividades.equals(other.atividades))
			return false;
		if (professores == null) {
			if (other.professores != null)
				return false;
		} else if (!professores.equals(other.professores))
			return false;
		return true;
	}

}
