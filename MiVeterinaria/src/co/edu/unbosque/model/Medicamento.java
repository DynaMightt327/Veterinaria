package co.edu.unbosque.model;

public class Medicamento extends Producto{
	
	private String nombreComercial;
	private String nombreCientifico;
	private String fechaCaducidad;
	private boolean estaDisponible;
	private float dosis;
	
	
	public Medicamento() {
		// TODO Auto-generated constructor stub
	}

	
	public Medicamento(String nombreComercial, String nombreCientifico, String fechaCaducidad, boolean estaDisponible,
			float dosis) {
		super();
		this.nombreComercial = nombreComercial;
		this.nombreCientifico = nombreCientifico;
		this.fechaCaducidad = fechaCaducidad;
		this.estaDisponible = estaDisponible;
		this.dosis = dosis;
	}


	public Medicamento(String marca, float precio, int idProducto, String nombreComercial, String nombreCientifico,
			String fechaCaducidad, boolean estaDisponible, float dosis) {
		super(marca, precio, idProducto);
		this.nombreComercial = nombreComercial;
		this.nombreCientifico = nombreCientifico;
		this.fechaCaducidad = fechaCaducidad;
		this.estaDisponible = estaDisponible;
		this.dosis = dosis;
	}


	public Medicamento(String marca, float precio, int idProducto) {
		super(marca, precio, idProducto);
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return super.toString() + "==Medicamento== \nNombre Comercial: " + nombreComercial + "\nNombre Cientifico: " + nombreCientifico
				+ "\nHay Disponibilidad?:" + estaDisponible + "\nDosis: " + dosis + "\nFecha Caducidad: " + fechaCaducidad +  "------------------";
	}
	
	

}
