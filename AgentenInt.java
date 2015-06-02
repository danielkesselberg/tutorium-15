public class AgentenInt {

	public static void main(String[] args) {

		System.out.println("Liste der Agenten");

		for (int i = 1; i <= 100; i++) {
			/*
			 * Liste der Optionen fuer System.out.format:
			 * https://docs.oracle.com
			 * /javase/tutorial/java/data/numberformat.html
			 *
			 * Das Pattern %03d besagt, dass ein Integer mit 3 Stellen erwartet
			 * wird. Ist die Zahl < 99, dann werden die Leerstellen mit 0
			 * aufgefuellt.
			 */
			System.out.format("\nAgent %03d ", i);

			/*
			 * Ist i == 7, dann soll James Bond ausgegeben werden.
			 */
			if (i == 7) {
				System.out.print("James Bond");
			}

			/*
			 * Ist i ohne Rest durch 4 teilbar, dann wurde der Agent enttarnt.
			 */
			if (i % 4 == 0) {
				System.out.print("enttarnt");
			}
		}
	}

}
