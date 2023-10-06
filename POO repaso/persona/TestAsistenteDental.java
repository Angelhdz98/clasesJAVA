package persona;

public class TestAsistenteDental {
	
/*	public static void main(String[] args) {
		AsistenteDental Francisca= new AsistenteDental("05/10/2023",875.40d);
		//Impresión de la información de nuestro asistente
		Francisca.mostrarDatosAsistente();
		// pero no podemos acceder a traves de querer entrar al atributo directamente
	}*/
	
	public static void main(String[] args) {
		AsistenteDental Francisca= new AsistenteDental("05/10/2023",875.40d);
		System.out.println(Francisca.getSalario());
		
		//modificar salario con setter
		Francisca.setSalario(90d);
		//imprimir el nuevo salario de Francisca
		
		System.out.println(Francisca.getSalario());	
		
		
	}
	
	
}
