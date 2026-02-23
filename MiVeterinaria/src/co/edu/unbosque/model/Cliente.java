package co.edu.unbosque.model;

public class Cliente extends Persona{
	
	private String nombreMascota;
	private String direccion;
	private String razonVisita;
	private boolean esClienteNuevo;
	public Cliente() {
		// TODO Auto-generated constructor stub
	}
	public Cliente(String nombreMascota, String direccion, String razonVisita, boolean esClienteNuevo) {
		super();
		this.nombreMascota = nombreMascota;
		this.direccion = direccion;
		this.razonVisita = razonVisita;
		this.esClienteNuevo = esClienteNuevo;
	}
	public String getNombreMascota() {
		return nombreMascota;
	}
	public void setNombreMascota(String nombreMascota) {
		this.nombreMascota = nombreMascota;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getRazonVisita() {
		return razonVisita;
	}
	public void setRazonVisita(String razonVisita) {
		this.razonVisita = razonVisita;
	}
	public boolean isEsClienteNuevo() {
		return esClienteNuevo;
	}
	public void setEsClienteNuevo(boolean esClienteNuevo) {
		this.esClienteNuevo = esClienteNuevo;
	}
	@Override
	public String toString() {
		return super.toString() + "Cliente [nombreMascota=" + nombreMascota + ", direccion=" + direccion + ", razonVisita=" + razonVisita
				+ ", esClienteNuevo=" + esClienteNuevo + "]";
	}
	
	
	

}
