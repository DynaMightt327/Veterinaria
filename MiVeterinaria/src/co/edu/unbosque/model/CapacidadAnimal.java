package co.edu.unbosque.model;

public interface CapacidadAnimal {
	
	public final String TIPO_CELULA = "Celula eucariota"; //el final es para las constantes
	
	public String reproducirse(String ritualApareamiento); //ESTO ES LA FUNCION ABSTRACTA
	public String morir(String causa);
	

}
