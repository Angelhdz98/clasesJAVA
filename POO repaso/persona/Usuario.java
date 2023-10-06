package persona;

public class Usuario {

	
	//Atributos
	private String tipoUsuario;
	private String username;
	private String password;
	
	//crear un nuevo usuario (constructor)
	
	public Usuario(String tipoUsuario,String username, String password) {
		this.tipoUsuario=tipoUsuario;
		this.username= username;
		this.password=password;
	}// cierre del constructor 
	

	
	//recuperar contraseña (getter)
	public String getPassword(String userNameAValidar) {
		// si el usuario registrado coincide con el usuario que paso coo parametro entonces obtengo la contraseña 

		return password;
		
	}//cierre del gettter
	
	
	
	//Cambiar contrasenia (setter)
		public void setPassword(String nuevoPassword) {
			//si la nueva contrasenia es diferente a una cadena vacia y es diferente a la contrasenia anterior...
			if (nuevoPassword != "" && nuevoPassword != password) {
				//... entonces reemplazo la contrasenia anterior
				password = nuevoPassword;
			}else {
				System.out.println("Lo siento, no puedo cambiar la contrasenia");
			}
		}
		
		
	}//cierre del class Usuario

	
	
	




