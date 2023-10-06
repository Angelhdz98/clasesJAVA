package persona;

public class TestUsuario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// instanciamos la clase usuario
		Usuario pepe= new Usuario("paciente", "pepelon", "bicicleta123");
		
		/*
		 * prueba de el getter para obtener la contraseña con el nombre de usuario
		 * */
		
		// testeo de la función recibiendo el valor correcto
		System.out.println(pepe.getPassword("pepelon"));
		
		//testeo de la función recibiendo un valor incorrecto
		System.out.println("******************\n");
		System.out.println(pepe.getPassword("pepelin"));
		
		/*
		 * prueba del setter para cambiar la contraseña 
		 * 
		 * */
		//testeo correcto de la función setter
		System.out.println("*******************\n");
		pepe.setPassword("contraseña");
		//compruebo el cambio de contraseña
		System.out.println(pepe.getPassword("pepelon"));
		
		//pruebas erroneas
		
		
		//inicio con prueba utilizando una cadena vacía 
		pepe.setPassword("");
		System.out.println(pepe.getPassword("pepelon"));
		
		
		//inicio con prueba utilizando una cadena vacía 
				pepe.setPassword("contraseña");
				System.out.println(pepe.getPassword("pepelon"));
		
	
	}

}
