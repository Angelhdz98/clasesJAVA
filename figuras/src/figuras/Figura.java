
//Vamos a usar clases abstractas para evitar la instanciación de objetos que no necesito (generalmente son objetos  mmuy abstratos, como persona, figura, transporte, animal, comida, Arte, operaciones Matematicas, lecturas, Ropa, plantas, paises, etc)

package figuras;
// utilizando clases abstractas, evitamos las instancias no necesarias
//para que una clase se vuel abstracta, usamos la palabra reservada abstract antes de class

public abstract class Figura {

	//Declaramos un metodo abstracto (no tiene cuerpo)
	//metodo abstractoque nos dice que nemos que hacer pero no nos dice como 
	public abstract double calcularArea();

}



/*
 * NOTA: Las clases abstractas pierden la capacidad de instanciar otros objetos. una clase abstracta necesita sí o sí metodos abstractos 
 * 
 * 
 */