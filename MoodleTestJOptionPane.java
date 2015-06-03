import java.util.Random;

import javax.swing.JOptionPane;

public class MoodleTestJOptionPane {

	public static void main(String[] args) {

		/*
		 * Random wird werden mehrmals im Programm
		 * benoetigt und wird deshalb zu Beginn angelegt.
		 */
		Random r = new Random();

		/*
		 * nochmal ist die Bedingung fuer die while-Schleife. Diese muss
		 * ausserhalb der Schleife mindestens deklariert(!) werden.
		 */
		boolean nochmal = true;
		do {
			/*
			 * Finde zufaellige Zahl >= 1 und <= 100. Die beste Loesung waere int
			 * zahl = r.nextInt(100) + 1, weil damit eine Zahl >= 0 und < 100
			 * erzeugt werden wuerde. Die gegebene Loesung erzeugt eine zufaellige
			 * Zahl die im Integer-Wertebereich liegt. Die Wahrscheinlichkeit,
			 * dass eine zufaellige Zahl aus dem Integer-Wertebereich zwischen >=
			 * 1 und <= 100 liegt ist eher gering. Die Schleife wird deshalb
			 * sehr haeufig ausgefuehrt. Aus diesem Grund wird der erzeugte
			 * Integer zu einem Short gecastet.
			 */
			int zahl = 0;
			do {
				zahl = (short) r.nextInt();
			} while (zahl < 1 || zahl > 100);

			/*
			 * Eingabe des Spielers mit dem Scanner einlesen. Im Anschluss soll
			 * geprueft werden, ob die eingebene Zahl >= 1 und <= 100 ist. Gibt
			 * der Spieler 0 ein, dann wird das Spiel beendet.
			 */
			int test = 0;
			do {
				try {
					String temp = JOptionPane.showInputDialog("Errate die Zahl (>= 1 und <= 100, 0 zum beenden)");
					test = Integer.parseInt(temp);
				} catch(NumberFormatException e) {
					// Exception fangen, wird aber nicht weiter ausgewertet.
				}
			} while (test < 0 || test > 100);

			/*
			 * ueberpruefe die Eingaben. Die letzte "else if" kann auch durch ein
			 * else ersetzt werden.
			 */
			if (test > 0) {
				String message = "Richtig!";
				if (zahl < test) {
					message = "Zahl ist kleiner :-(";
				} else if (zahl > test) {
					message = "Zahl ist groesser :-(";
				}
				JOptionPane.showMessageDialog(null, message);
			} else {
				JOptionPane.showMessageDialog(null, "Auf Wiedersehen!");
				nochmal = false;
			}

		} while (nochmal);

	}
}
