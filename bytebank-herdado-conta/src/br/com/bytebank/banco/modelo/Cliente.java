package br.com.bytebank.banco.modelo;

/**
* Classe que representa um cliente no Bytebank.
*
*@author Payza
*@version 0.1
*/
public class Cliente {
	
	private String nome;
	private String CPF;
	private String Profissao;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getProfissao() {
		return Profissao;
	}

	public void setProfissao(String profissao) {
		Profissao = profissao;
	}

}
