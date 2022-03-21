package week6;

import java.util.Random;

public class Deck {
    Card cards[];
    private static final String ranks[]={"2","3","4","5","6","7","8","9","10",
            "Jack","Queen","King","Ace"};
    private static final String suits[]={"Diamonds","Spades","Clubs","Hearts"};


    Deck(){
        cards = new Card[52];
        //cards[0]=new Card("Diamonds","2");
        int counter=0;
        for(int i=0;i<suits.length;i++)
            for(int j=0;j< ranks.length;j++)
                cards[counter++]=new Card(suits[i],ranks[j]);

    }


@Override
public String toString(){

        StringBuilder deckDetail=new StringBuilder();
        //enhanced for loop
        for(Card c:cards)
            deckDetail.append(String.format("%s %n",c.toString()));

        return deckDetail.toString();
}


public void shuffle(){
        //deck[] 0---51
    Random ran=new Random();
    //ran.nextInt(52);

    for(int i=0;i<1000;i++)
    {
        Card temp=cards[0];
        int randomPoistion=ran.nextInt(52);
        cards[0]=cards[randomPoistion];
        cards[randomPoistion]=temp;
    }

}

}
