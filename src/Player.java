import java.util.ArrayList;
import java.util.List;

public class Player {
	
	private String name;
	private int score;
	private List<Card>hand = new ArrayList<Card>();
	
	public Player(String name) {
		this.name = name;
		
	}
	
	public void draw(Deck deck) {
		hand.add(deck.draw());
	}
	
	public Card flip() {
		return hand.remove(0);
	}
	
	public void increaseScore() {
		score++;
	}
	
	public int getScore() {
		return score;
	}

	public void describe() {
		System.out.println("Name :" + name + "Score :");
	}


}
