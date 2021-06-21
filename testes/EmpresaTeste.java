package testes;

import dominio.Empresa;
import exceptions.FaturamentoNegativoException;
import exceptions.NomeIncompletoException;

public class EmpresaTeste {
	public static void main(String[] args) {
		
		try {
			
		try {
			Empresa empresa1 = new Empresa();		
			empresa1.setNome("programação ORIENTADA a objetos");		
			empresa1.setFaturamento(1000);
			empresa1.imprimir();
			
		} catch (NomeIncompletoException | FaturamentoNegativoException e) {
			System.out.println("Erro emp1: " + e.getMessage());
		}
		
		try {		
		Empresa empresa2 = new Empresa();		
		empresa2.setNome("java store");
		empresa2.setFaturamento(-100);
		empresa2.imprimir();		
		} catch (NomeIncompletoException | FaturamentoNegativoException e) {
			System.out.println("Erro emp2: " + e.getMessage());
		}
		
	
		try {
		Empresa empresa3 = new Empresa();
		empresa3.setFaturamento(3000);
		empresa3.imprimir();
		} catch (NomeIncompletoException | FaturamentoNegativoException e) {
			System.out.println("Erro emp3: " + e.getMessage());
		}
	} finally {
		System.out.println("Finalizamos!");
	}
		
	}

}
