package persona;

public class AsistenteDental {

	//1 atributos privados
	//al declarar un atributo privado nos da un error porque no tenemos un metodo de acceso a la variable
	private String fechaIngreso; 
	private double salario;
	
	
	
	//2 Constructor público 
	
	public AsistenteDental(String fechaIngreso, double salario) {
		this.fechaIngreso= fechaIngreso;
		this.salario=salario;
		
		
	}// cierre del constructor 
	
	//Método para imprimir información
	
	public void mostrarDatosAsistente() {
		System.out.println("La fecha de ingreso del asistente es: " + fechaIngreso);
		System.out.println("El salario del asistente es: " + salario);
	}
	
	//3 metodos 
	
	//getters y setters para poder acceder a mis datos privados y poder realizar
	//sin Getters; la información me aparece en null
	
	public  double getSalario(){
		return salario;
	}
	
	public String getFechaDeIngreso() {
		return fechaIngreso;
	}
	
	public void setSalario(double nuevoSalario) { //son voids por que no regresan nada solo hacen cambios
		if(nuevoSalario>0) {
			salario=nuevoSalario;
		}
	}
	
} // Cierre de asistente dental 





