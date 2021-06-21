package dominio;

import exceptions.FaturamentoNegativoException;
import exceptions.NomeIncompletoException;

public class Empresa {
			
		private String nome;
		private String sobrenome;
		private String ultimoNome;
		private float faturamento;
		
		public void imprimir() throws NomeIncompletoException{			
		System.out.println(this.getNome());
	}	
		//stringbuilder:
		public StringBuilder getNome() throws NomeIncompletoException {
			
			if(ultimoNome == null || nome == null || sobrenome == null) {
				throw new NomeIncompletoException("Preenchimento inválido!");
			}
			
			StringBuilder nm = new StringBuilder(); {
	
			nm.append(ultimoNome.toUpperCase().charAt(0));
			nm.append(".");
			nm.append(",");
			nm.append(" ");
			nm.append(nome.toUpperCase());
			nm.append(" ");			
			nm.append(sobrenome.toLowerCase());
			
			return nm;
				}
		}
			

		public void setNome(String nome) {
			
			int posicaoInicial = nome.indexOf(" ");
			int posicaoFinal = nome.lastIndexOf(" ");
				
			
			this.nome = nome.substring(0, posicaoInicial);
			this.sobrenome = nome.substring(posicaoInicial, posicaoFinal).trim();
			this.ultimoNome = nome.substring(posicaoFinal).trim();

		}
		public float getFaturamento() {
			return faturamento;
		}
		public void setFaturamento(float faturamento) throws FaturamentoNegativoException {
			
			if(faturamento < 0 ) {
			throw new FaturamentoNegativoException("O faturamento está negativo!");
			}
			
			this.faturamento = faturamento;
		}
			
}
