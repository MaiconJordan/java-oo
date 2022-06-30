
public class ContorleBonificacao {
	
	private double soma;
	
	public void registrar (Funcionario f) {
		double boni = f.getBonificacao();
		this.soma = this.soma + boni;
	}
	
	public double getSoma() {
		return soma;
	}

}
