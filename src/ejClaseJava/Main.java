package ejClaseJava;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//ejercicio1();
		//ejercicio2();
		//ejercicio3();
		//ejercicio4();
		Ejercicio5.main1();

	}

	public static void ejercicio1() {

		for (int i = 0; i < 10; i++) {
			System.out.println(i + 1);
		}

		for (int i = 0; i < 10; i++) {
			if (i % 2 != 0) {
				System.out.println("Numero impar: " + i);
			}

		}

	}

	public static void ejercicio2() {

		String[] a = new String[10];
		Scanner word = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			System.out.println("Ingrese su palabra p/ la posicion:" + i);
			a[i] = word.nextLine();
		}
		word.close();

		for (int i = a.length - 1; i >= 0; i--) {
			System.out.println("palabra a[" + (i) + "]" + a[i]);

		}

	}

	public static void ejercicio3() {
		Scanner lector = new Scanner(System.in);
		String[] palabras = new String[3];

		for (int i = 0; i < palabras.length; i++) {
			System.out.println("Ingrese palabra (posicion:" + i + "): ");
			palabras[i] = lector.nextLine();
		}
		System.out.println();
		System.out.println("Ingrese palabra a verificar");

		String palabraV = lector.nextLine();
		boolean band = false;
		for (String palabra : palabras) {
			if (palabra.equals(palabraV)) {
				System.out.println("La palabra ha sido ingresada.");
				band = true;
			}
		}
		if (band == false) {
			System.out.println("La palabra no ha sido ingresada.");
		}
		lector.close();

	}

	public static void ejercicio4() {
		Scanner lector = new Scanner(System.in);

		System.out.println("Ingrese un número: ");
		int numeroV = Integer.parseInt(lector.nextLine());

		Integer[] numeros = new Integer[20];
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Ingrese numero (posicion [" + i + "]");
			numeros[i] = Integer.parseInt(lector.nextLine());
		}
		int indiceNumMay = 0;
		Integer[] numerosMayores = new Integer[20];
		for (int numero : numeros) {
			if (numero > numeroV) {
				numerosMayores[indiceNumMay] = numero;
				indiceNumMay++;
			}
		}
		boolean bandera = false;
		for (int i = 0; i < numerosMayores.length; i++) {
			if (numerosMayores[i] != null) {
				System.out.println("Numero[" + i + "]:" + numerosMayores[i]);
				bandera = true;
			} else if (bandera == false) {
				System.out.println("No se encontraron numeros mayores al indicado.");
			}

		}
		lector.close();
	}

}