
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario maicon = new Funcionario();
		
		maicon.setNome("Maicon");
		maicon.setSalario(3500.00);
		
		System.out.println(maicon.getBonificacao());
		
		
		
		
		Gerente g1 = new Gerente();
		
		g1.setNome("Kenzo");
		g1.setCpf("999999-9");
		g1.setSalario(7000.00);
		
		g1.setSenha(1234);		
		boolean senha = g1.autentica(1234);
		
		System.out.println(senha);
		System.out.println(g1.getBonificacao());
		
		
		
	}
}
