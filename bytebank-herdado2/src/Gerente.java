public class Gerente extends Funcionario implements Autenticavel {

	private int senha;
	
	@Override
	public double getBonificacao() {
		System.out.println("chamou o gerente");
		return super.getSalario();
	}
	
	@Override
	public void setSenha(int senha) {
		this.senha = senha;
	}

	@Override
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		}
		return false;
	}

}