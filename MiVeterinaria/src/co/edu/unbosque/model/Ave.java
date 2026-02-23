package co.edu.unbosque.model;

public class Ave extends Animal{

	private String formaPata;
	private String colorPluma;
	private int cantidadHuevo;
	private float tamanoPico;
	private boolean esMigratoria;
	
	public Ave() {
		// TODO Auto-generated constructor stub
	}

	public Ave(String formaPata, String colorPluma, int cantidadHuevo, float tamanoPico, boolean esMigratoria) {
		super();
		this.formaPata = formaPata;
		this.colorPluma = colorPluma;
		this.cantidadHuevo = cantidadHuevo;
		this.tamanoPico = tamanoPico;
		this.esMigratoria = esMigratoria;
	}

	public Ave(String nombre, String especie, String habitat, String tipoAlimento, float peso, float altura, int edad,
			String formaPata, String colorPluma, int cantidadHuevo, float tamanoPico, boolean esMigratoria) {
		super(nombre, especie, habitat, tipoAlimento, peso, altura, edad);
		this.formaPata = formaPata;
		this.colorPluma = colorPluma;
		this.cantidadHuevo = cantidadHuevo;
		this.tamanoPico = tamanoPico;
		this.esMigratoria = esMigratoria;
	}

	public Ave(String nombre, String especie, String habitat, String tipoAlimento, float peso, float altura, int edad) {
		super(nombre, especie, habitat, tipoAlimento, peso, altura, edad);
		// TODO Auto-generated constructor stub
	}

	public String getFormaPata() {
		return formaPata;
	}

	public void setFormaPata(String formaPata) {
		this.formaPata = formaPata;
	}

	public String getColorPluma() {
		return colorPluma;
	}

	public void setColorPluma(String colorPluma) {
		this.colorPluma = colorPluma;
	}

	public int getCantidadHuevo() {
		return cantidadHuevo;
	}

	public void setCantidadHuevo(int cantidadHuevo) {
		this.cantidadHuevo = cantidadHuevo;
	}

	public float getTamanoPico() {
		return tamanoPico;
	}

	public void setTamanoPico(float tamanoPico) {
		this.tamanoPico = tamanoPico;
	}

	public boolean isEsMigratoria() {
		return esMigratoria;
	}

	public void setEsMigratoria(boolean esMigratoria) {
		this.esMigratoria = esMigratoria;
	}

	@Override
	public String alimentarse(String comida) {
		if(comida.equalsIgnoreCase("Piedras") || comida.equalsIgnoreCase("Plástico") || comida.equalsIgnoreCase("Metal")) {
			return "El ave no puede digerir " + comida + " porque c pueden morir D:";
		}else {
			return "El ave si puede digerir " + comida + ":D!! ";
			
		}
	}

	@Override
	public String dormir(String superficie) {
		if(superficie.equalsIgnoreCase("Jaula")|| superficie.equalsIgnoreCase("Haula")) {
			return "El ave puede dormir en " + superficie + " :D!!";
		}else {
			return "El ave no puede dormir en " + superficie + " porque no es adecuado D:";
		}
	}

	@Override
	public String toString() {
		return super.toString() + "==Datos Puntuales==Forma Pata:" + formaPata + "\nColor Plumas:" + colorPluma + "\nCantidad Huevos:" + cantidadHuevo
				+ "\nTamaño Pico:" + tamanoPico + "\nEs Migratoria:" + esMigratoria + "----------------";
	}
	
}
