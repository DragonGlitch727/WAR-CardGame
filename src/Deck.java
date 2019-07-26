import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	
	private List<Card> cards = new ArrayList<Card>();
	
	public Deck() {
		cards.add(new Card("Two of Hearts", 2));
		cards.add(new Card("Two of Diamonds", 2));
		cards.add(new Card("Two of Spades", 2));
		cards.add(new Card("Two of Clovers", 2));
		cards.add(new Card("Three of Hearts", 3));
		cards.add(new Card("Three of Diamonds", 3));
		cards.add(new Card("Three of Spades", 3));
		cards.add(new Card("Three of Clovers", 3));
		cards.add(new Card("Four of Hearts", 4));
		cards.add(new Card("Four of Diamonds", 4));
		cards.add(new Card("Four of Spades", 4));
		cards.add(new Card("Four of Clovers", 4));
		cards.add(new Card("Five of Hearts", 5));
		cards.add(new Card("Five of Diamonds", 5));
		cards.add(new Card("Five of Spades", 5));
		cards.add(new Card("Five of Clovers", 5));
		cards.add(new Card("Six of Hearts", 6));
		cards.add(new Card("Six of Diamonds", 6));
		cards.add(new Card("Six of Spades", 6));
		cards.add(new Card("Six of Clovers", 6));
		cards.add(new Card("Seven of Hearts", 7));
		cards.add(new Card("Seven of Diamonds", 7));
		cards.add(new Card("Seven of Spades", 7));
		cards.add(new Card("Seven of Clovers", 7));
		cards.add(new Card("Eight of Hearts", 8));
		cards.add(new Card("Eight of Diamonds", 8));
		cards.add(new Card("Eight of Spades", 8));
		cards.add(new Card("Eight of Clovers", 8));
		cards.add(new Card("Nine of Hearts", 9));
		cards.add(new Card("Nine of Diamonds", 9));
		cards.add(new Card("Nine of Spades", 9));
		cards.add(new Card("Nine of Clovers", 9));
		cards.add(new Card("Ten of Hearts", 10));
		cards.add(new Card("Ten of Diamonds", 10));
		cards.add(new Card("Ten of Spades", 10));
		cards.add(new Card("Ten of Clovers", 10));
		cards.add(new Card("Jack of Hearts", 11));
		cards.add(new Card("Jack of Diamonds", 11));
		cards.add(new Card("Jack of Spades", 11));
		cards.add(new Card("Jack of Clovers", 11));
		cards.add(new Card("Queen of Hearts", 12));
		cards.add(new Card("Queen of Diamonds", 12));
		cards.add(new Card("Queen of Spades", 12));
		cards.add(new Card("Queen of Clovers", 12));
		cards.add(new Card("King of Hearts", 13));
		cards.add(new Card("King of Diamonds", 13));
		cards.add(new Card("King of Spades", 13));
		cards.add(new Card("King of Clovers", 13));
		cards.add(new Card("Ace of Hearts", 14));
		cards.add(new Card("Ace of Diamonds", 14));
		cards.add(new Card("Ace of Spades", 14));
		cards.add(new Card("Ace of Clovers", 14));
	}
	
	
	public void shuffleCards() {
		Collections.shuffle(cards);
	}
	public Card draw() {
		return cards.remove(0);
	}


}
