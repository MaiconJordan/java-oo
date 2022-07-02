
public class TesteSistema {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Gerente g = new Gerente();
		
		g.setSenha(2222);
		g.setNome("gerente lele");
		
		Administrador a = new Administrador();
		
		a.setSenha(3333);
		a.setCpf("999222338844");
		
		SistemaInterno sys = new SistemaInterno();
		
		sys.autentica(g);
		sys.autentica(a);
		
		
	}

}
