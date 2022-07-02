public class Gerente extends FuncionarioAutenticavel {

	@Override
	public double getBonificacao() {
		System.out.println("chamou o gerente");
		return super.getSalario();
	}

}