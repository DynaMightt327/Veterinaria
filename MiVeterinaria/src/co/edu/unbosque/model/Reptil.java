package co.edu.unbosque.model;

public class Reptil extends Animal {

	private String tipoDesplazamiento;
	private String tipoDiente;
	private float temperaturaCorporal;
	private boolean esVenenoso;
	private boolean esEctotermo;
	
	public Reptil() {
		// TODO Auto-generated constructor stub
	}

	public Reptil(String tipoDesplazamiento, String tipoDiente, float temperaturaCorporal, boolean esVenenoso,
			boolean esEctotermo) {
		super();
		this.tipoDesplazamiento = tipoDesplazamiento;
		this.tipoDiente = tipoDiente;
		this.temperaturaCorporal = temperaturaCorporal;
		this.esVenenoso = esVenenoso;
		this.esEctotermo = esEctotermo;
	}

	public Reptil(String nombre, String especie, String habitat, String tipoAlimento, float peso, float altura,
			int edad, String tipoDesplazamiento, String tipoDiente, float temperaturaCorporal, boolean esVenenoso,
			boolean esEctotermo) {
		super(nombre, especie, habitat, tipoAlimento, peso, altura, edad);
		this.tipoDesplazamiento = tipoDesplazamiento;
		this.tipoDiente = tipoDiente;
		this.temperaturaCorporal = temperaturaCorporal;
		this.esVenenoso = esVenenoso;
		this.esEctotermo = esEctotermo;
	}

	public Reptil(String nombre, String especie, String habitat, String tipoAlimento, float peso, float altura,
			int edad) {
		super(nombre, especie, habitat, tipoAlimento, peso, altura, edad);
		// TODO Auto-generated constructor stub
	}

	public String getTipoDesplazamiento() {
		return tipoDesplazamiento;
	}

	public void setTipoDesplazamiento(String tipoDesplazamiento) {
		this.tipoDesplazamiento = tipoDesplazamiento;
	}

	public String getTipoDiente() {
		return tipoDiente;
	}

	public void setTipoDiente(String tipoDiente) {
		this.tipoDiente = tipoDiente;
	}

	public float getTemperaturaCorporal() {
		return temperaturaCorporal;
	}

	public void setTemperaturaCorporal(float temperaturaCorporal) {
		this.temperaturaCorporal = temperaturaCorporal;
	}

	public boolean isEsVenenoso() {
		return esVenenoso;
	}

	public void setEsVenenoso(boolean esVenenoso) {
		this.esVenenoso = esVenenoso;
	}

	public boolean isEsEctotermo() {
		return esEctotermo;
	}

	public void setEsEctotermo(boolean esEctotermo) {
		this.esEctotermo = esEctotermo;
	}

	
	@Override
	public String alimentarse(String comida) {
		if(comida.equalsIgnoreCase("Piedras") || comida.equalsIgnoreCase("Plástico")) {
			return "El reptil no puede digerir " + comida + " porque c pueden morir D:";
		}else if(comida.equalsIgnoreCase("Metal")) {
			return "El reptil podría morder metal más no comerlo :|";
		}
		else {
			return "El reptil si puede digerir " + comida + ":D!! ";
			
		}
	}

	@Override
	public String dormir(String superficie) {
		// TODO Auto-generated method stub
		return super.dormir(superficie);
	}

	@Override
	public String toString() {
		return super.toString() + "==Datos personales== \nTipo de Desplazamiento:" + tipoDesplazamiento + "\nTipo de Dientes:" + tipoDiente
				+ "\nTemperatura Corporal:" + temperaturaCorporal + "\nEs venenoso:" + esVenenoso + "\nEs ectotermo:"
				+ esEctotermo + "------------------";
	}
	

}
