package war;

import java.util.Arrays;

public class Player {
	private int[] playersDeck = new int[26];
	default int[] wonCards = new int[52];
	int count = 0;
	int i=0;
	int j=0;
	int countOfWonCards=0;
	void giveCardsToPlayers() {
		while(i<26 && j<52){

			if (Card.cards[j] != 0) {
				playersDeck[i] = Card.cards[j];
				Card.cards[i]=0;
				i++;
				j++;
			}
			else {
				j++;
				
			}
			
		}

	}

	void putInWonCards(int a, int b) {
		this.wonCards[count] = a;
		count++;
		this.wonCards[count] = b;
		count++;
		countOfWonCards+=2;
		// boolean setA = false;
		// boolean rdySetB = false;
		// for (int i = 0; i < 52; i++) {
		// if (setA == false) {
		// if (this.playersDeck[i] != 0) {
		// continue;
		// }
		// if (this.playersDeck[i] == 0) {
		// this.playersDeck[i] = a;
		// setA = true;
		// rdySetB = true;
		// i++;
		// }
		// }
		// if (rdySetB == true) {
		// if (this.playersDeck[i] != 0) {
		// continue;
		// }
		// if (this.playersDeck[i] == 0) {
		// this.playersDeck[i] = b;
		// }
		// }
		// }
	}
	void printDeck(){
		System.out.println(Arrays.toString(playersDeck));
	}
	public int getCard(int i) {
		return playersDeck[i];
	}
	public int getWonCard() {
		return countOfWonCards;
	}

}
