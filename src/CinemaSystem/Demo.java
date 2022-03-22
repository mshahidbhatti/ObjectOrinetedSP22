package CinemaSystem;

public class Demo {
    Seat seats[];
    public static void main(String[] args) {
    //Demo obj=new Demo();

        Seat seatsLayout[][]=new Seat[5][];
        seatsLayout[0]=new Seat[5];
        seatsLayout[1]=new Seat[4];
        seatsLayout[2]=new Seat[3];
        seatsLayout[3]=new Seat[2];
        seatsLayout[4]=new Seat[5];



            initSeats(seatsLayout);

            displayLaout(seatsLayout);

   /*     Seat seats[]; //declaration of an array of seat type
        seats=new Seat[20];
        for(int i=0;i<seats.length;i++)
            seats[i]=new Seat();
*/

/*        for(Seat t:seats)
            System.out.println(t);*/
        //System.out.println(seats.length);
        //System.out.println(Integer.MAX_VALUE);

    }

    public static void displayLaout(Seat array[][]){
        for(int i=0;i<array.length;i++) {
            System.out.println();
            displayOneD(array[i]);
        }
    }


    public static void displayOneD(Seat seats[]){
        for (int j = 0; j < seats.length; j++)
            System.out.print(seats[j]+" ");
    }

    public static void initSeats(Seat seatsLayout[][]){
        for(int i=0;i<seatsLayout.length;i++)
            for (int j = 0; j < seatsLayout[i].length; j++)
                seatsLayout[i][j]=new Seat();

    }



    public static Seat[][] getArray(){

        return null;
    }
}
