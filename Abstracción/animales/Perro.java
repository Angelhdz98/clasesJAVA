package animales;

public class Perro extends Animal{

	
	@Override
		public void hacerSonido(){
			
			System.out.println("El perrito ladra y hacer guau");
			}
	public static void main(String[] args) {
		
		//aquí NO HAY POLIMORFISMO ya que se instancia un animal general y utilizo su metodo hacerSonido
		Animal Generico= new Animal(); //genera un animal generico(abstracto)
		
		Generico.hacerSonido();
		//Generar la instancia de mi perrito 				//Aquí mismo lo testeamos 
		//SI HAY POLIMORFISMO, porque es el equivalente a decir "instancío un animal que es un perrito
		//Referencia primero la clase general, y luego la instancia particular, permite el polimorfismo 
		Animal Chilaquil = new Perro();
		Chilaquil.hacerSonido();
		}
	
	//Cierre del main
// "polimorfear" o sobreescribir el método heredado
		
}//Cierre de la clase perro






















