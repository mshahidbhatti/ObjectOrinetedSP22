package week4;

public class Cube extends Shape3D{

    //no argument constructor
    double side;

    Cube(String name, int x, int y, int z, double side){
        super(name,x,y,z);
        this.side=side;
    }
    Cube(Cube c){
        this(c.getName(),c.x,c.y,c.z, c.side);
    }




}
