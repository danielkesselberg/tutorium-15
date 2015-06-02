public class AgentenString {

	public static void main(String[] args) {

		System.out.println("Liste der Agenten");

		for (int i = 1; i < 1000; i++) {
			/*
			 * Liste der Optionen fuer System.out.format:
			 * https://docs.oracle.com
			 * /javase/tutorial/java/data/numberformat.html
			 *
			 * Das Pattern %03d besagt, dass ein Integer mit 3 Stellen erwartet
			 * wird. Ist die Zahl < 99, dann werden die Leerstellen mit 0
			 * aufgefuellt.
			 */
			String agent = String.format("Agent %03d", i);
			System.out.print("\n" + agent + " ");

			/*
			 * Ist der Agent 007, dann James Bond ausgeben.
			 */
			if (agent.equals("Agent 007")) {
				System.out.print("James Bond");
			}

			/*
			 * Die Aufgabe gibt vor, dass Vergleiche nur mit Strings
			 * durchgefuehrt werden sollen. Deshalb gibt es in der Schleife eine
			 * weitere Schleife. Dieser Ansatz erfuellt die Aufgabenstellung ist
			 * aber sehr ineffizient.
			 */
			for (int k = 1; k < 1000; k = k + 4) {
				String enttarnt = String.format("Agent %03d", k);
				if (agent.equals(enttarnt)) {
					System.out.print("enttarnt");
				}
			}
		}
	}

}
