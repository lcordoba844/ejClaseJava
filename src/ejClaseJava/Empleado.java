package ejClaseJava;

public abstract class Empleado {

	String dni, nombre, apellido, mail;
	double sueldoBase;

	//get y set sueldo
	public double getSueldo() {return this.sueldoBase;}
	public void setSueldo(double nuevoSueldo) {this.sueldoBase = nuevoSueldo;}
	
	//get y set dni
	public String getDni() {return this.dni;}
	public void setDni(String nuevoDni) {this.dni = nuevoDni;}
	
	//get y set nombre
	public String getNombre() {return this.nombre;}
	public void setNombre(String nuevoNombre) {this.nombre = nuevoNombre;}
	
	//get y set apellido
	public String getApellido() {return this.apellido;}
	public void setApellido(String nuevoApellido) {this.apellido = nuevoApellido;}
	
	//get y set mail
	public String getMail() {return this.mail;}
	public void setMail(String nuevoMail) {this.mail = nuevoMail;}
}
