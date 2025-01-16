package Practice;

import java.security.SecureRandom;

class Card {
	private final String face;
	private final String suit;

	public Card(String cardFace, String cardSuit) {
		this.face = cardFace;
		this.suit = cardSuit;
	}

	public String toString() {
		return face + " " + suit;
	}
}

public class Shuffle_Cards {

	private static Card[] deck = new Card[52];
	private static Card currentCard;
	private static final int NUMBER_OF_CARDS = 52;
	private static final SecureRandom randomNumbers = new SecureRandom();

	public static void main(String[] args) {
		String faces[] = { "Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack",
				"Queen", "King" };
		String suits[] = { "Hearts", "Diamonds", "Clubs", "Spades" };
		int i = 0;
		for (String suit : suits) {
			for (String face : faces) {
				deck[i] = new Card(face, suit);
				i++;
			}
		}

		for (i = 0; i < NUMBER_OF_CARDS; i++) {
			System.out.print(deck[i].toString() + "   |  ");
		}

		shuffle();
	}

	public static void shuffle() {
		for (int first = 0; first < NUMBER_OF_CARDS; first++) {
			int second = randomNumbers.nextInt(NUMBER_OF_CARDS);
			currentCard = deck[first];
			deck[first] = deck[second];
			deck[second] = currentCard;
		}
		System.out.println();
		for (int i = 0; i < NUMBER_OF_CARDS; i++) {
			System.out.print(deck[i].toString() + "   |  ");
		}
	}

}
