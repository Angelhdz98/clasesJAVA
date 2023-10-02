package ciclos;

public class BreakContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Sentencias utilizadas en loops: 
		 * -- break. se utiliza para salir de un bucle en un punto específico 
		 * --continue. interrumpe la ieración de un bucle, si se produce una condición específica y continúa con la siguiente 
		 * 
		 */
		//Súper ozzito va a realizar una rifa en la cual el cliente numero 5 se ganará una coca cola de bolsita
		for(int cliente=1; cliente<=20;cliente++) {
			
			if (cliente==5) {
				System.out.println("eres el cliente numero 5 te ganaste una coquita en bolsa");
				break;
			}
			System.out.println("Eres el cliente numero "+ cliente);
			
		}
	}

}
