package questao1;

public class App {

	public static void main(String[] args) {
		
		System.out.println("\nCliente normal : ------");
		ContaCorrente contaNormal = new ContaCorrente(100);
		System.out.println("Valor da conta: " + contaNormal.getSaldo());
		contaNormal.sacar(50);
		System.out.println("Valor da conta: " + contaNormal.getSaldo());
		
		System.out.println("\nCliente espeical : ------");
		ContaCorrenteClienteEspecial contaEspecial = new ContaCorrenteClienteEspecial(100);
		System.out.println("Valor da conta: " + contaEspecial.getSaldo());
		contaEspecial.sacar(50);
		System.out.println("Valor da conta: " + contaEspecial.getSaldo());
	}
	
}
