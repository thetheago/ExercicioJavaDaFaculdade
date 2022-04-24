package questao2;

public class Livro implements Produto{

	private String nome;
	private float preco;
	private String autor;
	
	
	
	public Livro(String nome, float preco, String autor) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.autor = autor;
	}

	@Override
	public String getNome() {
		return this.nome;
	}

	@Override
	public float getPreco() {
		return this.preco;
	}

	public String getAutor() {
		return autor;
	}

	@Override
	public String toString() {
		return "Livro [nome=" + this.nome + ", preco=" + this.preco + ", autor=" + this.autor + "]";
	}
	

	
}
