package co.edu.unbosque.model;

public class Medicamento extends Producto{
	
	private String nombreComercial;
	private String nombreCientifico;
	private boolean estaDisponible;
	private float dosis;
	
	public Medicamento() {
		// TODO Auto-generated constructor stub
	}

	public Medicamento(String nombreComercial, String nombreCientifico, boolean estaDisponible, float dosis) {
		super();
		this.nombreComercial = nombreComercial;
		this.nombreCientifico = nombreCientifico;
		this.estaDisponible = estaDisponible;
		this.dosis = dosis;
	}

	public Medicamento(String marca, float precio, int idProducto, String nombreComercial, String nombreCientifico,
			boolean estaDisponible, float dosis) {
		super(marca, precio, idProducto);
		this.nombreComercial = nombreComercial;
		this.nombreCientifico = nombreCientifico;
		this.estaDisponible = estaDisponible;
		this.dosis = dosis;
	}

	public Medicamento(String marca, float precio, int idProducto) {
		super(marca, precio, idProducto);
		// TODO Auto-generated constructor stub
	}

	public String getNombreComercial() {
		return nombreComercial;
	}

	public void setNombreComercial(String nombreComercial) {
		this.nombreComercial = nombreComercial;
	}

	public String getNombreCientifico() {
		return nombreCientifico;
	}

	public void setNombreCientifico(String nombreCientifico) {
		this.nombreCientifico = nombreCientifico;
	}

	public boolean isEstaDisponible() {
		return estaDisponible;
	}

	public void setEstaDisponible(boolean estaDisponible) {
		this.estaDisponible = estaDisponible;
	}

	public float getDosis() {
		return dosis;
	}

	public void setDosis(float dosis) {
		this.dosis = dosis;
	}

	@Override
	public String toString() {
		return super.toString() + "==Medicamento== \nNombre Comercial: " + nombreComercial + "\nNombre Cientifico: " + nombreCientifico
				+ "\nEstá Disponible?:" + estaDisponible + "\nDosis: " + dosis + "------------------";
	}
	
	

}
