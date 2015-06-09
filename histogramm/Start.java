package histogramm;

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
		 * Object der Klasse Histogramm anlegen.
		 */
		Histogramm h = new Histogramm();

		/*
		 * Ist das Einlesen erfolgreich, dann verarbeiten.
		 */
		if (h.einlesen() == true) {
			/*
			 * Die Methode bearbeiten erzeugt ein String-Array das mit return
			 * zurueckgegeben wird. Dieses wird an die Methode ausgeben
			 * uebergeben.
			 */
			String[] ausgabe = h.bearbeiten();
			h.ausgeben(ausgabe);
		}

	}

}
