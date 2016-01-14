package war;

import java.util.Arrays;

public class War {
	static Player player1;
	static Player player2;

	War() {
		player1 = new Player();

		player2 = new Player();

	}

	static void battle() {
		for (int i = 0; i < 26; i++) {
			if (player1.getCard(i) > player2.getCard(i)) {
				player1.putInWonCards(player1.getCard(i), player2.getCard(i));
			}
			if (player1.getCard(i) < player2.getCard(i)) {
				player2.putInWonCards(player1.getCard(i), player2.getCard(i));
			}
			if (player1.getCard(i) == player2.getCard(i)) {
				int threeMore = 3;
				if (i + threeMore < 26) {
					while (player1.getCard(i + threeMore) == player2.getCard(i
							+ threeMore)) {
						threeMore++;
					}

					if (i + threeMore < 26) {
						if (player1.getCard(i + threeMore) > player2.getCard(i
								+ threeMore)) {
							for (int j = i; j <= (threeMore + i); j++) {
								player1.putInWonCards(player1.getCard(j),
										player2.getCard(j));
							}
						}
						if (player1.getCard(i + threeMore) < player2.getCard(i
								+ threeMore)) {
							for (int j = i; j <= (threeMore + i); j++) {
								player2.putInWonCards(player1.getCard(j),
										player2.getCard(j));
							}
						}
					}
				}
				i += threeMore;

			}
			// if (player1.getCard(i) == player2.getCard(i)) {
			// i+=4;
			// if (player1.getCard(i) > player2.getCard(i)) {
			// player1.putInWonCards(player1.getCard(i), player2.getCard(i));
			// }
			// if (player1.getCard(i) > player2.getCard(i)) {
			// player1.putInWonCards(player1.getCard(i), player2.getCard(i));
			// }
			// }
		}
	}

	static void whoWon() {
		if (player1.getWonCard() > player2.getWonCard()) {
			System.out.println("Player 1 is the winner");
		}
		if (player1.getWonCard() < player2.getWonCard()) {
			System.out.println("Player 2 is the winner");
		}
		if (player1.getWonCard() == player2.getWonCard()) {
			System.out.println("Draw");
		}
	}

	public static void main(String[] args) {
		Card.shuffle();
		System.out.println(Arrays.toString(Card.cards));
		War newGame = new War();
		player1.giveCardsToPlayers();
		player2.giveCardsToPlayers();
		War.battle();
		player1.printDeck();
		player2.printDeck();
		System.out.println(player1.getWonCard());
		System.out.println(player2.getWonCard());
		War.whoWon();
	}
}
