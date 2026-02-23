package co.edu.unbosque.model;

public class Veterinario extends Persona{
	
	private int numeroLicencia;
	private int horasTrabajo;
	private double salario;
	private String cargo; //cual es su funcion en el trabajo? que tiene que hacer en la veterinaria?
	
	public Veterinario() {
		// TODO Auto-generated constructor stub
	}

	public Veterinario(int numeroLicencia, int horasTrabajo, double salario, String cargo) {
		super();
		this.numeroLicencia = numeroLicencia;
		this.horasTrabajo = horasTrabajo;
		this.salario = salario;
		this.cargo = cargo;
	}

	public int getNumeroLicencia() {
		return numeroLicencia;
	}

	public void setNumeroLicencia(int numeroLicencia) {
		this.numeroLicencia = numeroLicencia;
	}

	public int getHorasTrabajo() {
		return horasTrabajo;
	}

	public void setHorasTrabajo(int horasTrabajo) {
		this.horasTrabajo = horasTrabajo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	@Override
	public String toString() {
		return super.toString() + "==Veterinario== \nNumero Licencia: " + numeroLicencia + "\nHoras Trabajo: " + horasTrabajo + "nSalario: "
				+ salario + "\nCargo:" + cargo + "-----------------";
	}
	
	
	
	

}
