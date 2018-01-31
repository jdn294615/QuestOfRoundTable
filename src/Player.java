import java.util.ArrayList;

public class Player {
	private String name;
	protected ArrayList<Card> hand;
	private int maxSize;
	
	public Player(String n, int s) {
		name = n;
		maxSize = s;
		hand = new ArrayList<Card>();
		
	}
	
	public String getName() { return name; }
	public void setName(String n) { name = n; }
	public int getMaxSize() { return maxSize;}
	public void setMaxSize(int s) { maxSize = s; }
	
	public boolean addCard(Card currentCard)
	{
        if(hand.size() >= maxSize){
             return false;
        }

		hand.add(currentCard);
        return true;
	}
	

	public int getSize()
	{
		return hand.size();
	}
	
	
	public void removeCard(int cardPosition)
	{
		hand.remove(cardPosition - 1);
	}
	

	public void removeCard(Card currentCard)
	{
		hand.remove(currentCard);
	}
	

	public void clearHand()
	{
		hand.clear();
	}
	

	public Card getCard(int i)
	{
		return hand.get(i);
	}
	

	public ArrayList<Card> getHand(){
		return hand;
	}
	

	
	
}
