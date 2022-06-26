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
		 
		
		// relação entre classes
		
		System.out.println("------------- RELAÇÃO ENTRE CLASSES --------------");
		
		Conta contaMaicon = new Conta();
		
		contaMaicon.deposita(2500);
		
		contaMaicon.titular = new Cliente();
		
		// relacionando um clinete diretamente no atributo titular sem criar o objeto Cliente
		contaMaicon.titular.nome = "Maicon";		
		
		System.out.println(contaMaicon.titular.nome);
				
		
		// Crianta objeto de cliente e conta
		
		Conta contaSabrine = new Conta();
		
		contaSabrine.deposita(1000);
		
		Cliente sabrine = new Cliente();
		
		sabrine.nome = "Sabrine";
		
		contaSabrine.titular = sabrine;
		
		System.out.println(contaSabrine.titular.nome);
		
		
		
		
	}

}
