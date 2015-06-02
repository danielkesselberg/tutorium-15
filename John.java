import java.awt.Color;

import ch.aplu.turtle.Turtle;

public class John {

	public static void main(String[] args) {

		/*
		 * Fuer dieses Beispiel wird das Java Utility Package for Java von
		 * Aegidius Pluess benoetigt:
		 * http://www.aplu.ch/home/apluhomex.jsp?site=65
		 */

		/*
		 * Neue Schildkroete erzeugen. Achtung ihr dürft eure Klasse nicht
		 * Turtle nennen!
		 */
		Turtle john = new Turtle();

		/*
		 * Schriftgroesse setzten
		 */
		john.setFontSize(10);

		/*
		 * 7,5 Schritte nach vorne gehen.
		 */
		john.forward(7.5);

		/*
		 * For-Schleife für die Seiten.
		 */
		for (int i = 1; i <= 21; i++) {
			/*
			 * Die Farbe wird für jede Seite gesetzt. Dazu wird i durch 4
			 * dividiert und der Restwert mit einer If-Abfrage ueberprueft. i %
			 * 4 kann 0, 1, 2 oder 3 als Ergebnis annehmen.
			 */
			if (i % 4 == 1) {
				john.setPenColor(Color.BLACK);
			} else if (i % 4 == 2) {
				john.setPenColor(Color.RED);
			} else if (i % 4 == 3) {
				john.setPenColor(Color.GREEN);
			} else {
				john.setPenColor(Color.BLUE);
			}

			/*
			 * Schritt vorwaerts gehen. Die Schritte werden berechnet indem i
			 * mit 15 mulitpliziert wird.
			 */
			john.forward(i * 15);
			/*
			 * Um 90 Grad nach rechts drehen.
			 */
			john.left(90);
			/*
			 * Label ausgeben.
			 */
			john.label((int) john.getX() + "/" + (int) john.getY());

		}

	}

}
