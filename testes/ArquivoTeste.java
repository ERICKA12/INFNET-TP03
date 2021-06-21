package testes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ArquivoTeste {
	public static void main(String[] args) {
		
	try {
		String diretorio = "C:\\INFNET\\JAVA\\JAVA FUNDAMENTOS\\AT_JAVA";
		String arquivo = "\\alunos.txt";
		
		try {		
			FileReader file = new FileReader(diretorio+arquivo);
			BufferedReader leitura = new BufferedReader(file);
			String linha = leitura.readLine();
			
			while(linha != null) {
				System.out.println(linha);
				linha = leitura.readLine();
			}
			file.close();
			leitura.close();
			
			System.out.println(linha);
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
	} finally {
		System.out.println("Processamento finalizado!");
			
		}
	}


}
