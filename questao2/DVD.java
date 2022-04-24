package questao2;

public class DVD implements Produto{

	private String nome;
	private float preco;
	private float duracao;
	
	
	
	public DVD(String nome, float preco, float duracao) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.duracao = duracao;
	}

	@Override
	public String getNome() {
		return this.nome;
	}

	@Override
	public float getPreco() {
		return this.preco;
	}

	public float getDuracao() {
		return duracao;
	}

	@Override
	public String toString() {
		return "DVD [nome=" + nome + ", preco=" + preco + ", duracao=" + duracao + "]";
	}
	
	
}
