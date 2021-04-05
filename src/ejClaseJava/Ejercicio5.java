package ejClaseJava;

import java.text.DecimalFormat;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Ejercicio5 {

	static DecimalFormat df = new DecimalFormat("#.00");

	public static void main1() {
		int i = 0;
		ArrayList<Empleado> empleados = new ArrayList<Empleado>();
		boolean band_carga = true;
		while (band_carga == true && i < 5) {

			String tipoEmpleado = JOptionPane
					.showInputDialog("Ingrese el tipo siguiente empleado a cargar (V=vendedor, A=administrativo): ");

			if (tipoEmpleado.equalsIgnoreCase("a")) {
				Administrativo a = new Administrativo();
				a.setNombre(JOptionPane.showInputDialog("Ingrese nombre del administrador: "));
				a.setApellido(JOptionPane.showInputDialog("Ingrese apellido del administrador: "));
				a.setDni(JOptionPane.showInputDialog("Ingrese dni del administrador: "));
				a.setMail(JOptionPane.showInputDialog("Ingrese mail del administrador: "));
				a.setSueldo(Double.parseDouble(JOptionPane.showInputDialog("Ingrese sueldo base del administrador: ")));
				
				a.setHsExtra(Double.parseDouble(JOptionPane.showInputDialog("Ingrese cantidad de horas extra: ")));
				a.setHsMes(Double.parseDouble(JOptionPane.showInputDialog("Ingrese cantidad de horas trabajadas al Mes: ")));
				
				empleados.add(a);

			} else if (tipoEmpleado.equalsIgnoreCase("v")) {
				Vendedor v = new Vendedor();
				v.setNombre(JOptionPane.showInputDialog("Ingrese nombre del vendedor: "));
				v.setApellido(JOptionPane.showInputDialog("Ingrese apellido del vendedor: "));
				v.setDni(JOptionPane.showInputDialog("Ingrese dni del vendedor: "));
				v.setMail(JOptionPane.showInputDialog("Ingrese mail del vendedor: "));
				v.setSueldo(Double.parseDouble(JOptionPane.showInputDialog("Ingrese sueldo base del vendedor: ")));
				v.setTotalVentas(Double.parseDouble(JOptionPane.showInputDialog("Ingrese total de ventas del vendedor: ")));
				v.setPorcenComision(Double.parseDouble(JOptionPane.showInputDialog("Ingrese porcentaje de comision del vendedor: ")));
				
				empleados.add(v);
			}
			
			// VOLVER A PONER 20 EMPLEADOS POR DEFECTO. 5 Empleados era para testear.
			String yesNo = JOptionPane.showInputDialog("Desea cargar otro empleado? (Y/N):  ");
			if (yesNo.equalsIgnoreCase("N") || i == 4) {
				if (i != 4)
					band_carga = false;
				else {
					JOptionPane.showMessageDialog(null, "Ya ingreso 5 empleados. cantEmpleados=" + (i + 1));
				}
			}
			i++;
		}

		for (Empleado e : empleados) {
			JOptionPane.showInternalMessageDialog(null,
					"Nombre: " + e.nombre + " " + e.apellido + "\n Dni:" + e.dni + "\n Tipo Empleado:"
							+ e.getClass().getSimpleName() + "\n Sueldo: " + df.format(e.getSueldo()));
		}
	}
	//En realidad es el ejercicio 6 porque use ArrayList
}
