package dominio;

public class Professor extends Pessoa{
	
	int matricula;
	String funcao;
	String disciplina;
	
	public Professor() {
		this.setNome("Professor fantasma");
	}
	
	public Professor(int matricula, String funcao, String disciplina) {
		this();
		this.matricula = matricula;
		this.funcao = funcao;
		this.disciplina = disciplina;
		}
	
	public void imprimir() {
		
		System.out.printf(nome + " é " +
				funcao + "(a) da disciplina de " + disciplina + ".\n");		
	}
	
	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}


	
}
