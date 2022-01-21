package Metodes2_IkerSanchez;
#EDICIO DOCUMENT 2.0
import java.util.Scanner;

/**
 * @author iker
 *
 */
public class Metodes2_3 {
	public static void main(String[] args) {
		boolean negative = false;
		do {
			Scanner key = new Scanner(System.in);
			System.out.print("Escriu un numero: ");
			int num = key.nextInt();
			if (num < 0) {
				System.out.println("Exit");
				negative = true;
			} else if (num > 9999) {
				System.out.println("El numero és massa gran.");
			} else {
				System.out.println(num + " és " + intToNom(num) + " en escrit.");
			}
		} while (!negative);

	}
	/*
	  Convertir el numero introduit al
	  seu corresponent text. 
	*/
	public static String intToNom(int num) {
		String numero = Integer.toString(num);
		int digit1, digit2, digit3, digit4;
		String numtext;
		for (int i = 0; i <= numero.length(); i++) {
			if (numero.length() < 4) {
				numero = "0" + numero;
			} else {
				break;
			}
		}
		digit1 = Character.getNumericValue(numero.charAt(0));
		digit2 = Character.getNumericValue(numero.charAt(1));
		digit3 = Character.getNumericValue(numero.charAt(2));
		digit4 = Character.getNumericValue(numero.charAt(3));
		numtext = milers(digit1) + centenes(digit2);
		if (digit3 == 1) {
			numtext += to19(digit4);
		} else if (digit4 == 0 && digit3 != 0) {
			numtext += desenes(digit3);
		} else if (digit4 == 0 && digit3 == 0 && digit2 == 0 && digit1 == 0) {
			numtext += nums(digit4);
		} else if (digit3 == 0) {
			numtext += nums(digit4);
		} else if (digit3 == 2) {
			numtext += desenes(digit3);
			if (digit4 != 0) {
				numtext += "-i-" + nums(digit4);
			} else {
				numtext += nums(digit4);
			}
		} else {
			numtext += desenes(digit3);
			numtext += "-" + nums(digit4);
		}
		return numtext;

	}
	/*
	  Convertir el numero de les unitats al
	  seu corresponent text. 
	*/
	public static String nums(int numero) {
		String[] nums = { "zero", "u", "dos", "tres", "quatre", "cinc", "sis", "set", "vuit", "nou" };
		return nums[numero];
	}
	/*
	  Convertir el numero del numero 10 al 19 al
	  seu corresponent text. 
	*/
	public static String to19(int numero) {
		String[] to19 = { "deu", "onze", "dotze", "tretze", "catorze", "quinze", "setze", "disset", "divuit", "dinou" };
		return to19[numero];
	}
	/*
	  Convertir el numero de les desenes al
	  seu corresponent text. 
	*/
	public static String desenes(int numero) {
		String[] desenes = { "", "", "vint", "trenta", "quaranta", "cinquanta", "seixanta", "setanta", "vuitanta",
				"noranta" };
		return desenes[numero];
	}
	/*
	  Convertir el numero de les centenes al
	  seu corresponent text. 
	*/
	public static String centenes(int numero) {
		String[] cents = { "", "cent ", "dos-cents ", "tres-cents ", "quatre-cents ", "cinc-cents ", "sis-cents ",
				"set-cents ", "vuit-cents ", "nou-cents " };
		return cents[numero];
	}
	/*
	  Convertir el numero dels milers al
	  seu corresponent text. 
	*/
	public static String milers(int numero) {
		String[] millars = { "", "mil ", "dos mil ", "tres mil ", "quatre mil ", "cinc mil ", "sis mil ", "set mil ",
				"vuit mil ", "nou mil " };
		return millars[numero];
	}
	
	
}
