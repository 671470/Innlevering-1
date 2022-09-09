package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;

public class Oppgave3 {

	public static void main(String[] args) {

		int tall = parseInt(showInputDialog("Skriv inn hetall."));

		if (tall > 0) {

			int a = tall;
			int b = 1;

			while (tall > 1) {

				b *= tall;
				tall--;

			}

			showMessageDialog(null, a + "! er " + b);
		} else if (tall <= 0) {

			showMessageDialog(null, "Tall må være større enn null.");
		}

	}
}
