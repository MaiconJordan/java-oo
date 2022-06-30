
public class TesteReferencia {
	
	  public static void main(String[] args) {
	
    Gerente g1 = new Gerente();
    g1.setNome("Marcos");
    g1.setSalario(5000.0);
    

    Designer d = new Designer();
    

    ContorleBonificacao controle = new ContorleBonificacao();
    controle.registrar(g1);
    controle.registrar(d);

    System.out.println(controle.getSoma());

		
		
		
	}

}
