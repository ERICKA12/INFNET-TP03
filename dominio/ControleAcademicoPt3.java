package dominio;

import java.util.Scanner;


public class ControleAcademicoPt3 {
	
	private static Pessoa[] pessoas;
	
	private static int index;
	
	private static final int QTDE = 100;
	
	
		
	
public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		pessoas = new Pessoa[QTDE];
		
		String opcaoDeMenu = null;
		
		int posicao = 0;
		
		
		do {
			System.out.println("[1] Cadastrar aluno(a)"); 
			System.out.println("[2] Cadastrar professor(a)");
			System.out.println("[3] Consultar pessoas cadastradas");
			System.out.println("[4] Exibir lista de todas as pessoas cadastradas");
			System.out.println("[5] Sair"); 
			
			System.out.print("Informe a opção desejada: ");
			
			opcaoDeMenu = in.next();
			
			switch (opcaoDeMenu) {
			case "1":
				if(index < QTDE) {
					
					Alunos aluno = new Alunos();
										
					System.out.println("Informe o nome do aluno: ");					
					aluno.setNome(in.next());
									
					System.out.println("Informe a nota da avaliacao 01: ");
					aluno.setAvaliacao01(in.nextFloat());
	
					System.out.println("Informe a nota da avaliacao 02: ");
					aluno.setAvaliacao02(in.nextFloat());
					
					pessoas[index] = aluno;
					
					System.out.println("Cadastro realizado com sucesso. Os dados do aluno são: ");
					((Alunos) pessoas[index]).imprimir();	
					
					index++;
					
				} else {
					System.out.println("Não é possível realizar novos cadastros. Escolha outra opção.");
				}
				
				break;
				
			case "2":
				if(index < QTDE) {
					
					Professor professor = new Professor();
					
					System.out.println("Informe o nome: ");					
					professor.setNome(in.next());
					
					System.out.println("Informe a função: ");
					professor.setFuncao(in.next());
					
					System.out.println("Informe a disciplina do semestre : ");
					professor.setDisciplina(in.next());
					
					pessoas[index] = professor;
					
					System.out.println("Professor cadastrado com sucesso: ");
					((Professor) pessoas[index]).imprimir();	
					
					index++;
					
				} else {
					System.out.println("Não é possível realizar novos cadastros. Escolha outra opção.");
				}
				
				break;			
				
			//"[4] Consultar uma pessoa cadastrada":	
			case "3":
				System.out.println("Informe a posicao: ");
				posicao = in.nextInt();
				
				if (posicao >= 0 && posicao < index ) {
					pessoas[posicao].imprimir();
				}
				
				//imprimirLista();
				break;
								
			case "4":				
				imprimirLista();
				break;
									
			case "5":
				System.out.println("Finalizou!");
				break;			
	
			default:
				System.out.println("Opção inválida!");
				break;
			}
					
		} 
		
		while (!opcaoDeMenu.equals("5"));
		
		in.close();
	}


public static void imprimirLista() {
	System.out.println("Lista de pessoas cadastradas: ");
	for (int i = 0; i < index; i++) {
		pessoas[i].imprimir();
		}
	}
}

