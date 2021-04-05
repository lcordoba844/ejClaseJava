package ejClaseJava;

public class Administrativo extends Empleado {

	double hsExtra, hsMes;

	public void cargaAdmin(double sueldoBase, String nombre, String apellido, String dni, String mail, double hsExtra,
			double hsMes) {
		this.setDni(dni);
		this.setNombre(nombre);
		this.setApellido(apellido);
		this.setMail(mail);
		this.setSueldo(sueldoBase);
		this.setHsExtra(hsExtra);
		this.setHsMes(hsMes);
		
	}

	public double getSueldo() {

		double sueldoAdmin = super.getSueldo() * ((this.hsExtra * 1.5) + this.hsMes) / this.hsMes;

		return sueldoAdmin;
	}
	
	//get y set hsExtra
	public double getHsExtra() {return this.hsExtra;}
	public void setHsExtra(double hsExtra) {this.hsExtra = hsExtra;}
	
	//get y set hsMes
	public double getHsMes() {return this.hsMes;}
	public void setHsMes(double hsMes) {this.hsMes = hsMes;}
	
}
