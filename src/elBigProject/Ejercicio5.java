package elBigProject;

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
				String nombre = JOptionPane.showInputDialog("Ingrese nombre del vendedor: ");
				String apellido = JOptionPane.showInputDialog("Ingrese apellido del vendedor: ");
				String dni = JOptionPane.showInputDialog("Ingrese dni del vendedor: ");
				String mail = JOptionPane.showInputDialog("Ingrese mail del vendedor: ");
				double sueldoBase = Double
						.parseDouble(JOptionPane.showInputDialog("Ingrese sueldo base del administrador: "));
				double hsExtra = Double.parseDouble(JOptionPane.showInputDialog("Ingrese cantidad de horas extra: "));
				double hsMes = Double
						.parseDouble(JOptionPane.showInputDialog("Ingrese cantidad de horas trabajadas al Mes: "));
				a.cargaAdmin(sueldoBase, nombre, apellido, dni, mail, hsExtra, hsMes);
				empleados.add(a);

			} else if (tipoEmpleado.equalsIgnoreCase("v")) {
				Vendedor v = new Vendedor();
				String nombre = JOptionPane.showInputDialog("Ingrese nombre del vendedor: ");
				String apellido = JOptionPane.showInputDialog("Ingrese apellido del vendedor: ");
				String dni = JOptionPane.showInputDialog("Ingrese dni del vendedor: ");
				String mail = JOptionPane.showInputDialog("Ingrese mail del vendedor: ");
				double sueldoBase = Double
						.parseDouble(JOptionPane.showInputDialog("Ingrese sueldo base del vendedor: "));
				double totalVentas = Double
						.parseDouble(JOptionPane.showInputDialog("Ingrese total de ventas del vendedor: "));
				double porcenComision = Double
						.parseDouble(JOptionPane.showInputDialog("Ingrese porcentaje de comision del vendedor: "));
				v.cargaVendedor(sueldoBase, nombre, apellido, dni, mail, totalVentas, porcenComision);
				empleados.add(v);
			}
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
}
