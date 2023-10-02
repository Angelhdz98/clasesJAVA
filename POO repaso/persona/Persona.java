package persona;

public class Persona {
	
	//1.- Atributos
	String nombre;
	String apellido;
	byte edad; //el valor de Byte va desde -128 a 127 por lo cual es mejor dato para la edad 
	String telefono;
	String email;
	
	
	//2.- Constructor
	Persona(String nombre, String apellido, byte edad, String telefono, String email){//no es necesario utilizar la palabra reservada constructor
		this.nombre=nombre;
		this.apellido=apellido;
		this.edad= edad;
		this.telefono=telefono;
		this.email= email;
		
	}//Cierre de constructor
	
	//3.- Métodos 
	void imprimirInfo() {
		System.out.println("El nombre es: "+ nombre);
		System.out.println("El apellido es: "+ apellido);
		System.out.println("La edad es: "+ edad);
		System.out.println("El telefono es: "+ telefono);
		System.out.println("El email es: "+ email);
		
	}
	void saludar() {
		System.out.println("Hola te mando saludos ");
	}
	
	//4.- Instancia
	 
}// cierre de clase POO
               