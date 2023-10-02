package ciclos;

import java.util.Scanner;

public class CicloWhile {
	public static void main(String[] args) {
		/*
		 * while. el ciclo while ejecuta continuamente un bloque de código hasta que se cumpla la condición dada
		 * 
		 * while(expresion){
		 * // bloque de código a ejecutar 
		 * (contador- iterador)
		 * 
		 * }
		 * 
		 */
		int cuenta =1;
		while(cuenta<=10) {
			System.out.println("la cuenta es de: "+ cuenta);
			cuenta++;
		}
		
		//Crear un programa que solicite al usuario un número. Dicho número será tomado como el número final de una cuenta. Dicha cuenta inicia en 1. Debe mostrar en consola la cuenta del 1 hasta el número proporcionado.
		/*
		 * 1. 
		 */
		
		Scanner input=new Scanner(System.in);
		System.out.println("Escribe un numero que servirá como numero final de una cuenta");
		int numeroFinal=input.nextInt();
		int numeroInicial=1;
		while(numeroInicial<=numeroFinal) {
			System.out.println("la cuenta va en: "+numeroInicial);
			numeroInicial++;
		}
		
		
		
		input.close();
		
		
	}

}
