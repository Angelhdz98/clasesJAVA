package figuras;

public class Circulo extends Figura {
	
	//1.- Atributos
	double pi;
	double radio;
	
	//2.- Constructor 
	Circulo(double pi, double radio){
		this.pi=pi;
		this.radio=radio;
		
	}//Constructor
	
	//3.- Métodos (metodo abstracto heredado de figura)
	@Override
	public double calcularArea() {
		double areaCirculo= pi*(radio*radio);
		return areaCirculo;
	}//Método calcularArea

}
