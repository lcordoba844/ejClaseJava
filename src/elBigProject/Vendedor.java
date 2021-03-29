package elBigProject;

public class Vendedor extends Empleado {

	double totalVentas, porcenComision;

	public void cargaVendedor(double sueldoBase, String nombre, String apellido, String dni, String mail,
			double totalVentas, double porcenComision) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.mail = mail;
		this.sueldoBase = sueldoBase;
		this.totalVentas = totalVentas;
		this.porcenComision = porcenComision;
	}

	public double getSueldo() {

		double sueldoVendedor = super.getSueldo() + (this.porcenComision * (this.totalVentas / 100));

		return sueldoVendedor;
	}

}
