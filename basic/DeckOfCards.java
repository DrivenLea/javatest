package 练习;

public class DeckOfCards {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] deck = new int [52];
		String[] suits ={"Spades","Hearts","Diamonds","Clubs"};
		String[] ranks= {"Ace","2","3","4","5","6","7","8","9","10","Jacl","Queen","King"};
		
		for(int i= 0;i<deck.length  ;i++) {
			deck[i] = i ;
			int index =(int)(Math.random() * deck.length );
			
			int temp = deck[i];
			deck[i]=deck[index];
			deck[index]=temp;
		}
		
		for(int i = 0;i<4;i++) {
			String suit = suits[deck[i]/13];
			String rank = ranks[deck[i]%13];
			System.out.println("Card number " + deck[i] + ": " + 
			rank + " of " + suit );
		}
		
}
}