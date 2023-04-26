package deckOfCards;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Cards {

	public static void main(String[] args) {
		
		String [] suit= {"Clubs","Diamonds","Heart","Spades"};
		String [] rank= {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
		String [] cards = new String[52];
		int n=0;
		for(int i=0;i<suit.length;i++)
		{
			for(int j=0;j<rank.length;j++)
			{
				cards[n]=suit[i]+rank[j];
				System.out.println(cards[n]);
				n++;
			}
		}
		List<String>cardslist=Arrays.asList(cards);
		
		Collections.shuffle(cardslist);
		
		String [] player1 = new String[9];
		String [] player2 = new String[9];
		String [] player3 = new String[9];
		String [] player4 = new String[9];
		
		int a=0;
		for(int k=0;k<36;k++)
		{
			if(k<9)
			{
				player1[a]=cardslist.get(k);
				a++;
			}
			if(k>=9 && k<18)
			{
				player2[a]=cardslist.get(k);
				a++;
			}
			if(k>=18 && k<27)
			{
				player3[a]=cardslist.get(k);
				a++;
			}
			if(k>=27 && k<36)
			{
				player4[a]=cardslist.get(k);
				a++;
			}
			if(a==9)
			{
				a=0;
			}
		}
		
		
		System.out.println();
		
		System.out.println("Card get by Plyer1");
		for(int i=0;i<9;i++)
		{
			System.out.println(i+1+"-"+player1[i]);
		}
		
		System.out.println();
		
		System.out.println("Card get by Plyer2");
		for(int i=0;i<9;i++)
		{
			System.out.println(i+1+"-"+player2[i]);
		}
		
        System.out.println();
		
        System.out.println("Card get by Plyer3");
		for(int i=0;i<9;i++)
		{
			System.out.println(i+1+"-"+player3[i]);
		}
		
        System.out.println();
		
        System.out.println("Card get by Plyer4");
		for(int i=0;i<9;i++)
		{
			System.out.println(i+1+"-"+player4[i]);
		}
	}

}
