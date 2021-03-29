package ejClaseJava;

public class Administrativo extends Empleado {

	double hsExtra, hsMes;

	public void cargaAdmin(double sueldoBase, String nombre, String apellido, String dni, String mail, double hsExtra,
			double hsMes) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.mail = mail;
		this.sueldoBase = sueldoBase;
		this.hsExtra = hsExtra;
		this.hsMes = hsMes;
	}

	public double getSueldo() {

		double sueldoAdmin = super.getSueldo() * ((this.hsExtra * 1.5) + this.hsMes) / this.hsMes;

		return sueldoAdmin;
	}
}
