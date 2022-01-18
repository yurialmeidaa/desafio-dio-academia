package br.com.desafio;

import br.com.desafio.dominio.Academia;
import br.com.desafio.dominio.Aluno;
import br.com.desafio.dominio.Atividade;
import br.com.desafio.dominio.Professor;

public class Main {

	public static void main(String[] args) {

		Academia academia = new Academia();
		Aluno aluno = new Aluno();
		Atividade atividade = new Atividade();
		Professor professor = new Professor();
		
		Aluno aluno2 = new Aluno();
		Atividade atividade2 = new Atividade();
		Professor professor2 = new Professor();
		
		aluno2.setNome("Clara");
		aluno2.setAltura(1.65);
		aluno2.setPeso(56);
		aluno2.setCpf("22222222");
		aluno2.setMatricula("00003");
		
		
		atividade.setNome("Musculação");
		atividade.setHorario("18:00");
		atividade.getProfessorApto().add(professor);
		atividade.getAlunosInscritos().add(aluno);
		atividade.getAlunosInscritos().add(aluno2);
		
		atividade2.setNome("Crossfit");
		atividade2.setHorario("20:00");
		atividade2.getProfessorApto().add(professor2);
		atividade2.getAlunosInscritos().add(aluno2);
		atividade2.getAlunosInscritos().add(aluno);
		
		professor2.setNome("João");
		professor2.setCpf("11122313");
		professor2.setDataNascimento("16/02/1992");
		professor2.setMatricula("01223");
		professor2.getAtividadeLeciona().add(atividade2);
		
		
		
		
		
		
		
		
		
		
		aluno.setNome("Yuri");
		aluno.setAltura(1.82);
		aluno.setPeso(92);
		aluno.setCpf("11111111111");
		aluno.setDataNascimento("17/09/1998");
		aluno.setMatricula("00001");
		aluno.getAtividadeMatriculadas().add(atividade);
		
		professor.setNome("Maria");
		professor.setCpf("1111111122");
		professor.setDataNascimento("18/08/1998");
		professor.setMatricula("00002");
		professor.getAtividadeLeciona().add(atividade);
		
		
		
		academia.getAlunosMatriculados().add(aluno);
		academia.getAlunosMatriculados().add(aluno2);
        academia.getProfessores().add(professor);
        academia.getProfessores().add(professor2);
        academia.getAtividades().add(atividade);
        academia.getAtividades().add(atividade2);
		
		
System.out.println();
	}

}
