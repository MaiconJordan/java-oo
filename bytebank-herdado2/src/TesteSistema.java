
public class TesteSistema {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Gerente g = new Gerente();
		
		g.setSenha(2222);
		
		SistemaInterno sys = new SistemaInterno();
		
		sys.autentica(g);

	}

}
