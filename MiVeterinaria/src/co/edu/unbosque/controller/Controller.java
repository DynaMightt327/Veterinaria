package co.edu.unbosque.controller;

import java.util.ArrayList;

import co.edu.unbosque.model.Ave;
import co.edu.unbosque.model.Mamifero;
import co.edu.unbosque.model.Pez;
import co.edu.unbosque.model.Reptil;
import co.edu.unbosque.view.Consola;

public class Controller {

	private Consola con;
	private ArrayList<Mamifero> listaMamiferos;
	private ArrayList<Pez> listaPeces;
	private ArrayList<Reptil> listaReptiles;
	private ArrayList<Ave> listaAves;

	// por ahora no se necesitan los gtt y stt de las advertencias porque ninguna
	// clase más los necesita :o

	public Controller() {
		con = new Consola();
		listaMamiferos = new ArrayList<>();
		listaPeces = new ArrayList<>();
		listaReptiles = new ArrayList<>();
		listaAves = new ArrayList<>();

	}

	public void iniciar() { // en esta funcion va la logica :D
		

		cicloPrincipal: while (true) {// CICLO NOMBRADO
			con.imprimirConSalto("== Bienvenido a la veterinaria VETPET :D ==");
			con.imprimirConSalto("-> Seleccione su rol:" + "\n1. Administrador" + "\n2. Cliente" + "\n3. Veterinario" + "\n99. Deseo salir del aplicativo.");
			
			int opcionPrincipal = con.leerNumeroEntero();
			con.quemarLinea();
			
			switch (opcionPrincipal) {
			case 1: {
				con.imprimirConSalto("¡Bienvenido administrador al sistema de VETPET!. \nA continuación seleccione la accion que desea realizar:"
						+ "\n1. Crear "
						+ "\n2. Mostrar"
						+ "\n3. Actualizar"
						+ "\n4. Borrar"
						+ "\n99. Volver al menu principal");
				
			int opcionAdmin = con.leerNumeroEntero();
			con.quemarLinea();
			
			switch (opcionAdmin) {
			case 1: { // CREAR
				con.imprimirConSalto("-> Ha seleccionado crear. Pero ahora indique que información desea crear."
						+ "\n1. Información animal"
						+ "\n2. Información cliente"
						+ "\n3. Información empleados");
				break;
			}
			case 2:{ // MOSTRAR
				con.imprimirConSalto("-> Ha seleccionado mostrar. Pero ahora indique que información desea mostrar."
						+ "\n1. Información animal"
						+ "\n2. Información cliente"
						+ "\n3. Información empleados");
				break;
				
			}
			default:
				break;
			}
				
				
				break;
			}
			case 2: {
				
				break;
			}
			case 3: {
				
				break;
			}
			case 99: {
				
				break;
			}
			default:
				
			}
			
			
			
			con.imprimirConSalto("-> Seleccione el animal a administrar:" + "\n1. Ave" + "\n2. Mamífero" + "\n3. Pez"
					+ "\n4. Reptil" + "\n99. Salir del programa");

			int opcionMenu = con.leerNumeroEntero();
			con.quemarLinea();

			switch (opcionMenu) {
			case 1: { // AVE

				con.imprimirConSalto("--- ¡Ha seleccionado la opción 1: Ave! ---");
				con.imprimirConSalto(
						"-> A continuación, seleccione la opción que desea realizar:" + "\n1. Agregar información"
								+ "\n2. Mostrar información guardada" + "\n3. Eliminar un animal de la lista"
								+ "\n4.Actualizar información de un animal" + "\n5. Alimentación de un animal"
								+ "\n6. Superficie de descanso de un animal" + "\n99. Retornar al menú principal");

				int opcionAve = con.leerNumeroEntero();

				switch (opcionAve) {
				case 1: { // AGREGAR AVE
					con.imprimirConSalto("Ha seleccionado la opción 1: Agregar información de un ave.");
					mostrarMenuAve();

					break;
				}
				case 2: { // MOSTRAR AVE
					con.imprimirConSalto("Ha seleccionado la opción 2: Mostrar información de las aves");
					for (Ave ave : listaAves) {
						// con.imprimirConSalto("Especie" + ave.getEspecie());
						con.imprimirConSalto(ave.toString());
					}

					break;
				}
				case 3: { // ELIMINAR AVE
					con.imprimirConSalto("Ha seleccionado la opción 3: Eliminar un animal de la lista");
					con.imprimirConSalto("-> Inserte la posición que desea eliminar de la lista");
					int dato = con.leerNumeroEntero();

					if (listaAves.size() <= dato || dato < 0) { // size() es el n
						con.imprimirConSalto("* Error al eliminar el ave. Dicha posición no existe!");
					} else {
						listaAves.remove(dato);
						con.imprimirConSalto("¡! Ave eliminada exitosamente de la lista");
					}

					break;
				}

				case 4: { // ACTUALIZAR AVE

					con.imprimirConSalto("Ha seleccionado la opción 4: Actualizar un animal de la lista");
					con.imprimirConSalto("-> Inserte la posición que desea actualizar de la lista");
					int dato = con.leerNumeroEntero();

					if (listaAves.size() <= dato || dato < 0) { // size() es el n
						con.imprimirConSalto("* Error al actualizar el ave. Dicha posición no existe!");
					} else {
						con.imprimirConSalto("-> A continuación ingrese la información del ave:");
						con.quemarLinea();

						con.imprimirConSalto("Ingrese el nombre del ave:");
						String nombre = con.leerLineaCompleta();

						con.imprimirConSalto("Ingrese la especie del ave:");
						String especie = con.leerLineaCompleta();
						// con.quemarLinea();

						con.imprimirConSalto("Ingrese el habitat del ave:");
						String habitat = con.leerLineaCompleta();

						con.imprimirConSalto("Ingrese el tipo de alimento del ave:");
						String tipoAlimento = con.leerLineaCompleta();

						con.imprimirConSalto("Ingrese el peso del ave:");
						float peso = con.leerNumeroFlotante();

						con.imprimirConSalto("Ingrese la altura del ave:");
						float altura = con.leerNumeroFlotante();

						con.imprimirConSalto("Ingrese la edad del ave:");
						int edad = con.leerNumeroEntero();
						con.quemarLinea();

						con.imprimirConSalto("Ingrese la forma de la pata del ave ( bla / bla / bla):");
						String formaPata = con.leerLineaCompleta();

						con.imprimirConSalto("Ingrese el color de las plumas del ave:");
						String colorPluma = con.leerLineaCompleta();

						con.imprimirConSalto("Ingrese la cantidad de huevos que pone el ave:");
						int cantidadHuevo = con.leerNumeroEntero();

						con.imprimirConSalto("Ingrese el tamaño del pico del ave (cm):");
						float tamanoPico = con.leerNumeroFlotante();
//						con.quemarLinea();

						con.imprimirConSalto("Ingrese si el ave es migratoria o no (si/no)");
						boolean esMigratoria = con.leerNumeroBooleano();

						listaAves.add(new Ave(nombre, especie, habitat, tipoAlimento, peso, altura, edad, formaPata,
								colorPluma, cantidadHuevo, tamanoPico, esMigratoria));

						con.quemarLinea();
						con.imprimirConSalto("-> ¡Información guardada exitosamente!");
						con.imprimirConSalto("--------------------------");

					}

					break;
				}
				case 5: {

					con.imprimirConSalto("-> Ingrese el tipo de alimento del animal:");
					con.quemarLinea();
					String tipoAlimento = con.leerLineaCompleta();

					con.imprimirConSalto(listaAves.get(0).alimentarse(tipoAlimento));
					// esto es lo que se llama polimorfismo : es la capacidad que tiene una funcion
					// o una clase de contener diferente logicas. (sobreescritura)
					
					

					break;
				}
				case 6: {
					con.imprimirConSalto("-> Ingrese la superficie donde dormirá el animal:");
					

					break;
				}
				case 99: { // RETORNAR AL MENU PRINCIPAL
					con.imprimirConSalto("Ha seleccionado la opción 99: Retornar al menú principal");
					break;
				}

				default:
					con.imprimirConSalto("* OPCIÓN INVÁLIDA. SELECCIONE UNO DE LOS VALORES DADOS >:(");
					break;
				}

				break;
			}
			case 2: { // MAMIFERO

				con.imprimirConSalto("--- ¡Ha seleccionado la opción 2: Mamífero! ---");
				con.imprimirConSalto(
						"-> A continuación, seleccione la opción que desea realizar:" + "\n1. Agregar información"
								+ "\n2. Mostrar información guardada" + "\n3. Eliminar un animal de la lista"
								+ "\n4.Actualizar información de un animal" + "\n5. Alimentación de un animal"
								+ "\n6. Superficie de descanso de un animal" + "\n99. Retornar al menú principal");

				int opcionMamifero = con.leerNumeroEntero();

				switch (opcionMamifero) {
				case 1: {// AGREGAR MAMIFERO
					con.imprimirConSalto("Ha seleccionado la opción 1: Agregar información de un mamífero.");
					mostrarMenuMamifero();
					break;
				}
				case 2: {// MOSTRAR MAMIFERO
					con.imprimirConSalto("Ha seleccionado la opción 2: Mostrar información de los mamíferos");
					for (Mamifero mamifero : listaMamiferos) {
						con.imprimirConSalto(mamifero.toString());
					}

					break;
				}
				case 3: { // ELIMINAR MAMIFERO
					con.imprimirConSalto("Ha seleccionado la opción 3: Eliminar un animal de la lista");
					con.imprimirConSalto("-> Inserte la posición que desea eliminar de la lista");
					int dato = con.leerNumeroEntero();

					if (listaMamiferos.size() <= dato || dato < 0) { // size() es el n
						con.imprimirConSalto("* Error al eliminar el mamifero. Dicha posición no existe!");
					} else {
						listaMamiferos.remove(dato);
						con.imprimirConSalto("¡! Mamifero eliminado exitosamente de la lista");
					}
					break;
				}

				case 4: { // ACTUALIZAR MAMIFERO
					con.imprimirConSalto("Ha seleccionado la opción 4: Actualizar un animal de la lista");
					con.imprimirConSalto("-> Inserte la posición que desea actualizar de la lista");
					int dato = con.leerNumeroEntero();

					if (listaMamiferos.size() <= dato || dato < 0) { // size() es el n
						con.imprimirConSalto("* Error al actualizar el mamifero. Dicha posición no existe!");
					} else {
						con.imprimirConSalto("-> A continuación ingrese la información del mamífero:");
						con.quemarLinea();
						con.imprimirConSalto("Ingrese el nombre del mamifero:");
						String nombre = con.leerLineaCompleta();

						con.imprimirConSalto("Ingrese la especie del mamífero:");
						String especie = con.leerLineaCompleta();

						con.imprimirConSalto("Ingrese el hábitat del mamífero:");
						String tipoHabitat = con.leerLineaCompleta();

						con.imprimirConSalto("Ingrese el tipo de alimento del mamifero:");
						String tipoAlimento = con.leerLineaCompleta();

						con.imprimirConSalto("Ingrese el peso del mamífero:");
						float peso = con.leerNumeroFlotante();

						con.imprimirConSalto("Ingrese la altura del mamífero:");
						float altura = con.leerNumeroEntero();

						con.imprimirConSalto("Ingrese la edad del mamifero:");
						int edad = con.leerNumeroEntero();
						con.quemarLinea();

						con.imprimirConSalto("Ingrese la cantidad de pelaje del mamífero (mucho, medio poco, o nada):");
						String cantidadPelaje = con.leerLineaCompleta();

						con.imprimirConSalto("Ingrese el color de pelaje del mamífero:");
						String colorPelaje = con.leerLineaCompleta();

						con.imprimirConSalto("Ingrese el tipo de dientes del mamifero:");
						String tipoDiente = con.leerLineaCompleta();

						con.imprimirConSalto("Ingrese el medio de desplazamiento del mamifero:");
						String medioDesplazamiento = con.leerLineaCompleta();

						con.imprimirConSalto("Ingrese el numero de dientes del mamifero:");
						int numeroDiente = con.leerNumeroEntero();

						listaMamiferos.add(new Mamifero(nombre, especie, tipoHabitat, tipoAlimento, peso, altura, edad,
								cantidadPelaje, colorPelaje, tipoDiente, medioDesplazamiento, numeroDiente));

						con.imprimirConSalto("-> ¡Información guardada exitosamente!");
						con.imprimirConSalto("--------------------------");

					}
					break;

				}
				case 5: {
					con.imprimirConSalto("-> Ingrese el tipo de alimento del animal:");
					String comida = con.leerLineaCompleta();

					con.imprimirConSalto(listaMamiferos.get(0).alimentarse(comida));
					break;
				}
				case 6: {
					break;
				}

				case 99: {// RETORNAR AL MENU PRINCIPAL
					con.imprimirConSalto("Ha seleccionado la opción 5: Retornar al menú principal");
					break;
				}
				default:
					con.imprimirConSalto("* OPCIÓN INVÁLIDA. SELECCIONE UNO DE LOS VALORES DADOS >:(");
					break;
				}

				break;
			}
			case 3: { // PEZ
				con.imprimirConSalto("--- ¡Ha seleccionado la opción 3: Pez ---");
				con.imprimirConSalto(
						"-> A continuación, seleccione la opción que desea realizar:" + "\n1. Agregar información"
								+ "\n2. Mostrar información guardada" + "\n3. Eliminar un animal de la lista"
								+ "\n4.Actualizar información de un animal" + "\n5. Alimentación de un animal"
								+ "\n6. Superficie de descanso de un animal" + "\n99. Retornar al menú principal");

				int opcionPez = con.leerNumeroEntero();

				switch (opcionPez) {
				case 1: { // AGREGAR PEZ
					con.imprimirConSalto("Ha seleccionado la opción 1: Agregar información de un pez.");
					mostrarMenuPez();
					break;
				}
				case 2: { // MOSTRAR PECES
					con.imprimirConSalto("Ha seleccionado la opción 2: Mostrar información de los peces");
					for (Pez pez : listaPeces) {
						con.imprimirConSalto(pez.toString());
					}
					break;
				}
				case 3: {
					con.imprimirConSalto("Ha seleccionado la opción 3: Eliminar un animal de la lista");
					con.imprimirConSalto("-> Inserte la posición que desea eliminar de la lista");
					int dato = con.leerNumeroEntero();

					if (listaPeces.size() <= dato || dato < 0) { // size() es el n
						con.imprimirConSalto("* Error al eliminar el pez. Dicha posición no existe!");
					} else {
						listaPeces.remove(dato);
						con.imprimirConSalto("¡! Pez eliminado exitosamente de la lista");
					}
					break;
				}
				case 4: {
					con.imprimirConSalto("Ha seleccionado la opción 4: Actualizar un animal de la lista");
					con.imprimirConSalto("-> Inserte la posición que desea actualizar de la lista");
					int dato = con.leerNumeroEntero();

					if (listaPeces.size() <= dato || dato < 0) { // size() es el n
						con.imprimirConSalto("* Error al actualizar el pez. Dicha posición no existe!");
					} else {
						con.imprimirConSalto("-> A continuación ingrese la información del pez:");

						con.imprimirConSalto("Ingrese el nombre del pez:");
						String nombre = con.leerLineaCompleta();

						con.imprimirConSalto("Ingrese la especie del pez:");
						String especie = con.leerLineaCompleta();

						con.imprimirConSalto("Ingrese el habitat del pez:");
						String habitat = con.leerLineaCompleta();

						con.imprimirConSalto("Ingrese el tipo de alimento del pez:");
						String tipoAlimento = con.leerLineaCompleta();

						con.imprimirConSalto("Ingrese el peso del pez:");
						float peso = con.leerNumeroFlotante();

						con.imprimirConSalto("Ingrese la altura del pez:");
						float altura = con.leerNumeroFlotante();

						con.imprimirConSalto("Ingrese la edad del pez:");
						int edad = con.leerNumeroEntero();
						con.quemarLinea();

						con.imprimirConSalto("Ingrese el tipo de agua del pez (salada / dulce):");
						String tipoAgua = con.leerLineaCompleta();

						con.imprimirConSalto("Ingrese el color de las escamas del pez:");
						String colorEscama = con.leerLineaCompleta();

						con.imprimirConSalto("Ingrese el tipo de respiracion del pez:");
						String tipoRespiracion = con.leerLineaCompleta();

						con.imprimirConSalto("Ingrese el numero de aletas que tiene el pez:");
						int numeroAleta = con.leerNumeroEntero();

						con.imprimirConSalto("Ingrese la profundidad mazima que alcanza el pez:");
						double profundidadMaxima = con.leerNumeroDoble();

						Pez pez = new Pez(nombre, especie, habitat, tipoAlimento, peso, altura, edad, tipoAgua,
								colorEscama, tipoRespiracion, numeroAleta, profundidadMaxima);
						listaPeces.add(pez);// agrega al final de la lista

						con.imprimirConSalto("-> ¡Información guardada exitosamente!");
						con.imprimirConSalto("--------------------------");
					}
					break;
				}
				case 5: {
					con.imprimirConSalto("-> Ingrese el tipo de alimento del animal:");
					String tipoAlimentacion = con.leerLineaCompleta();

					con.imprimirConSalto(listaPeces.get(0).alimentarse(tipoAlimentacion));
					break;
				}
				case 6: {
					break;
				}

				case 99: { // RETORNAR AL MENU PRINCIPAL
					con.imprimirConSalto("Ha seleccionado la opción 3: Retornar al menú principal");
					break;
				}
				default:
					con.imprimirConSalto("* OPCIÓN INVÁLIDA. SELECCIONE UNO DE LOS VALORES DADOS >:(");
					break;
				}
				break;
			}
			case 4: { // REPTIL
				con.imprimirConSalto("--- ¡Ha seleccionado la opción 4: Reptil ---");
				con.imprimirConSalto(
						"-> A continuación, seleccione la opción que desea realizar:" + "\n1. Agregar información"
								+ "\n2. Mostrar información guardada" + "\n3. Eliminar un animal de la lista"
								+ "\n4.Actualizar información de un animal" + "\n5. Alimentación de un animal"
								+ "\n6. Superficie de descanso de un animal" + "\n99. Retornar al menú principal");

				int opcionReptil = con.leerNumeroEntero();

				switch (opcionReptil) {
				case 1: { // AGREGAR INFORMACION DE REPTIL
					con.imprimirConSalto("Ha seleccionado la opción 1: Agregar información de un reptil.");
					break;
				}
				case 2: { // MOSTRAR INFORMACION REPTILES
					con.imprimirConSalto("Ha seleccionado la opción 2: Mostrar información de los reptiles");
					break;
				}
				case 3: {// ELIMINAR REPTIL
					con.imprimirConSalto("Ha seleccionado la opción 3: Eliminar un animal de la lista");
					con.imprimirConSalto("-> Inserte la posición que desea eliminar de la lista");
					int dato = con.leerNumeroEntero();

					if (listaReptiles.size() <= dato || dato < 0) { // size() es el n
						con.imprimirConSalto("* Error al eliminar el reptil. Dicha posición no existe!");
					} else {
						listaReptiles.remove(dato);
						con.imprimirConSalto("¡! Reptil eliminado exitosamente de la lista");
					}
					break;
				}
				case 4: {// ACTUALIZAR REPTIL
					con.imprimirConSalto("Ha seleccionado la opción 4: Actualizar un animal de la lista");
					con.imprimirConSalto("-> Inserte la posición que desea actualizar de la lista");
					int dato = con.leerNumeroEntero();

					if (listaReptiles.size() <= dato || dato < 0) { // size() es el n
						con.imprimirConSalto("* Error al actualizar el reptil. Dicha posición no existe!");
					} else {
						con.imprimirConSalto("-> A continuación ingrese la información del reptil:");
						con.quemarLinea();

						con.imprimirConSalto("Ingrese el nombre del reptil:");
						String nombre = con.leerLineaCompleta();

						con.imprimirConSalto("Ingrese la especie del reptil:");
						String especie = con.leerLineaCompleta();

						con.imprimirConSalto("Ingrese el habitat del reptil:");
						String habitat = con.leerLineaCompleta();

						con.imprimirConSalto("Ingrese el tipo de alimento del reptil:");
						String tipoAlimento = con.leerLineaCompleta();

						con.imprimirConSalto("Ingrese el peso del reptil:");
						float peso = con.leerNumeroFlotante();

						con.imprimirConSalto("Ingrese la altura del reptil:");
						float altura = con.leerNumeroFlotante();

						con.imprimirConSalto("Ingrese la edad del reptil:");
						int edad = con.leerNumeroEntero();
						con.quemarLinea();

						con.imprimirConSalto("Ingrese el tipo de desplazamiento del reptil(): ");
						String tipoDesplazamiento = con.leerLineaCompleta();

						con.imprimirConSalto("Ingrese el tipo de dientes que tiene el reptil():");
						String tipoDiente = con.leerLineaCompleta();

						con.imprimirConSalto("Ingrese la temperatura corporal del reptil:");
						float temperaturaCorporal = con.leerNumeroFlotante();

						con.imprimirConSalto("Ingrese si el reptil es venenoso o no (si/no):");
						boolean esVenenoso = con.leerNumeroBooleano(); // con.quemarLinea();

						con.imprimirConSalto("Ingrese si el reptil es ectoformo o no (si/no):");
						boolean esEctoformo = con.leerNumeroBooleano();

						listaReptiles.add(new Reptil(nombre, especie, habitat, tipoAlimento, peso, altura, edad,
								tipoDesplazamiento, tipoDiente, temperaturaCorporal, esVenenoso, esEctoformo));
						// esta es la forma diego rodriguez, se utiliza mas en competitiva

						con.imprimirConSalto("-> ¡Información guardada exitosamente!");
						con.imprimirConSalto("--------------------------");

					}
					break;
				}
				case 5: {
					con.imprimirConSalto("-> Ingrese el tipo de alimento del animal:");
					String tipoAlimentacion = con.leerLineaCompleta();

					con.imprimirConSalto(listaReptiles.get(0).alimentarse(tipoAlimentacion));
					
					break;
				}
				case 6: {
					break;
				}
				case 99: { // RETORNAR AL MENU PRINCIPAL
					con.imprimirConSalto("Ha seleccionado la opción 99: Retornar al menú principal");
					break;
				}
				default:
					con.imprimirConSalto("* OPCIÓN INVÁLIDA. SELECCIONE UNO DE LOS VALORES DADOS >:(");
					break;
				}
				break;
			}
			case 99: { // SALIR DEL APLICATIVO
				con.imprimirConSalto("-> Ha seleccionado salir del programa. ¡Que tenga buen día! :D");
				break cicloPrincipal;
			}
			default:
				con.imprimirConSalto("* OPCIÓN INVÁLIDA. SELECCIONE UNO DE LOS VALORES DADOS >:(");
			}

		}

	}

