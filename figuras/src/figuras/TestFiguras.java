package figuras;

public class TestFiguras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Generar las instancias de nuestras clases
		
		// 1.- Instancia de la clase figura
		//figura generica = new Figura();
		
		//2. instancia de un rectangulo 
		Figura rectangulo= new Rectangulo(5.0,6.5);
		
		//3.- instancia de un circulo
		Figura circulo=new Circulo(3.14, 3.0);
		
		//invocación del metodo 
		System.out.println(rectangulo.calcularArea());
		System.out.println(circulo.calcularArea());
		
	}

}
