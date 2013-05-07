package industria;

import java.lang.Math;

public class Circulo{
	private double area;
	private double raio;


	public Circulo (double Raio) {
		raio = Raio;
		area = 3.14 * Math.pow(Raio, 2);
	}

	public double getRaio(){
		return raio;
	}


	public double getArea() {
		return area;
	}

}