	public void mostrarMenuMamifero() {
		con.imprimirConSalto("-> A continuación ingrese la información del mamífero:");
		con.quemarLinea();
		con.imprimirConSalto("Ingrese el nombre del mamifero:");
		String nombre = con.leerLineaCompleta();

		con.imprimirConSalto("Ingrese la especie del mamífero:");
		String especie = con.leerLineaCompleta();

		con.imprimirConSalto("Ingrese el hábitat del mamífero:");
		String tipoHabitat = con.leerLineaCompleta();

		con.imprimirConSalto("Ingrese el tipo de alimento del mamifero:");
		String tipoAlimento = con.leerLineaCompleta();

		con.imprimirConSalto("Ingrese el peso del mamífero:");
		float peso = con.leerNumeroFlotante();

		con.imprimirConSalto("Ingrese la altura del mamífero:");
		float altura = con.leerNumeroEntero();

		con.imprimirConSalto("Ingrese la edad del mamifero:");
		int edad = con.leerNumeroEntero();
		con.quemarLinea();

		con.imprimirConSalto("Ingrese la cantidad de pelaje del mamífero (mucho, poco, o nada):");
		String cantidadPelaje = con.leerLineaCompleta();

		con.imprimirConSalto("Ingrese el color de pelaje del mamífero (mucho, poco, o nada):");
		String colorPelaje = con.leerLineaCompleta();

		con.imprimirConSalto("Ingrese el tipo de dientes del mamifero:");
		String tipoDiente = con.leerLineaCompleta();

		con.imprimirConSalto("Ingrese el medio de desplazamiento del mamifero:");
		String medioDesplazamiento = con.leerLineaCompleta();

		con.imprimirConSalto("Ingrese el numero de dientes del mamifero:");
		int numeroDiente = con.leerNumeroEntero();

		listaMamiferos.add(new Mamifero(nombre, especie, tipoHabitat, tipoAlimento, peso, altura, edad, cantidadPelaje,
				colorPelaje, tipoDiente, medioDesplazamiento, numeroDiente));

		con.imprimirConSalto("-> ¡Información guardada exitosamente!");
		con.imprimirConSalto("--------------------------");
	}

