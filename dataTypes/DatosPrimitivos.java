package dataTypes;

public class DatosPrimitivos {
public static void main(String[] args) {
//	System.out.println("hello"); //System es una clase. por el momento lo utilizamos para ver si funcionaba
/*
 * datos primirtivos hacen refresncia a los datos fundamentales que sirven para gestionar los tipos de 
 * información más básicos. 
 *  * Existen 8 tipos de datos primitivos: byte, short, int, long, float, dohble, boolean, char
		 */
	
byte age = 28; //TipoDeDato Variable y valor 
System.out.println(age);
 //System.out.println("");//para rapido puedo escribir solo syso ctrl + barraEspaciadora
//iniciando de los más pequeños a los más grandes 
//byte
byte maxByte= Byte.MAX_VALUE;
byte minByte= Byte.MIN_VALUE;

System.out.println("El valor máximo de un byte es: " + maxByte);
System.out.println("El valor mínimo de un byte es "+ minByte);

//SHORTS
short minShort= Short.MIN_VALUE;
short maxShort = Short.MAX_VALUE;


System.out.println("El valor minimo de un byte es: "+ minShort);
System.out.println("El valor máximo de un byte es " + maxShort);

char minChar= Character.MIN_VALUE;
char maxChar= Character.MAX_VALUE;

System.out.println("el valor mínimo de un char es: "+ minChar);
System.out.println("el valor máximo de un char es: "+ maxChar);

/*
 * los valores maximos y minimosde los caracteres del ASCII son el null y el espacio vació de "espacio" 
 * por lo que no muestra nada en ninguno de los 2
 */

long isbn = 1176738495867L;
System.out.println(isbn);

float salary = 15000f; //agregamos la d para indicar a java que vamos a ingresar ese tipo de dato
System.out.println(salary);
double ISR = 1239.45d; //agregamos la d para indicar a java que vamos a ingresar ese tipo de dato lo hacemos por buenas practicas
System.out.println(ISR);

int salarioAnual= 280000;
System.out.println(salarioAnual);

int minInt= Integer.MIN_VALUE;
int maxInt= Integer.MAX_VALUE;

System.out.println("el valor mínimo de un entero es: "+minInt);
System.out.println("el valor máximo de un entero es: "+maxInt);

float minFloat= Float.MIN_VALUE;
float maxFloat= Float.MAX_VALUE;

System.out.println("el valor mínimo de un float es: "+minFloat);
System.out.println("el valor máximo de un float es: "+maxFloat);


double minDouble= Double.MIN_VALUE;
double maxDouble= Double.MAX_VALUE;

System.out.println("el valor mínimo de un double  es: "+minDouble);
System.out.println("el valor máximo de un double es: "+maxDouble);
 
char valorChar1= 52 ;
char valorChar2= 'a' ;
System.out.println(valorChar1);
System.out.println(valorChar2);


//primeros casteos automaticos, si el tipo de dato inicial es más pequeño que el dato final se puede hacer el casteo automatico 
//int <double
int myNumber= 125;
System.out.println(myNumber);

double myCasting= myNumber;
System.out.println(myCasting);

short edad = 25;
int valorEdad= edad; 
System.out.println(edad);
System.out.println(valorEdad);

//casteo manual
int myNewCasting= (int) myCasting; // si le quitamos el (int ) no nos permite hacer el cambio de un double a int ya que doubnle es más grande 
System.out.println(myNewCasting);

//convertir float a int 
float floatNumero= 1.99f;

int enteroRedondeado = (int) floatNumero;//solo toma la parte entera y guarda 1 
System.out.println(enteroRedondeado);


// 





}

}
