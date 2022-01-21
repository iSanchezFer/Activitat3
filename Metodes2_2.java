//byIker
package Metodes2_IkerSanchez;

import java.util.Scanner;

/**
 * @author iker
 *
 */
public class Metodes2_2 {
	public static double llegirFinsDouble(Scanner in, String prompt) {

		// Inicialitzar variables
		double number = 0;
		double error = 0.0;
		boolean isdouble = false;

		do {
			System.out.print(prompt);
			String var = in.next();
			// Probem que sigui un numero integer, si ho es continuem el bucle.
			try {
				number = Integer.parseInt(var);
			} catch (Exception e) {
				// Si no es integer, comprovem si es double, en el cas de ser-ho sortirem del
				// bucle.
				try {
					number = Double.parseDouble(var);
					isdouble = true;
					// Retornem un error en cas de que sigui un String.
				} catch (Exception f) {
					return error;
				}
			}
		} while (!isdouble);
		return number;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double d = llegirFinsDouble(in, "Introdueix un número: ");
		in.close();
		if (d == 0.0) {
			System.out.println("Error, ha entrat una cadena de text.");
		} else {
			System.out.println("El número double entrat és " + d);
		}
	}
}
