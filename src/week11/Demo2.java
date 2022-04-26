package week11;

import java.util.ArrayList;

public class Demo2 {
    public static void main(String[] args) {
        ArrayList<Movie> list=new ArrayList<Movie>();

        list.add(new Movie("Movie 1"));
        list.add(new Movie("Movie 2"));
        list.add(new Movie("Movie 3"));
        list.add(new Movie("Movie 4"));

        SwapElements<Movie> se=new SwapElements<Movie>();
        System.out.println(list);
        System.out.println();
        se.swap(list,1,2);
        System.out.println(list);


    }
}
