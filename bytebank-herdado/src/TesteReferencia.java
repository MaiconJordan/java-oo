
public class TesteReferencia {
	
	public static void main(String[] args) {
		
		Funcionario f = new Funcionario();
		
		f.setSalario(1000);
		
		Gerente g = new Gerente();
		
		g.setSalario(5000);
		
		Editor e = new Editor();
		
		e.setSalario(3000);
		
		
		ContorleBonificacao controle = new ContorleBonificacao();
		
		controle.registrar(e);
		controle.registrar(f);
		
		
		
	}

}
