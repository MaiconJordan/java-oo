package br.com.bytebank.banco.modelo;

public class ContaCorrente extends Conta {

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}

	
	
	@Override
	public void saca(double valor) {
		double valorSacar = valor + 0.2;
		super.saca(valorSacar);
	}



	@Override
	public void deposita(double valor) {
		super.saldo += valor;
		
	}
}
