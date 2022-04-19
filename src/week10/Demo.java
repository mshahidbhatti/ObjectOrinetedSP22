package week10;

import java.util.ArrayList;
import java.util.Collections;

public class Demo {
    public static void main(String[] args) {

        Movie movieArray[]=new Movie[10];
        movieArray[0]=new Movie("Movie1",3,2022);

        //Collections framework

        ArrayList<Movie> moviesList=new ArrayList<Movie>();

        //moviesList.add(new Movie("m2",2021,3));

        moviesList.add(new Movie("m2",2021,3));
        moviesList.add(new Movie("m3",2021,3));
        moviesList.add(new Movie("m4",2021,3));

        System.out.println(moviesList);

        moviesList.size();
        Movie temp=new Movie("m2",2021,3);
        moviesList.remove(temp);

        moviesList.remove(0);
        System.out.println(moviesList);

        ArrayList<Movie> list2=new ArrayList<>();
        list2.add(new Movie("m5",2022,5));
        list2.add(new Movie("m6",1999,4));
        System.out.println(moviesList.size());

        moviesList.addAll(list2);
        moviesList.addAll(0,list2);

        System.out.println(moviesList);

        //Movie[] mArray=(Movie[]) moviesList.toArray();

        int i=moviesList.indexOf(new Movie("m5",2022,5));
        System.out.println(i);

        System.out.println(moviesList.contains(new Movie("m4",2022,5)));

        Movie mt=moviesList.get(1);

        System.out.println(mt);

        moviesList.sort(new Movie("m4",2022,5));
        System.out.println(moviesList);


    }
}
