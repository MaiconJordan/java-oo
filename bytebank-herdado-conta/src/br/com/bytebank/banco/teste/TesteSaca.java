package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteSaca {
	
	public static void main(String[] args) {
		
		Conta conta = new ContaCorrente(123, 22222);
		
		
		conta.deposita(200.0);
		conta.saca(290.0);
		
		
		System.out.println(conta.getSaldo());
	}

}
