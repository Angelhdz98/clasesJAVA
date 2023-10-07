package colecciones;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;
import java.util.HashMap;
public class Collections {
	
	public static void main(String[] args) {
		/*
		//Array
		//Tipo de dato del array, nombre, instancia del objeto arreglo, los datos
		String[] listaDeCompras = new String[] {"Leche", "Pan", "Huevos"};
		
		
		//Esta impresion solo muestra el espacio de memoria
		System.out.println(listaDeCompras);
		
		
		
		//Imprimir info de listaDeCompras con un forEach
		for(String productoAImprimir : listaDeCompras) {
			System.out.println(productoAImprimir);
		}
		
		
	*/
	//implementación de un arrayList
	//Clase General (interfaz). tipo de dato que usaré, nombre de mi estructura de datos, instancia de dicha clase general 
	List<String> listaDeContactos = new ArrayList<>();
	
	listaDeContactos.add("Felipe");
	listaDeContactos.add("Pepe");
	listaDeContactos.add("Roberto");
	listaDeContactos.add("Alicia");
	//Obtener un elemento de la lista- asignarlo a una variable 
	
	String datoFelipe= listaDeContactos.get(0);
	
	System.out.println(datoFelipe);
	
	//podemos utilizar el método remove para quitar un elemento 
	listaDeContactos.remove(1);
	Set<String> cartasDeJuego= new HashSet<>();
	
	cartasDeJuego.add("2 de picas");
	cartasDeJuego.add("reina de treboles");
	
	if(cartasDeJuego.contains("reina de treboles")) {
		System.out.println("La reina de trebloles si está en el conjunto");
	}else {
		System.out.println("No encuentro el elemento solicitado");
		
	}
	
	
	//implementación de un conjunto SET();
	
	//mapa
	Map<String, String> libretaDirecciones = new HashMap<>();
	
	//agregamos un elemento a mi libreta de direcciones 
	
	libretaDirecciones.put("Felipe", "Tlanepantla");
	libretaDirecciones.put("Dr Simi", "CDMX");
	libretaDirecciones.put("Isla ballena", "Gon");
	
	System.out.println(libretaDirecciones.get("Dr Simi")); 
	System.out.println(libretaDirecciones.get("Gon"));	
	
	}//metodo main
	
	

	
}//Collections



/*
 * 
 * Colecciones 
 * 
 * 
 *	- Arrays (arreglos)
 *
 *	Es una estructura de datos lineal que contiene elementos del mismo tipo. Los elementos estan almacenados de forma contigua (uno al lado del otro), y se pueden acceder a ellos a traves de un indice. Las principales caracteristicas de un array son:
 *
 *		- Es una estructura de datos fija, generalmente almacena datos del mismo tipo
 *		- La longitud de un array se establece al momento de crearlo, y no cambia.
 *		- Podemos acceder a elementos por medio de un indice
 *		- Los arrays pueden contener datos primitivos y objetos
 *		- No proporciona metodos adicionales para agregar o eliminar elementos
 *
 *
 *Un ejemplo de array es una lista de compras del supermercado
 * 
 * ArrayList 
 * 
 * una implementación de una lista (list), es decir, que está en un nivel de las listas. utiliza un array dinámico que permite almacenar datos.
 * 
 * sus principales catacteristicas son:
 * 
 * tamaño dinámico, a diferencia de los arrays tradicionales, el tamaño arrayList si se puede omidifar.
 * acceso rapido, podemos acceder a un elemento del arrayList por su posición o indice
 * - Coste elevado al momento de insertar o eliminar elementos. si agrego un elemento, tengo que recorrer todos los demas elementos 
 * 
 *  Set (conjunto )
 *  
 *  Estructura de datos que almacena datos unicos sin orden especifico. Las principales caracterisicas de un set son: 
 *  	- No hay elementos duplicados, ya que los conjuntos no los pueden contener. si se intenta agregar un elemento ya existente, la operación se ignora. 
 *  	-No hay un orden específico, los elementos se almacenan sin orden
 *  	-La busqueda es más sencilla, ya que al no tener elementos duplicados se usa una función hash para encontrar elemento deseado
 *  
 * 
 * Map (mapas)
 * 
 * Un mapa es una estructura de datos que almacena pares de clave valor 
 * 
 * -almacenamiento con pares K-V key value
 * -sin orden específico
 * -Busqueda rápida, la busqueda se hace por medio de un valor (key), y usa una función interna hash para buscar elementos 
 * 
 * Agenda telefonica (agregar, modificar, eliminar )
 * 
 * 
 * 
 * 
 */




