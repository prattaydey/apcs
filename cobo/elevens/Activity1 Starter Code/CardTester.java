/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card Kartik = new Card ("First", "Hearts", 10);
		Card Nafiz = new Card ("First", "Hearts", 10);
		Card Prattay = new Card ("Second", "Spades", 8);

		System.out.println(Kartik.suit());
		System.out.println(Kartik.rank());
		System.out.println(Kartik.pointValue());

		System.out.println(Kartik.matches(Nafiz));
		System.out.println(Kartik.matches(Prattay));

		System.out.println(Prattay.toString());


	}
}
