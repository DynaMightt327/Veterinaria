package co.edu.unbosque.model;

public class Persona {
	
	private String nombre;
	private String correo;
	private long numeroTelefono;
	private long numeroDocumento;
	
	public Persona() {
		// TODO Auto-generated constructor stub
	}

	public Persona(String nombre, String correo, long numeroTelefono, long numeroDocumento) {
		super();
		this.nombre = nombre;
		this.correo = correo;
		this.numeroTelefono = numeroTelefono;
		this.numeroDocumento = numeroDocumento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public long getNumeroTelefono() {
		return numeroTelefono;
	}

	public void setNumeroTelefono(long numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}

	public long getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(long numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	@Override
	public String toString() {
		return "==Informacion persona== \nNombre: " + nombre + "\nCorreo:" + correo + "\nNumero Telefono: " + numeroTelefono
				+ "\nNumero Documento: " + numeroDocumento;
	}
	
	

}
