package roemischeZahlen;

/*
 * Das Package roemischeZahlen besteht aus zwei Dateien. 
 * Die Klasse RomZahl enthaelt die Methoden dezimalToRom und romToDezimal
 * Die Klasse Start erzeugt ein Objekt der Klasse RomZahl und ruft die Methoden auf.
 */
public class RomZahl {

	/*
	 * Die beiden Arrays speichern die Werte und das entsprechende Zeichen. Die
	 * Arrays dienen dem Umwandeln von Dezimalzahl zu Roemischer Zahl.
	 */
	private int[] wert = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
	private String[] zeichen = { "M", "CM", "D", "CD", "C", "XC", "L", "XL",
			"X", "IX", "V", "IV", "I" };

	/*
	 * Methode dezimalToRom. Die Methode ist oeffentlich (public), gibt einen
	 * String zurueck, heisst dezimalToRom und erwartet einen Parameter mit dem
	 * Datentyp int.
	 */
	public String dezimalToRom(int dezimal) {
		/*
		 * Leeren String anlegen (identisch zu String rom = "")
		 */
		String rom = new String();

		/*
		 * While-Schleife solang die uebergebene Zahl groesser 0 ist.
		 */
		while (dezimal > 0) {
			/*
			 * In der While-Schleife ist eine For-Schleife. Diese geht die
			 * Elemente des Wert-Arrays durch.
			 */
			for (int i = 0; i < wert.length; i++) {
				/*
				 * Innerhalb der For-Schleife ist wieder eine While-Schleife.
				 * Diese ueberprueft, ob die Zahl durch die entsprechende Zahl aus
				 * dem Werte-Array teilbar ist. Achtung! Wird ein Int durch
				 * einen Int geteilt, dann ist das Ergebnis immer ein Int:
				 */
				// 2500/1000 = 2
				// 1500/1000 = 1
				// 900/1000 = 0
				while (dezimal / wert[i] > 0) {
					/*
					 * Entsprechendes Zeichen an den String rom anhaengen.
					 */
					rom = rom + zeichen[i];
					/*
					 * Wert von Dezimal abziehen.
					 */
					dezimal = dezimal - wert[i];
				}
			}
		}

		/*
		 * Ist dezimal 0, dann wird der String zurueckgegeben und die Methode ist
		 * beendet.
		 */
		return rom;
	}

	/*
	 * Methode romToDezimal. Die Methode ist oeffentlich (public), gibt einen int
	 * zurueck, heisst romToDezimal und erwartet einen Parameter mit dem Datentyp
	 * String.
	 */
	public int romToDezimal(String rom) {
		/*
		 * Achtung! Die Methode ist enorm ineffizient und dient nur zum testen.
		 */
		int dezimal = 1;

		/*
		 * Die While-Schleife laeuft solange bis die richtige Dezimalzahl
		 * gefunden wurde. Das kann u.U etwas laengern dauern.
		 * 
		 * Der Ablauf: dezimal zu roemischer Zahl umwandeln und ueberpruefen ob
		 * mit rom uebereinstimmt. Wenn nein, dann dezimal um 1 erhoehen und
		 * erneut probieren. Wenn ja, dann fertig. Das bedeutet, dass bei
		 * MMDXXXIII (2533) die Schleife 2533 mal ausgefuehrt wird.
		 */
		while (!rom.equals(this.dezimalToRom(dezimal))) {
			dezimal = dezimal + 1;
		}

		return dezimal;
	}

}
