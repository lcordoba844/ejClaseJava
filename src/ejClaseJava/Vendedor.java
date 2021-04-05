package ejClaseJava;

public class Vendedor extends Empleado {

	private double totalVentas; 
	private double porcenComision;

	public void cargaVendedor(double sueldoBase, String nombre, String apellido, String dni, String mail,
			double totalVentas, double porcenComision) {
			this.setDni(dni);
			this.setNombre(nombre);
			this.setApellido(apellido);
			this.setMail(mail);
			this.setSueldo(sueldoBase);
			this.setTotalVentas(totalVentas);
			this.setPorcenComision(porcenComision);
	}
	
	//get Sueldo override
	
	@Override
	public double getSueldo() {

		double sueldoVendedor = super.getSueldo() + (this.porcenComision * (this.totalVentas / 100));

		return sueldoVendedor;
		}
	
	
	//get y set totalVentas
	public double getTotalVentas() {return totalVentas;}
	public void setTotalVentas(double totalVentas) {this.totalVentas= totalVentas;}
	
	//get y set porcenComision
		public double getPorcenComision() {return porcenComision;}
		public void setPorcenComision(double porcentaje) {this.porcenComision = porcentaje;}

}
