package br.com.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Set;

public class Aluno extends Pessoa {

	private double peso;
	private double altura;
	
	private Set<Atividade> atividadeMatriculadas = new LinkedHashSet<>();
	
	
	
	
	
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public Set<Atividade> getAtividadeMatriculadas() {
		return atividadeMatriculadas;
	}
	public void setAtividadeMatriculadas(Set<Atividade> atividadeMatriculadas) {
		this.atividadeMatriculadas = atividadeMatriculadas;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(altura);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((atividadeMatriculadas == null) ? 0 : atividadeMatriculadas.hashCode());
		temp = Double.doubleToLongBits(peso);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Aluno other = (Aluno) obj;
		if (Double.doubleToLongBits(altura) != Double.doubleToLongBits(other.altura))
			return false;
		if (atividadeMatriculadas == null) {
			if (other.atividadeMatriculadas != null)
				return false;
		} else if (!atividadeMatriculadas.equals(other.atividadeMatriculadas))
			return false;
		if (Double.doubleToLongBits(peso) != Double.doubleToLongBits(other.peso))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Aluno [\" Matricula\" " + getMatricula()  + " Nome=" + getNome() + ", altura=" + altura + ", atividadeMatriculadas=" + atividadeMatriculadas
				+ ", Peso=" + peso +  "]";
	}
	
	
	
	
}
