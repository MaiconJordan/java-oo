package com.classes;

public class ContaPrograma {

	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		
		primeiraConta.deposita(1000);
		
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saca(500);
		
		System.out.println(primeiraConta.saldo);
		
		
		// Segunda conta
		
		Conta segundaConta = new Conta();
		
		segundaConta.deposita(2000);
		
		segundaConta.transfere(500, primeiraConta);
		
		System.out.println(primeiraConta.saldo);
		 
		
	}

}
