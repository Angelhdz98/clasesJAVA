package persona;
//import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

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
				
				List<Dentista> listaDentistaArrayList=new ArrayList<>();
				
				//instanciamos el Dr en una variable y después lo agregamos a la lista dando la variable como parametro de entrada 
				Dentista DrChapatin= new Dentista("Dr.Chapatin", "Chespirito", (byte)45,"11223344", "chapatin@mail.com","General","3534534", "consultorio 200", "avanzado", "matutino", 450	 );

				listaDentistaArrayList.add(DrChapatin);
				
				//agregando dentista instanciando directamente dentro de la lista 
				
				listaDentistaArrayList.add(new Dentista("Simi", "Lares", (byte)50, "339823659729", "simi@lares.com", "odontología", "849894845", "500", "avanzado", "matutino", 500));
				
				
				
				///////////
				////////
				/////
				
				//implementación de lista de Dentistas con HashSet
				Set <Dentista>conjuntoDentistas= new HashSet<>();
				
				//agregando dentista a mi conjunto
				conjuntoDentistas.add(new Dentista("Simi", "Lares", (byte)50, "339823659729", "simi@lares.com", "odontología", "849894845", "500", "avanzado", "matutino", 500));
				
				
				/////////
				//////
				///
				
				//implementación de un hashmap de dentista
				
				
				Map<String, Dentista> mapaDentista= new HashMap<>();
				
				mapaDentista.put("Dr House", new Dentista("Simi", "Lares", (byte)50, "339823659729", "simi@lares.com", "odontología", "849894845", "500", "avanzado", "matutino", 500));
				
				Dentista doctorBuscado= mapaDentista.get("Dr House");
				System.out.println("****************************\n");
				System.out.println(doctorBuscado);
				
				
	}// cierre del metodo main 
	
	

}
