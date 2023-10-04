package persona;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//instancia de persona
		Persona Felipe = new Persona("Felipe", "Maqueda", (byte)31, "332892847887","Felipe@gmail.com");
		System.out.println(Felipe);//vemos que nos imprime (su espacio de memoria)
		//llamada a sus metodos
		Felipe.imprimirInfo();
		Felipe.saludar();
		
		
		//instancia de un dentista
		Dentista simi = new Dentista("Simi", "Lares", (byte)50, "339823659729", "simi@lares.com", "odontología", "849894845", "500", "avanzado", "matutino", 500);		
		simi.calcularSalario();
		simi.imprimirInfoDentista();
		//instancia de paciente 
		 //Paciente(String numeroSeguroSocial, String tipoDeSangre, boolean expediente, boolean seguroGastosMedicos,String cita, String doctorAsignado, boolean alergias)
		Paciente Chencho = new Paciente("CH1IIHF", "RH+", true, true, "05-octubre-2023", "Doc. Simi Lares ", false );
		System.out.println(Chencho);
		System.out.println("*********************************");
		
		//Instancia de Paciente con datos obligatorios
				Paciente Masiosare = new Paciente("MAS12345", false, false);
				System.out.println("********************");
				System.out.println(Masiosare);
		
		
	}// cierre del metodo main 
	

}
