
public class ContaPrograma {

	public static void main(String[] args) {
		
		Conta conta = new Conta(122, 3300);
		
		conta.deposita(1000);
		
		Cliente maicon = new Cliente();
		
		conta.setTitular(maicon);
		
		maicon.setCPF("99999");
		
		System.out.println(conta.getTitular().getCPF());
		
		conta.getTitular().setProfissao("Programador");
		
	
		
		
		// nova conta com construtor
		
		Conta conta1 = new Conta(0, 33001);
		
		conta1.deposita(100);
		
		
		
		
		
	
	}

}
