package questao1;

public class ContaCorrenteClienteEspecial extends ContaCorrente{

	public ContaCorrenteClienteEspecial(float saldo) {
		super(saldo);
	}
	
	@Override
	public void sacar(float valor) {
		setSaldo(getSaldo() - (valor + (float)(valor * 0.001)));
		System.out.printf("Sacado valor %.2f\n", valor);
	}
	
}
