package war;

public class Deck {
	private Card playingCards = new Card();

	// da testwam i togawa da sloja shuffle tuk . W konstruktor ?
	void shuffleDeck() {
		playingCards.shuffle();
	}
}
