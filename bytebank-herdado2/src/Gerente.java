public class Gerente extends Funcionario implements Autenticavel {
	
	private AutenticacaoUtil autentica;
	
	public Gerente() {
		this.autentica = new AutenticacaoUtil();
	}
	
	@Override
	public double getBonificacao() {
		System.out.println("chamou o gerente");
		return super.getSalario();
	}
	
	@Override
	public void setSenha(int senha) {
		this.autentica.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.autentica.autentica(senha);
	}

}