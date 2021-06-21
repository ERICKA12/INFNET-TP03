package dominio;

public class Alunos extends Pessoa {
	
	public float avaliacao01;
	public float avaliacao02;
	
	int totalNotas = 2;
	
	public Alunos() {
		this.setNome("Aluno fantasma");
	}
	
	
	public Alunos(String nome) {		
		this.nome = nome;
	}
	
public float calcularMediaFinal() {
	return (avaliacao01 + avaliacao02) / totalNotas;	
}

public String obterSituacao(float situacaoAluno) {
	if(situacaoAluno >= 7) {
		return "Aprovado";
	}
	
	else if (situacaoAluno >= 4 && situacaoAluno < 7) {
		return "Prova final";
	}
	
	else if (situacaoAluno < 4) {
		return "Reprovado";
	}
	
	return null; 
	
}

	public void imprimir() {
		
		float situacao = calcularMediaFinal();
		
		System.out.printf("Aluno: %s  \nNota da AV1: %.1f  \nNota da AV2: %.1f "
			+ " \nMédia final: %.1f \nSituação: %s\n",
			nome,
			avaliacao01, 
			avaliacao02,
			calcularMediaFinal(),
			obterSituacao(situacao));		
	}


	public float getAvaliacao01() {
		return avaliacao01;
	}


	public void setAvaliacao01(float avaliacao01) {
		this.avaliacao01 = avaliacao01;
	}


	public float getAvaliacao02() {
		return avaliacao02;
	}


	public void setAvaliacao02(float avaliacao02) {
		this.avaliacao02 = avaliacao02;
	}


	public int getTotalNotas() {
		return totalNotas;
	}


	public void setTotalNotas(int totalNotas) {
		this.totalNotas = totalNotas;
	}


	
}