	public void mostrarMenuAve() {
		con.imprimirConSalto("-> A continuación ingrese la información del ave:");
		con.quemarLinea();

		con.imprimirConSalto("Ingrese el nombre del ave:");
		String nombre = con.leerLineaCompleta();

		con.imprimirConSalto("Ingrese la especie del ave:");
		String especie = con.leerLineaCompleta();
		// con.quemarLinea();

		con.imprimirConSalto("Ingrese el habitat del ave:");
		String habitat = con.leerLineaCompleta();

		con.imprimirConSalto("Ingrese el tipo de alimento del ave:");
		String tipoAlimento = con.leerLineaCompleta();

		con.imprimirConSalto("Ingrese el peso del ave:");
		float peso = con.leerNumeroFlotante();

		con.imprimirConSalto("Ingrese la altura del ave:");
		float altura = con.leerNumeroFlotante();

		con.imprimirConSalto("Ingrese la edad del ave:");
		int edad = con.leerNumeroEntero();
		con.quemarLinea();

		con.imprimirConSalto("Ingrese la forma de la pata del ave ( bla / bla / bla):");
		String formaPata = con.leerLineaCompleta();

		con.imprimirConSalto("Ingrese el color de las plumas del ave:");
		String colorPluma = con.leerLineaCompleta();

		con.imprimirConSalto("Ingrese la cantidad de huevos que pone el ave:");
		int cantidadHuevo = con.leerNumeroEntero();

		con.imprimirConSalto("Ingrese el tamaño del pico del ave (cm):");
		float tamanoPico = con.leerNumeroFlotante();
//		con.quemarLinea();

		con.imprimirConSalto("Ingrese si el ave es migratoria o no (si/no)");
		boolean esMigratoria = con.leerNumeroBooleano();

		listaAves.add(new Ave(nombre, especie, habitat, tipoAlimento, peso, altura, edad, formaPata, colorPluma,
				cantidadHuevo, tamanoPico, esMigratoria));

		con.imprimirConSalto("-> ¡Información guardada exitosamente!");
		con.imprimirConSalto("--------------------------");

	}

