package testes;

import java.util.Arrays;

import dominio.Alunos;

public class StringEstagarioTeste {
	public static void main(String[] args) {
			
		String[] aluno = args[0].split(";");
		System.out.println(Arrays.asList(aluno));
		
		Alunos alunos = new Alunos();
						
		alunos.setNome(aluno[0]);
						
		alunos.setAvaliacao01(Integer.valueOf(aluno[1]));

		alunos.setAvaliacao02(Integer.valueOf(aluno[2]));
		
		alunos.imprimir();	
		
	}

}
