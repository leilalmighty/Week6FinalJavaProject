package src;

public class App {
	 public static void main(String[] args) {
	        Deck deck = new Deck();
	        Player player1 = new Player("Player 1");
	        Player player2 = new Player("Player 2");

	        
	        for (int i = 0; i < 52; i++) {
	            if (i % 2 == 0) {
	                player1.draw(deck);
	            } else {
	                player2.draw(deck);
	            }
	        }

	        
	        for (int i = 0; i < 26; i++) {
	            Card card1 = player1.flip();
	            Card card2 = player2.flip();
	            
	            System.out.println("Round " + (i + 1) + ":");
	            card1.describe();
	            card2.describe();

	            if (card1.getValue() > card2.getValue()) {
	                player1.incrementScore();
	                System.out.println("Player 1 wins this round.");
	            } else if (card1.getValue() < card2.getValue()) {
	                player2.incrementScore();
	                System.out.println("Player 2 wins this round.");
	            } else {
	                System.out.println("It's a tie!");
	            }

	            System.out.println("Score - Player 1: " + player1.getScore() + ", Player 2: " + player2.getScore());
	        }

	        
	        System.out.println("Final Score - Player 1: " + player1.getScore() + ", Player 2: " + player2.getScore());
	        if (player1.getScore() > player2.getScore()) {
	            System.out.println("Player 1 wins!");
	        } else if (player1.getScore() < player2.getScore()) {
	            System.out.println("Player 2 wins!");
	        } else {
	            System.out.println("It's a draw!");
	        }
	    }
	}

