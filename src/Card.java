
public class Card {

	private String name;
	private int value;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public Card(String name,int value) {
		this.setName(name);
		this.setValue(value);
	}
}
