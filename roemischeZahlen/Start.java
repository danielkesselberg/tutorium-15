package roemischeZahlen;

import java.util.Random;

/*
 * Das Package roemischeZahlen besteht aus zwei Dateien. 
 * Die Klasse RomZahl enthaelt die Methoden dezimalToRom und romToDezimal
 * Die Klasse StartRomZahl erzeugt ein Objekt der Klasse RomZahl und ruft die Methoden auf.
 */
public class Start {

	/*
	 * Die Main-Methode ist der Einsteigspunkt in das Programm und wird als
	 * erstes ausgefuehrt. Die weiteren Bestandteile des Programms benuetigen
	 * keine Main-Methode.
	 */
	public static void main(String[] args) {

		/*
		 * Wir erzeugen einen Instanz (ein Object) von unserer Klasse RomZahl.
		 */
		RomZahl rz = new RomZahl();
		/*
		 * Neues Random-Object.
		 */
		Random r = new Random();

		/*
		 * Tabellen-Kopf ausgeben. Dazu wird ein Pattern verwendet. Dieses
		 * besteht aus drei Teilen und ist so aufgebaut: %1$8s - %1 zeigt auf
		 * den erste Parameter (hier "Dezimal"). - $8 signalisiert die Laenge des
		 * Strings (hier sind 8 eingestellt). - s steht fuer String (weil wir
		 * einen String uebergeben). %2$14s - %2 zeigt auf den zweiten Parameter
		 * (hier "Roemisch"). - $14 signalisiert die Laenge des Strings (hier
		 * sind 14 eingestellt). - s steht fuer String (weil wir einen String
		 * uebergeben). %3$8s - %3 zeigt auf den dritten Parameter (hier
		 * "Probe"). - $8 signalisiert die Laenge des Strings (hier sind 8
		 * eingestellt). - s steht fuer String (weil wir einen String uebergeben).
		 */
		System.out.format("%1$8s%2$14s%3$8s\n", "Dezimal", "Roemisch", "Probe");

		/*
		 * Zum testen erzeugen wird 20 zufaellige Zahlen. Die For-Schleife laeuft
		 * von 1 bis 20. In der Schleife wird mit r.nextInt(3000) eine zufaellige
		 * Zahl >= 0 && < 3000 erzeugt.
		 */
		for (int i = 1; i <= 20; i++) {

			int dezimal = r.nextInt(3000);
			/*
			 * Die zufaellige Zahl wird in eine roemische Zahl konvertiert.
			 */
			String rom = rz.dezimalToRom(dezimal);
			/*
			 * Zur Probe wird die roemische Zahl wieder in eine Dezimalzahl
			 * konvertiert.
			 */
			int probe = rz.romToDezimal(rom);

			/*
			 * Wir geben die Dezimalzahl, Roemische Zahl und Probe aus. Dazu wird
			 * das gleiche Pattern wie oben verwendet.
			 */
			System.out.format("%1$8s%2$14s%3$8s\n", dezimal, rom, probe);
		}
	}

}
