package week6;

public class Card {
    private final String rank;
    private final String suit;

    Card(String suit, String rank){
        this.suit=suit;
        this.rank=rank;
    }

    @Override
    public String toString(){
        return String.format("%s of %s",this.rank,this.suit);
    }

    public String getRank() {
        return rank;
    }

    public String getSuit() {
        return suit;
    }
}
