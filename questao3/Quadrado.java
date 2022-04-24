package questao3;

public class Quadrado extends Quadrilateros implements FiguraGeometrica{

	private double lado;

	public Quadrado(double lado) {
		super(lado, lado, lado, lado);
		this.lado = lado;
	}

	@Override
	public double calcularPerimetro() {
		return lado*4;
	}

	@Override
	public double calcularArea() {
		return lado*lado;
	}
	
	public String getNome() {
		return "Quadrado";
	}
	
}