	public void mostrarMenuPez() {
		con.imprimirConSalto("-> A continuación ingrese la información del pez:");

		con.imprimirConSalto("Ingrese el nombre del pez:");
		String nombre = con.leerLineaCompleta();

		con.imprimirConSalto("Ingrese la especie del pez:");
		String especie = con.leerLineaCompleta();

		con.imprimirConSalto("Ingrese el habitat del pez:");
		String habitat = con.leerLineaCompleta();

		con.imprimirConSalto("Ingrese el tipo de alimento del pez:");
		String tipoAlimento = con.leerLineaCompleta();

		con.imprimirConSalto("Ingrese el peso del pez:");
		float peso = con.leerNumeroFlotante();

		con.imprimirConSalto("Ingrese la altura del pez:");
		float altura = con.leerNumeroFlotante();

		con.imprimirConSalto("Ingrese la edad del pez:");
		int edad = con.leerNumeroEntero();
		con.quemarLinea();

		con.imprimirConSalto("Ingrese el tipo de agua del pez (salada / dulce):");
		String tipoAgua = con.leerLineaCompleta();

		con.imprimirConSalto("Ingrese el color de las escamas del pez:");
		String colorEscama = con.leerLineaCompleta();

		con.imprimirConSalto("Ingrese el tipo de respiracion del pez:");
		String tipoRespiracion = con.leerLineaCompleta();

		con.imprimirConSalto("Ingrese el numero de aletas que tiene el pez:");
		int numeroAleta = con.leerNumeroEntero();

		con.imprimirConSalto("Ingrese la profundidad mazima que alcanza el pez:");
		double profundidadMaxima = con.leerNumeroDoble();

		Pez pez = new Pez(nombre, especie, habitat, tipoAlimento, peso, altura, edad, tipoAgua, colorEscama,
				tipoRespiracion, numeroAleta, profundidadMaxima);
		listaPeces.add(pez);// agrega al final de la lista

		con.imprimirConSalto("-> ¡Información guardada exitosamente!");
		con.imprimirConSalto("--------------------------");
	}

