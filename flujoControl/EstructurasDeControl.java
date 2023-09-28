package flujoControl;
import java.util.Scanner;

public class EstructurasDeControl {//debe coinicidir la clase
public static void main(String[] args) {//todo dentro del metodo main
	
	//recordar que para que algo se ejecute siempre debe de estar dentro del metodo main (principal)
	
		//primero genero una variable del tipo String donde almaceno un dato 
	String citaProgramada= null; //dejamos en Null y después lo cambiamos a una fecha "28-09-23" 
	//la variable declarada, se inicia en null a proposito para tener un espacio de meoria ya asignado solo reemplazarlo con un nuevo dato 
	if(citaProgramada!=null) {
		System.out.println("ya hay una cita programada"); //porque la variable ya está ocupada o llena	
	} else
	{
		System.out.println("Puede registrar su cita "); // Podemos registrar otra cita o una cita 
		
		
	}
	///////////////////////////////////////////////////
	
		//Seleccionando una opción y almacenando la variable opción 
	int opcion=3;
	
	//Creamos un menu
	
	System.out.println("Menú consultorio dental: El Diente Feliz");
	System.out.println("1.- ¿Desea programar una cita?");
	
	System.out.println("2.- Verificar cita Programada");
	System.out.println("3.- Cancelar cita");
	System.out.println("4.- Modificar la fecha de la cita");
	System.out.println("5.- salir del menú");
	System.out.println("Seleccione una opción del menú (1-5): ");
	
	switch (opcion) {
	case 1: 
		System.out.println("Usted ha seleccionado la opción programar cita");
		break;
	case 2:
		System.out.println("Usted ha seleccionado la opción verificar cita ");
		break;
	case 3: 
		System.out.println("Usted ha seleccionado la opción cancelar cita");
		break;
	case 4: System.out.println("Usted ha seleccionado la opción modificar la fecha de la cita");
	break;
	case 5: System.out.println("Usted ha salido del menú");
		break;
		default:
			System.out.println("La opción que usted seleccionó no es valida ");
			break;
	}
	
	// Actividad de ejemplos 
	//mayoría  de edad
	Scanner input=  new Scanner(System.in);
	System.out.println("Ingrese su edad");
	int edad = input.nextInt();//se lee la edad del usuario y con el metodo nextInt 
	String mensaje = edad>=18?"Puede asistir a su cita":"Necesitas una mayor de edad que te acompañe";
	System.out.println(mensaje);
	if(edad <18) {
		System.out.println("Tienes que asistir con un mayor de edad  ");
		System.out.println(" vienes acompañado de un mayor de edad?");
boolean acompañante= input.nextBoolean();
if (acompañante==true) {
	System.out.println("puede ingresar a su consulta junto con su acompañante");
	}else {
		System.out.println("No podemos atender menores de edad sin compañia de un mayor de edad");
		
	}
	}else {
		
		
		
	}
	input.close();
	
	

	
	
	
}
}




