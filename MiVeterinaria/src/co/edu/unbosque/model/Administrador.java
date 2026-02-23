package co.edu.unbosque.model;

public class Administrador extends Persona{
	
	private double salario;
	private int numeroEmpleado;
	private String horario;
	private String areaAsignada;
	
	public Administrador() {
		// TODO Auto-generated constructor stub
	}

	public Administrador(double salario, int numeroEmpleado, String horario, String areaAsignada) {
		super();
		this.salario = salario;
		this.numeroEmpleado = numeroEmpleado;
		this.horario = horario;
		this.areaAsignada = areaAsignada;
	}
	

	public Administrador(String nombre, String correo, long numeroTelefono, long numeroDocumento, double salario,
			int numeroEmpleado, String horario, String areaAsignada) {
		super(nombre, correo, numeroTelefono, numeroDocumento);
		this.salario = salario;
		this.numeroEmpleado = numeroEmpleado;
		this.horario = horario;
		this.areaAsignada = areaAsignada;
	}

	public Administrador(String nombre, String correo, long numeroTelefono, long numeroDocumento) {
		super(nombre, correo, numeroTelefono, numeroDocumento);
		// TODO Auto-generated constructor stub
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getNumeroEmpleado() {
		return numeroEmpleado;
	}

	public void setNumeroEmpleado(int numeroEmpleado) {
		this.numeroEmpleado = numeroEmpleado;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public String getAreaAsignada() {
		return areaAsignada;
	}

	public void setAreaAsignada(String areaAsignada) {
		this.areaAsignada = areaAsignada;
	}

	@Override
	public String toString() {
		return "Administrador [salario=" + salario + ", numeroEmpleado=" + numeroEmpleado + ", horario=" + horario
				+ ", areaAsignada=" + areaAsignada + "]";
	}
	
	

}
