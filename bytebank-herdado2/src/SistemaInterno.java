
public class SistemaInterno {
	
	private int senha = 2222;
	
	public void autentica(FuncionarioAutenticavel f) {
		boolean autentica = f.autentica(this.senha);
		if(autentica) {
			System.out.println("Entrou no sistema");
		} else {
			System.out.println("Nao entrou no sistema");
		}
	}

}
