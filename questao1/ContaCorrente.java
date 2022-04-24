package questao1;

public class ContaCorrente {

	private float saldo;

	public ContaCorrente(float saldo) {
		super();
		this.saldo = saldo;
	}
	
	public void depositar(float saldo) {
		this.saldo += saldo;
		System.out.printf("Depositado valor %f\n", saldo);
	}

	public void sacar(float valor) {
		this.saldo -= valor + (float)(valor * 0.005);
		System.out.printf("Sacado valor %.2f\n", valor);
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
}
