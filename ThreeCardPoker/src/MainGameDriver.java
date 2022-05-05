import java.util.ArrayList;
import java.util.Scanner;
public class MainGameDriver {

	public static void main(String[] args) {
		
		//Miles Bramwit, Michael Beers, Rai Bindra
		
		
		int missCounter = 1;
		int points = 0;
		String playAgain = new String("Y");
		Scanner scanStr = new Scanner (System.in);
		
		String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9","10", "J", "Q", "K", "A"};
		String[] suits = {"Hearts", "Diamonds", "Spades", "Clubs"};
		
		ArrayList<Card> deck = new ArrayList<Card>();
		
		for (int x = 0; x<ranks.length; x++) {
			for (int y = 0; y<suits.length; y++) {
				deck.add(new Card(ranks[x], suits[y]));		
			}	
		}
		
		System.out.println("Welcome to Three Card Poker!");
		
		System.out.println("Want to play? (Y/N)?");
		playAgain = scanStr.nextLine();
		
		while (!playAgain.equals("Y") && !playAgain.equals("N")) {
	  		System.out.println("Please choose \"Y\" or \"N\"");
	  		playAgain = scanStr.nextLine();
	  	}
		
		if (playAgain.equals("N")) {
			System.out.println("Have a nice day!");
		}
		
		while (playAgain.equals("Y")){
		
		Card[] hand = new Card[3];
		
		int random1 = (int)(Math.random()*deck.size());
		
		Card card1 = deck.get(random1);
		
		deck.remove(random1);
		
		int random2 = (int)(Math.random()*deck.size());
		
		Card card2 = deck.get(random2);
		
		deck.remove(random2);
		
		int random3 = (int)(Math.random()*deck.size());
		
		Card card3 = deck.get(random3);
		
		deck.remove(random3);
		
		hand[0] = card1;
		hand[1] = card2;
		hand[2] = card3;
		
		System.out.println("Your hand is: ");
		
		for (Card x: hand) {
			System.out.println(x);
		}
		
		if (card1.getRank().equals(card2.getRank()) || card2.getRank().equals(card3.getRank()) || card1.getRank().equals(card3.getRank())) {
			if ((card1.getRank().equals(card2.getRank())) && (card2.getRank().equals(card3.getRank()))){
				System.out.println("You got a: Three of a Kind");
				missCounter = 0;
				points = points + 30;
				System.out.println("Your points: " + points);
			}
			else {
				System.out.println("You got a: Pair");
				missCounter = 0;
				points = points + 1;
				System.out.println("Your points: " + points);
			}
		}
		
		int card1Num = 0;
	    int card2Num = 0;
	    int card3Num = 0;
	        
	        if(card1.getRank().equals("2")){
	            card1Num=2;
	        }
	        if(card1.getRank().equals("3")){
	            card1Num=3;
	        }
	        if(card1.getRank().equals("4")){
	            card1Num=4;
	        }
	        if(card1.getRank().equals("5")){
	            card1Num=5;
	        }
	        if(card1.getRank().equals("6")){
	            card1Num=6;
	        }
	        if(card1.getRank().equals("7")){
	            card1Num=7;
	        }
	        if(card1.getRank().equals("8")){
	            card1Num=8;
	        }
	        if(card1.getRank().equals("9")){
	            card1Num=9;
	        }
	        if(card1.getRank().equals("10")){
	            card1Num=10;
	        }
	        if(card1.getRank().equals("J")){
	            card1Num=11;
	        }
	        if(card1.getRank().equals("Q")){
	            card1Num=12;
	        }
	        if(card1.getRank().equals("K")){
	            card1Num=13;
	        }
	        if(card1.getRank().equals("A")){
	            card1Num=1;
	        }
	
	        
	        if(card2.getRank().equals("2")){
	            card2Num=2;
	        }
	        if(card2.getRank().equals("3")){
	            card2Num=3;
	        }
	        if(card2.getRank().equals("4")){
	            card2Num=4;
	        }
	        if(card2.getRank().equals("5")){
	            card2Num=5;
	        }
	        if(card2.getRank().equals("6")){
	            card2Num=6;
	        }
	        if(card2.getRank().equals("7")){
	            card2Num=7;
	        }
	        if(card2.getRank().equals("8")){
	            card2Num=8;
	        }
	        if(card2.getRank().equals("9")){
	            card2Num=9;
	        }
	        if(card2.getRank().equals("10")){
	            card2Num=10;
	        }
	        if(card2.getRank().equals("J")){
	            card2Num=11;
	        }
	        if(card2.getRank().equals("Q")){
	            card2Num=12;
	        }
	        if(card2.getRank().equals("K")){
	            card2Num=13;
	        }
	        if(card2.getRank().equals("A")){
	            card2Num=1;
	        }
	        
	        
	        if(card3.getRank().equals("2")){
	            card3Num=2;
	        }
	        if(card3.getRank().equals("3")){
	            card3Num=3;
	        }
	        if(card3.getRank().equals("4")){
	            card3Num=4;
	        }
	        if(card3.getRank().equals("5")){
	            card3Num=5;
	        }
	        if(card3.getRank().equals("6")){
	            card3Num=6;
	        }
	        if(card3.getRank().equals("7")){
	            card3Num=7;
	        }
	        if(card3.getRank().equals("8")){
	            card3Num=8;
	        }
	        if(card3.getRank().equals("9")){
	            card3Num=9;
	        }
	        if(card3.getRank().equals("10")){
	            card3Num=10;
	        }
	        if(card3.getRank().equals("J")){
	            card3Num=11;
	        }
	        if(card3.getRank().equals("Q")){
	            card3Num=12;
	        }
	        if(card3.getRank().equals("K")){
	            card3Num=13;
	        }
	        if(card3.getRank().equals("A")){
	            card3Num=1;
	        }
	
	    boolean straight = false;
	    
	    if(card1Num==card2Num-1 && card1Num==card3Num-2){
	        straight=true;
	    }
	    if(card1Num==card2Num-2&&card1Num==card3Num-1){
	        straight=true;
	    }
	    if(card1Num==card2Num+2&&card1Num==card3Num+1){
	        straight=true;
	    }
	    if(card1Num==card2Num+1&&card1Num==card3Num+2){
	        straight=true;
	    }
	    if(card1Num==card2Num+1&&card1Num==card3Num-1){
	        straight=true;
	    }
	    if(card1Num==card2Num-1&&card1Num==card3Num+1){
	        straight=true;
	    }
	    if(card1Num==13&&card2Num==12&&card3Num==1){
	        straight=true;
	    }
	    if(card1Num==12&&card2Num==13&&card3Num==1){
	        straight=true;
	    }
	    if(card1Num==13&&card2Num==1&&card3Num==12){
	        straight=true;
	    }
	    if(card1Num==12&&card2Num==1&&card3Num==13){
	        straight=true;
	    }
	    if(card1Num==1&&card2Num==12&&card3Num==13){
	        straight=true;
	    }
	    if(card1Num==1&&card2Num==13&&card3Num==12){
	        straight=true;
	    }
	        
	    boolean flush = false;
	 
	  	if (card1.getSuit().equals(card2.getSuit()) && card2.getSuit().equals(card3.getSuit())) {
	  		flush = true;
	  	}
	  	
	  	if (flush && straight) {
	  		System.out.println("You got a: Mini Royale");
	  		points = points + 40;
			System.out.println("Your points: " + points);
	  	}
	  	else if (flush) {
	  		System.out.println("You got a: Flush");
	  		points = points + 3;
			System.out.println("Your points: " + points);
	  	}
	  	else if (straight) {
	  		System.out.println("You got a: Straight");
	  		points = points + 6;
			System.out.println("Your points: " + points);
	  	}
	  	else {
	  		missCounter++;
	  	}
	  	
	  	if (missCounter == 2) {
	  		System.out.println("You got: Nothing");
	  		points = points - 1 ;
			System.out.println("Your points: " + points);
	  		missCounter = 1;
	  	}
	  
	  	System.out.println("Play again? (Y/N)?");
	  	playAgain = scanStr.nextLine();
	  	
	  	while (!playAgain.equals("Y") && !playAgain.equals("N")) {
	  		System.out.println("Please choose \"Y\" or \"N\"");
	  		playAgain = scanStr.nextLine();
	  	}
	  	
	  	if (playAgain.equals("N")) {
			System.out.println("Have a nice day!");
		}
	  	
	  	deck.add(card1);
		deck.add(card2);
		deck.add(card3);
		
		}

	}

}
