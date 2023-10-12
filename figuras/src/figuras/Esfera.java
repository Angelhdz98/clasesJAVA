package figuras;

//clase concreta/tradicional que implementa métodos de una interfaz llamada calculable 
public class Esfera implements Calculable {
	//Atributos
	double radio;
	double pi= 3.1415926535d;

	@Override
	public double calcularArea() {
		//Area 4 pi r*r
		double area= (4*pi)*(radio*radio);
		return area;
	}

	@Override
	public double calcularVolumen() {
		//Volumen V= 4/3* pi * r*r*r
		double volumen= (4/3)*pi*(radio*radio*radio);
		return volumen;
	}

	@Override
	public double calcularPerimetro() {
		//Perimetro 2*pi*r
		double perimetro= 2*pi*radio;
		return perimetro;
	}
	
	 
	
	
}// class Esfera
