package Metodes2_IkerSanchez;

import java.util.Scanner;
import java.util.Random;
import java.lang.*;

/**
 * @author Iker
 *
 */
public class Metodes2_1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Escriu una frase: ");
		String frase = in.nextLine();
		System.out.print(barrejarFrase(frase));
	}

	//Barrejem les paraules amb dos randoms, excloint la primera i última lletra.
	public static String barrejarParaula(String paraula) {
		int random1, random2;
		int lengthWord = paraula.length();
		String wordRdm = "";

		if (lengthWord < 4) {
			wordRdm = paraula;
		} else {
			do {
				Random rdm = new Random();
				random1 = rdm.nextInt((lengthWord - 2)) + 1;
				random2 = rdm.nextInt((lengthWord - 2)) + 1;
			} while (random1 == random2);

			for (int i = 0; i <= (lengthWord - 1); i++) {
				if (i == random2) {
					wordRdm = wordRdm + paraula.charAt(random1);
				} else if (i == random1) {
					wordRdm = wordRdm + paraula.charAt(random2);
				} else {
					wordRdm = wordRdm + paraula.charAt(i);
				}
			}
		}
		return wordRdm;
	}
	//Barrejem la frase revertin les posicions
	public static String barrejarFrase(String frase) {
		String word,phraseRdm = "";
		String[] paraula = frase.split(" ");
		int pLength = paraula.length;

		for (int i = 0; i < pLength; i++) {
			word = barrejarParaula(paraula[i]);
			phraseRdm = phraseRdm + " " + word;
		}

		StringBuffer phraseRdmDel = new StringBuffer(phraseRdm);
		phraseRdmDel.deleteCharAt(0);
		phraseRdm = phraseRdmDel.toString();
		String[] phrase = phraseRdm.split(" ");
		int lengthPhrase = phrase.length;
		String finalphrase = "";

		for (int i = (lengthPhrase - 1); i >= 0; i--) {
			finalphrase = finalphrase + " " + phrase[i];
		}
		return finalphrase;
	}



}