package week4;

import Week3.A;
import util.Point;

public class Demo {
    public static void main(String[] args) {

        Shape shape=new Shape("General");
        TwoDShapes twoDShapes =new TwoDShapes("Two D Shape",new Point(10,20));


    //    System.out.println(twoDShapes);

        Circle c1=new Circle("Two D Shape",new Point(1,2),100);

        System.out.println(c1);

        //Cube(String name, int x, int y, int z, double side)
        Cube cube1=new Cube("cube1",8,8,8,20.0);

    }
}
