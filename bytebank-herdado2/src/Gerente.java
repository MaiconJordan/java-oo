public class Gerente extends Funcionario {

	@Override
	public double getBonificacao() {
		System.out.println("chamou o gerente");
		return super.getSalario();
	}

}