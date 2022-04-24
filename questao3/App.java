package questao3;

import java.util.*;

public class App {
	

	public static void main(String[] args) {
		
		int quantidade;
		int opcao;
		int count = 1;
		double base;
		double altura;
		
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Quantas figuras deseja criar?");
		quantidade = leia.nextInt();
		
		ArrayList<FiguraGeometrica> figura = new ArrayList<FiguraGeometrica>();
		
		do {
			
			System.out.println("Qual figura deseja criar?\n1. Quadrado\n2. Retangulo\n3. Circulo\n");
			opcao = leia.nextInt();
			
			switch (opcao) {
				case 1: 
					System.out.println("\nVoc� selecionou um quadrado, digite o lado do quadrado:");
					Quadrado quadrado = new Quadrado(leia.nextDouble());
					figura.add(quadrado);
					break;
	
				case 2: 
					System.out.println("\nVoc� selecionou um ret�ngulo, digite a base do retangulo:");
					base = leia.nextDouble();
					System.out.println("\nDigite a altura do retangulo:");
					altura = leia.nextDouble();
					Retangulo retangulo = new Retangulo(base, altura);
					figura.add(retangulo);
					break;
				
				case 3: 
					System.out.println("\nVoc� selecionou um circulo, digite o raio do ciruculo:");
					Circulo circulo = new Circulo(leia.nextDouble());
					figura.add(circulo);
					break;
				default:
					System.out.println("Digito Inv�lido.\n");
					count--;
					break;
			}
			count++;
		}while(count <= quantidade);
		
		
		for (FiguraGeometrica figuraGeometrica : figura) {
			
			System.out.println(figuraGeometrica);
			System.out.println("Per�metro : " + figuraGeometrica.calcularPerimetro());
			System.out.println("�rea : " +figuraGeometrica.calcularArea());
			
		}
	
	}

}
