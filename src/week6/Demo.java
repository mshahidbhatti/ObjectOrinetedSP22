package week6;

public class Demo {
    public static void main(String[] args) {
/*        //Card c1=new Card("Dimond","King");
        //System.out.println(c1);
        Deck deck1=new Deck();

        System.out.println(deck1);

        deck1.shuffle();

        System.out.println(" shuffled cards");
        System.out.println(deck1);*/

        Game game1=new Game(4);
        game1.distrbute();
        System.out.println(game1.printPlayer());

    }
}
