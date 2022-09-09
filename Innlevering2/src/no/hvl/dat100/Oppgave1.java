package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;
import java.lang.Math;

public class Oppgave1 {

	public static void main(String[] args) {

		// Tar utgangspunkt fra trinnskatt 2022

		double brutto = parseInt(showInputDialog("Skriv inn bruttoinntekt"));

		double trinn1 = 0.017;
		double trinn2 = 0.04;
		double trinn3 = 0.134;
		double trinn4 = 0.164;
		double trinn5 = 0.174;

		if (brutto <= 190349) {
			showMessageDialog(null, "Du betaler ingen trinnskatt.");

		} else if (brutto >= 190350 && brutto <= 267899) {
			double skatt = (brutto - 190349) * trinn1;
			showMessageDialog(null, "Din trinnskatt blir " + Math.round(skatt) + " kr.");

		} else if (brutto >= 267900 && brutto <= 643799) {
			double skatt = (267899 - 190350) * trinn1 + (brutto - 267900) * trinn2;

			showMessageDialog(null, "Din trinnskatt blir " + Math.round(skatt) + " kr.");

		} else if (brutto >= 643800 && brutto <= 969199) {
			double skatt = (267899 - 190350) * trinn1 + (643799 - 267899) * trinn2 + (brutto - 643800) * trinn3;
			showMessageDialog(null, "Din trinnskatt blir " + Math.round(skatt) + " kr.");

		} else if (brutto >= 969200 && brutto <= 1999999) {
			double skatt = (267899 - 190350) * trinn1 + (643799 - 267899) * trinn2 + (969199 - 643800) * trinn3
					+ (brutto - 969200) * trinn4;
			showMessageDialog(null, "Din trinnskatt blir " + Math.round(skatt) + " kr.");

		} else if (brutto >= 2000000) {

			double skatt = (267899 - 190350) * trinn1 + (643799 - 267899) * trinn2 + (969199 - 643800) * trinn3
					+ (1999999 - 969200) * trinn4 + (brutto - 2000000) * trinn5;

			showMessageDialog(null, "Din trinnskatt blir " + Math.round(skatt) + " kr.");
		}

	}

}
