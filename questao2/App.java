package questao2;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {

		ArrayList<Produto> produtos = new ArrayList<Produto>();
		
		Livro livro1 = new Livro("Perci Jackson e o Ladrão de raios", 1300, "Jonathan");
		Livro livro2 = new Livro("The Promissed Neverland", 80, "Jonathan");
		CD cd1 = new CD("Musicas banda dejavu", 300, 70);
		DVD dvd1 = new DVD("O procurado", 0, 140);
		DVD dvd2 = new DVD("O hobbit", 0, 200);
		
		produtos.add(livro1);
		produtos.add(cd1);
		produtos.add(dvd1);
		produtos.add(dvd2);
		produtos.add(livro2);
		
		for (Produto produto : produtos) {
			
			System.out.println(produto);
			
		}	
	}
}
