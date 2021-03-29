package elBigProject;

public abstract class Empleado {

	String dni, nombre, apellido, mail;
	double sueldoBase;

	public double getSueldo() {

		return this.sueldoBase;
	}

}
