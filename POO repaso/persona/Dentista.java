package persona;

public class Dentista extends Persona {
	
	//1.- Atributos  
	// va a heredar varios atributos de la clase person
	
	String especialidad;
	String cedula;
	String consultorioAsignado;
	String experiencia;
	String turno;
	int salario;
	public Dentista(String nombre, String apellido, byte edad, String telefono, String email, String especialidad,
			String cedula, String consultorioAsignado, String experiencia, String turno, int salario) {
		super(nombre, apellido, edad, telefono, email);//atributos heredadador, que viene de arriba (de su clase superior)
		//Información de la clase dentista
		this.especialidad = especialidad;
		this.cedula = cedula;
		this.consultorioAsignado = consultorioAsignado;
		this.experiencia = experiencia;
		this.turno = turno;
		this.salario = salario;
	}
	
		//3 Metodos (Metodo para calcular salario basado en la experiencia
		//Experiencia  = basico, intermedio, avanzado 
		//Si el dentista esta en rango basico, gana 30,000. Si es intermedio, gana 40000, si es avanzado gana 50000
		
					void calcularSalario() {
						if (experiencia.equals("basico")){
							salario=30000;
							
						}
						else if(experiencia.equals( "intermedio")) {
							salario=40000;
							
						}
						else if(experiencia.equals("avanzado")) {
							salario=50000;
						}
						
							
					}
					
					
					void imprimirInfoDentista() {
						System.out.println("La especialidad es: "+ especialidad);
						System.out.println("El salario es: "+ salario);
						
					}
	
		
		
			
	

}
