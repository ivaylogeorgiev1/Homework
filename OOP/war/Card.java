package war;

import java.util.Arrays;

public class Card {
	static int[] cards = new int[52];
	static private int helpArrForShuffle;
	static private boolean alreadySetCard;
	static private int count = 0;

	static void shuffle() {
		for (int i = 0; i < cards.length; i++) {
			count = 0;
			alreadySetCard = false;
			helpArrForShuffle = (int) (Math.random() * 13 + 1);
			for (int j = 0; j < i; j++) {

				if (helpArrForShuffle == cards[j]) {
					count++;
				}
			}
			if (count == 4) {
				alreadySetCard = true;
				i--;
			}
			if (alreadySetCard == false) {
				cards[i] = helpArrForShuffle;
			}
		}
	}

	public static int getCards(int i) {
		return cards[i];
	}

	public static void main(String[] args) {
		Card.shuffle();
		Arrays.sort(Card.cards);
		System.out.println(Arrays.toString(Card.cards));

	}
}
