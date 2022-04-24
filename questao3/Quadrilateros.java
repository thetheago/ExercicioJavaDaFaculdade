package questao3;

public abstract class Quadrilateros implements FiguraGeometrica {

	private double lado1;
	private double lado2;
	private double lado3;
	private double lado4;
	
	
	
	public Quadrilateros(double lado1, double lado2, double lado3, double lado4) {
		super();
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
		this.lado4 = lado4;
	}

	@Override
	public double calcularPerimetro() {
		return lado1 + lado2 + lado3 + lado4;
	}

	@Override
	public double calcularArea() {
		return lado1*lado2;
	}

	@Override
	public String toString() {
		return "Quadrilateros [lado1=" + lado1 + ", lado2=" + lado2 + ", lado3=" + lado3 + ", lado4=" + lado4 + "]";
	}
	
	

}
