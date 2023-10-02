package ciclos;


public class ForLoop {
	public static void main(String[] args) {
		/*
		 * El ciclo for proporciona una manera compacta de iterar sobre los valores.
		 * for (inicialización; condición; contador ( incremento/decremento)){
		 * //bloque de código
		 * }
		 */
		// for con variable local
		//la variable se declara dentro del mismo for 
		for (int numero= 1; numero <=10;numero++) {
			System.out.println("Número igual a " + numero);
		}
		// for con variable local
		//se delcara la variable antes del for 
		int contador;
				for (contador= 1; contador <=5;contador++) {
					System.out.println(contador);
				}
	/*
	 * Bucles anidados. bucles dentro de otro bucle 
	 * 
	 */
//imprimir una forma triangular de asteriscos 
		int filas=5;
				for (int i=1; i<filas;i++) {
					
					for(int j=1;j<=i;j++ ) {
						System.out.print("*");
					}
						System.out.println("");
					}
				//calcular las primeras 5 pontecias de pi 
				//output	PI elevado a la 1= 3.1415926535
				//			Pi elevado a la 2= 9.8. . . . 
				System.out.println("el valor de pi es: "+ Math.PI );
			
				
				int potencias=5;
				for (int base=1; base<=potencias;base++) {
					double resultado=Math.pow(Math.PI, base);
					System.out.println("PI elevado a la "+ base +" es igual a: " +resultado  );
					
				}
				
		}
				
				
	}














