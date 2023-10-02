package ciclos;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *  Do-While. evalúa su expresión en la parte inferior del ciclo. por lo tanto, las declaraciones dentro del bloque "do" siempre se ejecutan al menos una vez
		 */
		
		//cuenta del 1 al 10
		int cuenta=1;
		do {
			System.out.println(cuenta);
			cuenta++;
		}while(cuenta<0);//aunque la condición no se cumple  se realiza una vez el bloque de instrucciones
		/*
		 * Crear un programa para una cajero bancario 
		 * -el programa mostrará 4 opciones :
		 * 1.- Consultar saldo 
		 * 2.- Ingresa dinero
		 * 3.- retrar dinero
		 * 4.- salir 
		 * - Mostrar mensaje de bienvenida al usuario, darle contexto y solicitar que elija una opción (numero)
		 * -Muestra al usuario la opción que eligió y permitir que elija otra opción 
		 * -El usuario puede salir del programa escribiendo 4 (salir )
		 * 
		 */
		Scanner input= new Scanner(System.in);
		
		System.out.println("Bienvenido al Banco Generation, elige cualquiera de las siguientes opciones para eso escribe el numero que corresponda ");
		System.out.println("1. Consultar saldo");
		System.out.println("2. Ingresar dineros");
		System.out.println("3. Retirar dineros");
		System.out.println("4. Salir");
		int opcionSeleccionada;
		do {
			opcionSeleccionada=input.nextInt();
		
		switch(opcionSeleccionada) {
		case 1:
			System.out.println("Consultar saldo");
			break;
		case 2:
			System.out.println("Ingresar dinero");
			break;
		case 3:
			System.out.println("Retirar dinero");
			break;
		case 4:
			System.out.println("salir");
			break;
		default:
			System.out.println("Ingrese una de las opciones proporcionadas ");	
			break;
		}
		}while(opcionSeleccionada != 4);
		input.close();
		
	}

}
