package persona;

public class Paciente {

	//1.- Atributos
	
	String numeroSeguroSocial;
	String tipoDeSangre;
	boolean expediente;
	private boolean seguroGastosMedicos;
	String cita; 
	String doctorAsignado; 
	boolean alergias;
	
	// 2.- Constructor
	//vamos a necesitar 2 constructores. 1 que recopila toda la info
	
	public Paciente(String numeroSeguroSocial, String tipoDeSangre, boolean expediente, boolean seguroGastosMedicos,
			String cita, String doctorAsignado, boolean alergias) {
		super();
		this.numeroSeguroSocial = numeroSeguroSocial;
		this.tipoDeSangre = tipoDeSangre;
		this.expediente = expediente;
		this.seguroGastosMedicos = seguroGastosMedicos;
		this.cita = cita;
		this.doctorAsignado = doctorAsignado;
		this.alergias = alergias;
	}
	
	public Paciente(String numeroSeguroSocial,  boolean expediente, boolean seguroGastosMedicos) {
		super();
		this.numeroSeguroSocial = numeroSeguroSocial;
		this.expediente = expediente;
		this.seguroGastosMedicos = seguroGastosMedicos;
		
	}

	//metodo toString que utiliza datos tipo String
	
	
	
	//constructor que recopila toda la info requerida u obligatoria
	
	
	
	
	// 3.- Métodos
	@Override
	public String toString() {//
		return "Paciente [numeroSeguroSocial=" + numeroSeguroSocial + ", tipoDeSangre=" + tipoDeSangre + ", expediente="
				+ expediente + ", seguroGastosMedicos=" + seguroGastosMedicos + ", cita=" + cita + ", doctorAsignado="
				+ doctorAsignado + ", alergias=" + alergias + "]";
	}

	public boolean isSeguroGastosMedicos() {
		return seguroGastosMedicos;
	}

	public void setSeguroGastosMedicos(boolean seguroGastosMedicos) {
		this.seguroGastosMedicos = seguroGastosMedicos;
	}

	
	
	
	
	
}
