package histogramm;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Histogramm {

	/*
	 * Zeile als Instanzvariable deklarieren.
	 */
	private String zeile;

	/*
	 * Methode einlesen. Die Methode ist oeffentlich (public), gibt einen
	 * boolean zurueck, heisst einlesen und erwartet keinen Parameter.
	 */
	public boolean einlesen() {

		/*
		 * Satz mit dem JOptionPane einlesen und in der Variable "zeile"
		 * ablegen.
		 */
		zeile = JOptionPane.showInputDialog("Gib einen Satz ein");

		/*
		 * Ist die Eingabe gueltig (also nicht null und laenger 0, dann true
		 * zurueckgeben). In der Main-Methode (Klasse Start) wird die Rueckgabe
		 * dann ausgewertet.
		 */
		if (zeile != null && zeile.length() > 0) {
			return true;
		} else {
			return false;
		}
	}

	/*
	 * Methode einlesen. Die Methode ist oeffentlich (public), gibt eine
	 * String-Array zurueck, heisst einlesen und erwartet keinen Parameter.
	 */
	public String[] bearbeiten() {

		/*
		 * Im ersten Schritt wird ein Array "ausgabe" deklariert und ein
		 * weiteres Array woerter erzeugt. Der Befehl zeile.split(" ") zerlegt
		 * einen String anhand von leerzeichen.
		 */

		String[] ausgabe;
		String[] woerter = zeile.split(" ");

		/*
		 * Fuer die richtige Formartierung ist die Laenge des laengsten Worts
		 * wichtig. In dieser Schleife wird die Laenge bestimmt.
		 */
		int maxZeichen = 0;
		for (int i = 0; i < woerter.length; i++) {
			if (woerter[i].length() > maxZeichen) {
				maxZeichen = woerter[i].length();
			}
		}

		/*
		 * Anhand der Laenge wird das Array initialisiert.
		 */
		ausgabe = new String[maxZeichen];
		/*
		 * Das Array ist zu Beginn nur mit "null" gefuellt. Der Befehl
		 * Arrays.fill fuellt das Array "ausgabe" mit einem leeren String.
		 * Arrays.fill ist im uebrigen eine Static-Methode (also eine Methode
		 * die aufgerufen werden kann ohne das ein Object der Klasse erzeugt
		 * werden muss.
		 */
		Arrays.fill(ausgabe, "");

		/*
		 * Die For-Schleife geht jedes Element des Arrays Woerter durch. Das
		 * sind die einzelnen Worte des eingegeben Satzes.
		 */
		for (int k = 0; k < woerter.length; k++) {

			/*
			 * In die erste Zeile des Ausgabe-Arrays wird das urspruengliche
			 * Wort geschrieben.
			 */
			ausgabe[0] = ausgabe[0] + String.format("%s ", woerter[k]);

			/*
			 * Laenge des aktuellen Worts ermitteln
			 */
			int wortLaenge = woerter[k].length() + 1;
			/*
			 * Die Zeilen der Ausgabe durchgehen. Das Ausgabe-Array hat X
			 * Element. Jedes Element steht fuer eine Zeile der Ausgabe.
			 */
			for (int m = 1; m < ausgabe.length; m++) {
				/*
				 * Pattern anlegen. Das Pattern setzt sich zusammen aus der
				 * Laenge des Worts. Hat das Wort 4 Zeichen, dann ist das
				 * Pattern %-4s. Der Bindestrich bewirkt, dass der String links
				 * ausgerichtet wird.
				 */
				String format = "%-" + wortLaenge + "s";
				/*
				 * Muss in der aktuellen Zeile ein * gezeichnet werden (das ist
				 * der Fall wenn m kleiner als wortLaenge ist) oder ein
				 * leerzeichen?
				 */
				if (m < wortLaenge) {
					ausgabe[m] = ausgabe[m] + String.format(format, "*");
				} else {
					ausgabe[m] = ausgabe[m] + String.format(format, " ");
				}
			}
		}

		/*
		 * Sind alle Woerter verarbeitet, dann String-Array zurueckgeben.
		 */
		return ausgabe;

	}

	/*
	 * Methode ausgeben. Die Methode ist oeffentlich (public), hat keine
	 * Rueckgabe, heisst ausgeben und erwartet einen Parameter vom Datentyp
	 * String-Array.
	 */
	public void ausgeben(String[] ausgabe) {

		for (int y = 0; y < ausgabe.length; y++) {
			if (ausgabe[y] != null) {
				System.out.println(ausgabe[y]);
			}
		}

	}

}
