package industria;

public class Retangulo {

	private double area;
	private double base;
	private double altura;
	private String materiaprima;
	
	
	public Retangulo(double X, double Y){
		this.base = X;
		this.altura = Y;
		this.area = X * Y;
	}



	public double getArea() {
		return area;
	}



	public void setArea(double area) {
		this.area = area;
	}



	public double getBase() {
		return base;
	}


	public double getAltura() {
		return altura;
	}



	public String getMateriaprima() {
		return materiaprima;
	}



	public void setMateriaprima(String materiaprima) {
		this.materiaprima = materiaprima;
	}
	
	
	
	
}
