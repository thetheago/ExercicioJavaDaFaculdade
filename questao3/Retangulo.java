package questao3;

public class Retangulo extends Quadrilateros implements FiguraGeometrica{

	private double base;
	private double altura;
	
	public Retangulo(double base, double altura) {
		super(base, altura, base, altura);
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double calcularPerimetro() {
		return 2*base + 2*altura;
	}

	@Override
	public double calcularArea() {
		return base*altura;
	}

	public String getNome() {
		return "Retangulo";
	}
	
}