	public void mostrarMenuReptil() {
		con.imprimirConSalto("-> A continuación ingrese la información del reptil:");
		con.quemarLinea();

		con.imprimirConSalto("Ingrese el nombre del reptil:");
		String nombre = con.leerLineaCompleta();

		con.imprimirConSalto("Ingrese la especie del reptil:");
		String especie = con.leerLineaCompleta();

		con.imprimirConSalto("Ingrese el habitat del reptil:");
		String habitat = con.leerLineaCompleta();

		con.imprimirConSalto("Ingrese el tipo de alimento del reptil:");
		String tipoAlimento = con.leerLineaCompleta();

		con.imprimirConSalto("Ingrese el peso del reptil:");
		float peso = con.leerNumeroFlotante();

		con.imprimirConSalto("Ingrese la altura del reptil:");
		float altura = con.leerNumeroFlotante();

		con.imprimirConSalto("Ingrese la edad del reptil:");
		int edad = con.leerNumeroEntero();
		con.quemarLinea();

		con.imprimirConSalto("Ingrese el tipo de desplazamiento del reptil(): ");
		String tipoDesplazamiento = con.leerLineaCompleta();

		con.imprimirConSalto("Ingrese el tipo de dientes que tiene el reptil():");
		String tipoDiente = con.leerLineaCompleta();

		con.imprimirConSalto("Ingrese la temperatura corporal del reptil:");
		float temperaturaCorporal = con.leerNumeroFlotante();

		con.imprimirConSalto("Ingrese si el reptil es venenoso o no (si/no):");
		boolean esVenenoso = con.leerNumeroBooleano(); // con.quemarLinea();

		con.imprimirConSalto("Ingrese si el reptil es ectoformo o no (si/no):");
		boolean esEctoformo = con.leerNumeroBooleano();
		
		

		listaReptiles.add(new Reptil(nombre, especie, habitat, tipoAlimento, peso, altura, edad, tipoDesplazamiento,
				tipoDiente, temperaturaCorporal, esVenenoso, esEctoformo));
		// esta es la forma diego rodriguez, se utiliza mas en competitiva

		con.imprimirConSalto("-> ¡Información guardada exitosamente!");
		con.imprimirConSalto("--------------------------");
	}

}
