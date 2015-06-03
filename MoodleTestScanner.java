import java.util.Random;
import java.util.Scanner;

public class MoodleTestScanner {

	public static void main(String[] args) {

		/*
		 * Erzeuge Random und Scanner. Diese werden mehrmals im Programm
		 * benoetigt und werden deshalb zu Beginn angelegt. Der Scanner sollte am
		 * Ende wieder geschlossen werden.
		 */
		Random r = new Random();
		Scanner s = new Scanner(System.in);

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
				System.out
						.print("Errate die Zahl (>= 1 und <= 100, 0 zum beenden):\t");
				test = s.nextInt();
			} while (test < 0 || test > 100);

			/*
			 * nextInt liest eine Zahl ein ignoriert aber das newLine-Zeichen.
			 * Dieses muss zusaetzlich ausgelesen (und verworfen werden). Siehe
			 * auch:
			 * https://christprogramming.wordpress.com/2014/01/30/java-common
			 * -mistakes-1/
			 */
			s.nextLine();

			/*
			 * ueberpruefe die Eingaben. Die letzte "else if" kann auch durch ein
			 * else ersetzt werden.
			 */
			if (test > 0) {
				if (zahl == test) {
					System.out.println("\tRichtig!");
				} else if (zahl < test) {
					System.out.println("\tZahl ist kleiner :-(");
				} else if (zahl > test) {
					System.out.println("\tZahl ist groesser :-(");
				}
			} else {
				System.out.println("\tAuf Wiedersehen!");
				nochmal = false;
			}

		} while (nochmal);

		s.close();

	}
}
