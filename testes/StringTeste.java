package testes;

import java.util.Arrays;

public class StringTeste {
	public static void main(String[] args) {
		
		String[] texto = new String[3];
		char[] javadev = {'J', 'a', 'v', 'a'};
		
		texto[0] = new String();
		texto[1] = new String("Ericka");
		texto[2] = new String(javadev);	
		
		//1
//		
//		for(String t: texto) {
//			System.out.println("- " + t);
//		}
		
		//2
		
//		String nome = texto[1];
//		
//		if(nome.equals(texto[1])) {
//			System.out.println("iguais!");
//			
//		} else {
//			System.out.println("diferentes!");
//		}
//		
		//3
		
//		String nome = texto[1];
//		System.out.println(nome);
//		System.out.println(nome.charAt(5));
//		
		//4
//		String nome = texto[1];
//		String nomeUp = nome.toUpperCase();
//		String nomeLow = nome.toLowerCase();
//		
//		System.out.println("nome: " + nome);
//		System.out.println("nome: " + nomeUp);
//		System.out.println("nome: " + nomeLow);
//		
//		
//		if(nome.equalsIgnoreCase(nomeUp)) {
//			System.out.println("==");
//		} else {
//			System.out.println("!=");
//		}
		
		
		//5
//		String nome = texto[1];
//		
//		String aEricka = "a"+nome;
//		String oEricka = "o"+nome;
//		
//		System.out.println("A: " + aEricka);
//		System.out.println("O: " + oEricka);
//		
//		System.out.println(aEricka.compareTo(oEricka));
		
		
		//Metodo StartsWith		
		String nome = texto[1];
	//	System.out.println(nome.startsWith("Eri"));
	//	System.out.println(nome.endsWith("cka"));
		
		
		//Metodo IndexOf:		
	//	System.out.println(nome.indexOf("e"));
	//	System.out.println(nome.lastIndexOf("cka"));
		
		//Metodo Substring
		System.out.println(nome);
		System.out.println(nome.substring(5));
		
		//ta pegando da posicao 3 até a posicao 5:
		System.out.println(nome.substring(3,5)); 
		
		//Metodo Concat
		System.out.println(nome);
		System.out.println(("Professor ".concat(nome)));
		
		//E-Oliveira
		String primeiraLetra = nome.substring(0,1);
		String separador = "-";
		String sobrenome = "Oliveira";
		System.out.println(primeiraLetra.concat(separador).concat(sobrenome));
		
		//Metodo Trim:
		
		String primeiroNome = " Ericka  ";
		String ultimoNome = " Oliveira  ";
		System.out.println(primeiroNome.trim());
		System.out.println(ultimoNome.trim());
		
		String nomeCompleto = primeiroNome.trim().concat(ultimoNome).trim();	
		//System.out.println(nomeCompleto);
		
		
		//Metodo Replace:		
		System.out.println(nomeCompleto);
		//substituí as letras "e" por "a
		System.out.println(nomeCompleto.toLowerCase().replace('e', 'a'));
		// substituiu a primeira ocorrencia da letra 'e' pela letra 'x':
		System.out.println(nomeCompleto.replaceFirst("e", "x")); 
		
		
		// Metodo Split:
		
		String nomeCompleto2 = "Ericka C. de Souza Oliveira";
		System.out.println(Arrays.toString(nomeCompleto2.split(" ")));
		
		
		
	}

}
