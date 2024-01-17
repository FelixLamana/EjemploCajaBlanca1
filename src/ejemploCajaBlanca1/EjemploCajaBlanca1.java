package ejemploCajaBlanca1;

import java.util.Scanner;
/**
 * Código de ejemplo de un ejercicio de caja blanca, donde se comprueba si un número es perfecto
 * 
 * @author Félix Lamana
 * @version 2.0
 *
 */
public class EjemploCajaBlanca1 {
	/**
	 * 
	 * @hidden
	 */
	public static void main(String[] args) {
		//Me creo la variable entrada para capturar por teclado el número que introduce el usuario
		Scanner entrada = new Scanner(System.in);
		System.out.print("Introduce un número mayor que 0:  ");
		int num = entrada.nextInt();
		System.out.print(CompruebaNumeroPerfecto(num));
	}
	/**
	 * El método CompruebaNumeroPerfecto comprueba si la suma de sus divisores es igual él mismo.
	 * @param num Variable de tipo entero que representa el número a comprobar si es perfecto o no
	 * @return Cadena de texto donde se indica si el número introducido es perfecto o no.
	 */
	public static String CompruebaNumeroPerfecto(int num) {
		int divisor = 1, sumadivisores = 0;
		String Cadena = "";
		while (divisor <= num / 2) {
			if (num % divisor == 0) {
				sumadivisores += divisor;
			}
			divisor++;
		}
		if (num == sumadivisores) {
			Cadena = "El número " + num + " es un número perfecto";

		} else {
			Cadena = "El número " + num + " no es un número perfecto";
		}
		return Cadena;
	}
}
