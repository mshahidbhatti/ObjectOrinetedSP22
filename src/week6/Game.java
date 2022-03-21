package week6;

public class Game {
    Player player[];
    Deck deck=new Deck();

    public Game(int numberOfPlayers) {
        deck.shuffle();

        this.player = new Player[numberOfPlayers];
        for (int i=0;i<numberOfPlayers;i++)
            player[i]=new Player(52/numberOfPlayers);

    }

    public void distrbute(){

        Card temp=deck.cards[51];
        for(int i=51;i>0;i--)
        {
            player[0].setCard(deck.cards[i--]);
            //deck.cards[]=null;
            player[1].setCard(deck.cards[i--]);
            player[2].setCard(deck.cards[i--]);
            player[3].setCard(deck.cards[i]);

        }

    }

    public String printPlayer(){

        return player[1].cards[2].toString();
    }



}
