package week6;

public class Player {
    Card cards[];
    int cardsCounter=0;
    Player(int length){
        cards=new Card[length];
    }



    public void setCard(Card c){
        cards[cardsCounter++]=c;
    }

}
