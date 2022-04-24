package questao3;

public class Circulo implements FiguraGeometrica{

	private double raio;

	
	
	public Circulo(double raio) {
		super();
		this.raio = raio;
	}

	@Override
	public double calcularPerimetro() {
		return 2 * Math.PI * this.raio;
	}

	@Override
	public double calcularArea() {
		return Math.PI * (raio*2);
	}

	@Override
	public String toString() {
		return "Circulo [raio=" + raio + "]";
	}
	
	public String getNome() {
		return "Circulo";
	}
	
}
