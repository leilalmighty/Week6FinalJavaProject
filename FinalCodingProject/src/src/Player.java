package src;
import java.util.ArrayList;
import java.util.List;

public class Player {
	  private List<Card> hand;
	    private int score;
	    private String name;

	    
	    public Player(String name) {
	        this.name = name;
	        this.hand = new ArrayList<>();
	        this.score = 0;
	    }

	    public List<Card> getHand() {
	        return hand;
	    }

	    public void setHand(List<Card> hand) {
	        this.hand = hand;
	    }

	    public int getScore() {
	        return score;
	    }

	    public void setScore(int score) {
	        this.score = score;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	   	    public void describe() {
	        System.out.println(name + "'s Hand:");
	        for (Card card : hand) {
	            card.describe();
	        }
	    }

	   
	    public Card flip() {
	        if (hand.isEmpty()) {
	            return null; 
	        }
	        return hand.remove(hand.size() - 1);
	    }

	    public void draw(Deck deck) {
	        Card card = deck.draw();
	        if (card != null) {
	            hand.add(card);
	        }
	    }

	    public void incrementScore() {
	        score++;
	    }
	}

