
public abstract class Conta {

	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;

	public Conta(int agencia, int numero) {
		Conta.total++;
		if (agencia > 0) {
			this.agencia = agencia;
		} else {
			System.out.println("numero de conta invalida");
		}
		this.numero = numero;
	}

	public abstract void deposita(double valor);

	public void saca(double valor) {
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo: " + ", Valor: " + valor);		
		}
		this.saldo -= valor;	
	}

	public void transfere(double valor, Conta destino) {
		this.saca(valor);
		destino.deposita(valor);
	}

	public double getSaldo() {
		return saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public static int getTotal() {
		return Conta.total;
	}

}
