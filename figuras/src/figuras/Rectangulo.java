package figuras;
//1.- Aplicamos herencia
public class Rectangulo extends Figura {

	//parammetros
	double base;
	double altura;
	
	
	//Constructor 
	
	Rectangulo(double base, double altura){
		this.base=base;
		this.altura=altura;
	}//constructor
	
	//Métodos
	
	@Override
	public double calcularArea() {
		
		double formulaRectangulo= base*altura;
		return formulaRectangulo;
	}//método CalcularArea
	

}//Clase figura
