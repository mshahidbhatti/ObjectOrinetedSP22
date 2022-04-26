package week11;

import java.awt.Point;
import java.util.HashSet;
import java.util.Set;
//import Person;

public class Demo {

    public static void main(String[] args) {

  //      Person p=new Person();
        //
        Set set=new HashSet();
        set.add("String");
        set.add(new Point(1,2));



        Set<Point> points=new HashSet<Point>();
        points.add(new Point(1,2));
        points.add(new Point(1,2));
        points.add(new Point(1,2));
        points.add(new Point(1,3));

        System.out.println(points);






    }

    //"name",1
    //"name",1
}
