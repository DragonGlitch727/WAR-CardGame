

public class App {

	public static void main(String[] args) {
		
		Deck deck = new Deck();
		deck.shuffleCards();
		Player player1 = new Player("Abraham");
		Player player2 = new Player("General Lee");
		
		for (int i = 0; i < 26; i ++) {
			player1.draw(deck);
			player2.draw(deck);			
		}
		for (int i = 0; i < 26; i ++) {
			int p1Value = player1.flip().getValue();
			int p2Value = player2.flip().getValue();
			if (p1Value == p2Value) {
				System.out.println("Draw!");
			} else { 
				if (p1Value > p2Value) {
					player1.increaseScore();
				} else { 
					player2.increaseScore();
				}								
			}
			
		}
	System.out.println("Player 1 Score: " + player1.getScore());
	System.out.println("Player 2 Score: " + player2.getScore());
	}
}


