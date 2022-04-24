package questao2;

public class CD implements Produto{

	private String nome;
	private float preco;
	private int numFaixas;
	
	public CD(String nome, float preco, int numFaixas) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.numFaixas = numFaixas;
	}

	@Override
	public String getNome() {
		return this.nome;
	}

	@Override
	public float getPreco() {
		return this.preco;
	}

	public int getNumFaixas() {
		return numFaixas;
	}
	
	@Override
	public String toString() {
		return "CD [nome=" + nome + ", preco=" + preco + ", numFaixas=" + numFaixas + "]";
	}

	
}
