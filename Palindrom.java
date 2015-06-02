import javax.swing.JOptionPane;

public class Palindrom {

	public static void main(String[] args) {

		/*
		 * String mit dem JOptionPane einlesen. ToLowerCase bewirkt, dass das
		 * Wort klein geschrieben ist.
		 */
		String wort = JOptionPane.showInputDialog("Gib ein Wort ein");
		wort = wort.toLowerCase();

		/*
		 * Neue String anlegen. Identisch mit String temp = ""; aber schoener ;-)
		 */
		String temp = new String();
		/*
		 * For-Schleife um die Buchstaben auszutauschen. Die Schleife beginnt beim letzten Buchstaben und setzt diesen an die erste Stelle.
		 */
		for (int i = wort.length() - 1; i >= 0; i--) {
			temp = temp + wort.charAt(i);
		}
		/*
		 * Einsatz von substring. substring extrahiert einen Teil eines Strings. Der erste Parameter besagt immer die Position. Der zweite die Laenge.
		 *
		 * Beispiele:
		 * 	"Hallo".substring(0, 1) => H
		 *  "Hallo".substring(1) => allo
		 */
		temp = temp.substring(0, 1).toUpperCase() + temp.substring(1);

		if (wort.equals(temp)) {
			temp = "Achtung Palindrom gefunden: " + temp;
		}

		JOptionPane.showMessageDialog(null, temp);

	}

}
