package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

public class Oppgave2 {

	public static void main(String[] args) {

		int student = 0;

		while (student < 10) {

			int sum = parseInt(showInputDialog("Skriv inn poengsum som heltall."));

			if (sum >= 90 && sum <= 100) {
				System.out.println("A");
				student++;
			} else if (sum >= 80 && sum <= 89) {
				System.out.println("B");
				student++;

			} else if (sum >= 60 && sum <= 79) {
				System.out.println("C");
				student++;

			} else if (sum >= 50 && sum <= 59) {
				System.out.println("D");
				student++;
			} else if (sum >= 40 && sum <= 49) {
				System.out.println("E");
				student++;

			} else if (sum <= 39 && sum >= 0) {
				System.out.println("F");
				student++;
			} else
				System.out.println("Ikke gyldig poengsum, skriv på nytt.");

		}
	}
}