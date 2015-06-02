import java.util.Random;

import ch.aplu.util.Console;

public class Munzwurf {

	public static void main(String[] args) {

		/*
		 * Fuer dieses Beispiel wird das Java Utility Package for Java von
		 * Aegidius Pluess benoetigt:
		 * http://www.aplu.ch/home/apluhomex.jsp?site=65
		 */

		/*
		 * Console anlegen. Die Console ist eine Static-Class, deshalb muss
		 * nicht zuerst ein Objekt erzeugt werden.
		 */
		Console.init();

		/*
		 * Neuen String "weiter". Dieser speichert die Antwort auf die Frage, ob
		 * der Spieler nochmal spielen moechte. Die do-while-Schleife verwendet
		 * diesen String in der Bedingung. Deshalb muss der String ausserhalb
		 * der Schleife deklariert werden.
		 */
		String weiter;

		/*
		 * Neuen Generator fuer Zufallszahlen erzeugen. Das generieren
		 * uebernimmt die Klasse Random. Wir erzeugen ein Object vom Typ Random
		 * und speichern dieses in der Variable "zufall". Das Objct der Klasse
		 * Random muss nur einmal erzeugt werden. Die Methoden erzeugen bei
		 * jedem Aufruf neue zufaellige Werte.
		 */
		Random zufall = new Random();

		do {

			/*
			 * Zufaellige Zahl erzeugen. Dazu wird die Methode nextInt der
			 * Klasse Random (siehe Zeile 25) verwendet. Laut
			 * http://docs.oracle.
			 * com/javase/8/docs/api/java/util/Random.html#nextInt-int- erzeugt
			 * die Methode eine Zahl zwischen 0 (inklusive) und Parameter
			 * (exklusiv). Hier wird also eine Zahl >= 0 und < 32 erzeugt.
			 */
			int zahl = zufall.nextInt(32);

			/*
			 * Die Eingabe des Spielers einlesen. Zuerst wird ein Hinweis
			 * ausgeben was der Benutzer machen soll und die Kodierung. Hier
			 * soll also k fuer Kopf oder z fuer Zahl eingegeben werden.
			 */
			System.out.print("[k]opf oder [z]ahl?\t");
			String user = Console.readLine();

			/*
			 * Der Spieler soll erraten, ob die Muenze Kopf oder Zahl zeigt. Die
			 * Muenze zeigt Kopf, wenn die zufaellige Zahl gerade ist und Zahl,
			 * wenn die zufallige Zahl ungerade ist. Eine Zahl ist gerade, wenn
			 * diese ohne Rest durch 2 teilbar ist. Java bietet dafuer den
			 * Modulo-Operator % an:
			 */
			// 3 % 2 = 1
			// 4 % 2 = 0
			// 5 % 2 = 1
			// 6 % 2 = 0
			/*
			 * Eine beliebige Zahl % 2 ergibt immer 0 oder 1. 0 wenn die Zahl
			 * gerade ist und 1 wenn die Zahl ungerade ist. Die erste if
			 * ueberprueft, ob zahl % 2 == 0 ist, wenn das zutrifft, dann wird
			 * geprueft ob der Spieler kopf oder zahl eingegeben hat.
			 *
			 * Ist zahl % 2 nicht 0, dann ist die Zahl ungerade (anstatt dem
			 * else koennte auch else if (zahl % 2 == 1) verwendet werden). Auch
			 * dann wird ueberprueft, ob der Spieler kopf oder zahl eingegeben
			 * hat.
			 *
			 * Das Problem kann auch ganz ohne Modulo geloest werden. Dazu
			 * schauen wir nochmal auf Zeile 44. Dort wird eine zufaellige Zahl
			 * zwischen >= 0 und < 32 erzeugt. Fuer die Aufgabenstellung ist die
			 * hoehe der Zahl nicht relevant. Interessant ist nur, ob die Zahl
			 * gerade oder ungerade ist. Wenn ihr eine zufaellige Zahl >= 0 und
			 * < 2 erzeugt, dann muesst ihr in der if nur abfragen, ob die zahl
			 * == 0 (gerade) ist und, wenn ihr anstatt dem else ein else-if
			 * verwendet, ob die zahl == 1 (ungerade) ist.
			 */
			if (zahl % 2 == 0) {
				if (user.equals("k")) {
					System.out.println("Richtig!");
				} else {
					System.out.println("Falsch!");
				}
			} else {
				if (user.equals("z")) {
					System.out.println("Richtig!");
				} else {
					System.out.println("Falsch!");
				}
			}

			/*
			 * Der Spieler wird gefragt, ob dieser nochmal spielen wird. j fuer
			 * ja, und n fuer nein. Die Antwort in der Variable weiter
			 * gespeichert. Warum wurde die Variable weiter nochmal ausserhalb
			 * der Schleife deklariert?
			 */
			System.out.print("Nochmal spielen? [j]a oder [n]ein\t");
			weiter = Console.readLine();

			/*
			 * Console leeren (der Inhalt wird geloescht)
			 */
			Console.clear();

			/*
			 * Die do-while-Schleife ist eine nachpruefende Schleife. Die
			 * Schleife wird auf jeden Fall einmal ausgefuehrt. Unabhaengig
			 * davon, ob die Bedingung wahr oder falsch ist. Hier wird geprueft,
			 * ob der Spieler ein j fuer ja eingeben hat. Ist der Fall, dann ist
			 * weiter.equals("j") == true und die Schleife wird nochmal
			 * ausgefuehrt.
			 */
		} while (weiter.equals("j"));

		/*
		 * Console schliessen. Das Programm wird im Anschluss beendet.
		 */
		Console.end();
	}

}
