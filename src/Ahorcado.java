import java.util.Random;
import java.util.Scanner;

public class Ahorcado {

	public static void main(String[] args) {

		String [] palabrasClaves = {"justiciero","elefante","ahorcados","electrodomestico","manzana","caramelo"};
		Random rnd = new Random();
		int cantidad = palabrasClaves.length;
		Scanner sc = new Scanner(System.in);
		System.out.println("¡Bienvenidos al juego ahorcado!");
		

		String palabraClave = palabrasClaves[rnd.nextInt(cantidad)];
		boolean palabaEncontrada = false;
		int intentos = 10;
		int errores = 0;
		
		char[] caracteresPalabra = new char[palabraClave.length()];
		for (int i = 0; i < caracteresPalabra.length; i++) {
			caracteresPalabra[i] = '_';
			
		}
		
		while(!palabaEncontrada && errores < intentos){
					
			System.out.println("Intenta adivinar la palabra: " + String.valueOf(caracteresPalabra) + " (" + palabraClave.length() +" letras)");
			System.out.print("Ingresa un caracter: ");
			char caracter = sc.next().charAt(0);
			
			boolean caracterCorrecto = false;
			
			for (int i = 0; i < palabraClave.length(); i++) {
				
				if(palabraClave.charAt(i) == caracter){
					caracteresPalabra[i] = caracter;
					caracterCorrecto = true;
				}
			}
			
			if(!caracterCorrecto){
				errores++;
				System.out.println("Escribe bonito pues hijito :v Tienes: "+ (intentos - errores) +" intentos");
				System.out.println("");
			}
			
			if(String.valueOf(caracteresPalabra).equals(palabraClave)){
				System.out.println("¡Felicidades! Haz encontrado la palbra escondida: " + palabraClave);
				palabaEncontrada = true;
			}
			
		}
		if(!palabaEncontrada){
			System.out.println("GAME OVER");
		}
		sc.close();		
		
	}

}
