package dominio;

public abstract class Pessoa {
	
	public String nome;


//construtor1
public Pessoa () {
	nome = "Pessoa fantasma";
	}
		
//construtor2
public Pessoa (String nome, String funcao) {
	this.nome = nome;
	}


public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public void imprimir(){
	System.out.println(this.getNome());

	}

}
