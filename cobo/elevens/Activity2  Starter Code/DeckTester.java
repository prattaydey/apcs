/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String [] ranks = {"junior", "senior"};
		String [] suits = {"blue", "red"};
		int[] pointValues = {11, 12};


		Deck Kartik = new Deck(ranks, suits, pointValues);
		Deck Nafiz = new Deck(ranks, suits, pointValues);
		Deck Prattay = new Deck(ranks, suits, pointValues);

		System.out.println(Kartik.isEmpty());
		System.out.println(Prattay.isEmpty());

		System.out.println(Nafiz.size());

		System.out.println("Deal: " + Nafiz.deal());
		System.out.println("After Deal: " + Nafiz.toString());
		System.out.println(Nafiz.size());

		Nafiz.deal();
		Nafiz.deal();
		Nafiz.deal();
		System.out.println("\n" + Nafiz.deal());

	}
}
