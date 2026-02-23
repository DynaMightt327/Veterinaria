package co.edu.unbosque.view;

import java.util.Scanner;

public class Consola {

	private Scanner lector;

	public Consola() {
		lector = new Scanner(System.in);

	}

	public int leerNumeroEntero() {
		return lector.nextInt();
	}

	public float leerNumeroFlotante() {
		return lector.nextFloat();
	}

	public double leerNumeroDoble() {
		return lector.nextDouble();
	}

	public long leerNumeroLargo() {
		return lector.nextLong();
	}

	public boolean leerNumeroBooleano() {
		String entrada = lector.nextLine();
		if (entrada.toLowerCase().contains("si")) {
			return true;
		} else {
			return false;
		}
	}// para poner cualquier cosa que no sea ni si, ni no.

	public String leerLineaCompleta() {
		return lector.nextLine();
	}

	public String leerPalabra() {
		return lector.next();
	}

	public char leerCaracter() {
		return lector.next().charAt(0); // sirve para que traiga un caracter especifico en una posicion especifica. las
										// cadenas de caracteres tienen indices, esto sirve para saber que posicion uno
										// se refiere.la pósicion 0 siempre sera una funcion valida y siempre sera la
										// primera. SIERMPRE LA POSICION DEBE SER VALIDA
		
	}
	
	public void imprimirConSalto(String texto) {
		System.out.println(texto);
	}
	
	public void imprimirSinSalto(String texto) {
		System.out.print(texto);
	}
	
	public void quemarLinea() {
		lector.nextLine();
	}
	
	public void printMenuSelectorAnimal() {
		System.out.println("-> Seleccione el número de animal del cuál desea registrar su información:"
				+ "\n1. Mamifero"
				+ "\n2. Ave"
				+ "\n3. Pez"
				+ "\n4. Reptil"
				+ "\n99. Salir del aplicativo");
	}

}
