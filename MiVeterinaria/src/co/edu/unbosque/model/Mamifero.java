package co.edu.unbosque.model;

public class Mamifero extends Animal implements CapacidadAnimal {

	// public, private, protected, vacio
	private String cantidadPelaje;
	private String colorPelaje;
	private String tipoDiente;
	private String medioDesplazamiento;
	private int numeroDiente;

	public Mamifero() {
		// TODO Auto-generated constructor stub
	}

	public Mamifero(String cantidadPelaje, String colorPelaje, String tipoDientes, String medioDesplazamiento,
			int numeroDiente) {
		super();
		this.cantidadPelaje = cantidadPelaje;
		this.colorPelaje = colorPelaje;
		this.tipoDiente = tipoDientes;
		this.medioDesplazamiento = medioDesplazamiento;
		this.numeroDiente = numeroDiente;
	}

	public Mamifero(String nombre, String especie, String habitat, String tipoAlimento, float peso, float altura,
			int edad, String cantidadPelaje, String colorPelaje, String tipoDientes, String medioDesplazamiento,
			int numeroDiente) {
		super(nombre, especie, habitat, tipoAlimento, peso, altura, edad);
		this.cantidadPelaje = cantidadPelaje;
		this.colorPelaje = colorPelaje;
		this.tipoDiente = tipoDientes;
		this.medioDesplazamiento = medioDesplazamiento;
		this.numeroDiente = numeroDiente;
	}

	public Mamifero(String nombre, String especie, String habitat, String tipoAlimento, float peso, float altura,
			int edad) {
		super(nombre, especie, habitat, tipoAlimento, peso, altura, edad);
		// TODO Auto-generated constructor stub
	}

	public String getCantidadPelaje() {
		return cantidadPelaje;
	}

	public void setCantidadPelaje(String cantidadPelaje) {
		this.cantidadPelaje = cantidadPelaje;
	}

	public String getColorPelaje() {
		return colorPelaje;
	}

	public void setColorPelaje(String colorPelaje) {
		this.colorPelaje = colorPelaje;
	}

	public String getTipoDiente() {
		return tipoDiente;
	}

	public void setTipoDiente(String tipoDiente) {
		this.tipoDiente = tipoDiente;
	}

	public String getMedioDesplazamiento() {
		return medioDesplazamiento;
	}

	public void setMedioDesplazamiento(String medioDesplazamiento) {
		this.medioDesplazamiento = medioDesplazamiento;
	}

	public int getNumeroDiente() {
		return numeroDiente;
	}

	public void setNumeroDiente(int numeroDiente) {
		this.numeroDiente = numeroDiente;
	}

	@Override
	public String alimentarse(String comida) {
		if (comida.equalsIgnoreCase("Piedras") || comida.equalsIgnoreCase("Plástico")
				|| comida.equalsIgnoreCase("Metal")) {
			return "El mamifero no puede digerir " + comida + " porque c pueden morir D:";
		} else {
			return "El mamífero si puede digerir " + comida + ":D!! ";

		}
	}

	@Override
	public String dormir(String superficie) {
		if (superficie.equalsIgnoreCase("Haula") || superficie.equalsIgnoreCase("Jaula")) {
			return "El mamífero dormirá en " + superficie;
		} else {
			return "El mamifero no puede dormir en " + superficie + " porque no es adecuado";
		}
	}

	@Override
	public String toString() {
		return super.toString() + "==Datos Puntuales== Cantidad Pelaje:" + cantidadPelaje + "\nColor Pelaje:"
				+ colorPelaje + "Tipo Dientes:" + tipoDiente + "\nMedio Desplazamiento:" + medioDesplazamiento
				+ "\nNumero Dientes:" + numeroDiente + "----------------";
	}

	@Override
	public String reproducirse(String ritualApareamiento) {
		if (ritualApareamiento.equalsIgnoreCase("")) {
			return "";
		} else {
			return "";
		}
	}

	@Override
	public String morir(String causa) {
		if (causa.equalsIgnoreCase("ahogamiento") || causa.equalsIgnoreCase("vejez")
				|| causa.equalsIgnoreCase("desnutricion") || causa.equalsIgnoreCase("depredación")
				|| causa.equalsIgnoreCase("enfermedad y/o parasitos")) {
			return "El mamifero se puede morir (o ya c murio) por " + causa;
		} else {
			return "El mamifero no podría morirse por " + causa;
		}
	}

}
