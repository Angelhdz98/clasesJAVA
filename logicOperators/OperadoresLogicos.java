package logicOperators;

public class OperadoresLogicos {

	public static void main (String[] args) {
		/**
		 * tipos de operadores
		 * 
		 * 		-Operadores aritméticos: + - *  / suma resta multiplicación y división
		 * 		-Operadores relacionales: (=, +=, -=, /=, <, >, <=, >=)
		 * 		-
		 */		
		int num1 = 12; 
		int num2= 7; 
		int resultado = num1 +num2;
		System.out.println(resultado);
		
		float numFloat1 = 12f; 
		float numFloat2= 7f; 
		float resultadoFloat = num1 +num2;
		System.out.println(resultadoFloat);//si quiero que el resultado sea entero ambos numero de la división deben de ser 
		/*Relacionales
		= asignación
		+= asignación suma
		-= asignación resta
		*= asignación multiplicación
		/= asignación división
		== igual que
		!= distinto que
		< menor que
		> mayor que
		<= menor igual que
		>= mayor igual que
*/
		System.out.println(num1>=num2);//true
		System.out.println(num1<=num2);//false
		 /*
		  * operadores lógicos 
		  * AND(&&)
		  * OR(||)
		  * NOT(!)
		  */
		
		int numeroUno=5; 
		int numeroDos= 7;
		
		boolean comparacionDos= (numeroUno <numeroDos) && (numeroUno >numeroDos);
		System.out.println(comparacionDos);
		
		boolean comparacionTres= (numeroUno <numeroDos) || (numeroUno >numeroDos);
		System.out.println(comparacionTres);
		
		boolean comparacionCuatro= false;
		System.out.println(!comparacionCuatro);
	}
}







