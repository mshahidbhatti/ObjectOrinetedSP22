package week4;

import util.Point;

public class Circle extends TwoDShapes{

    private double radius;


    Circle(String name, Point center, double radius){
        super(name,center);
        setRadius(radius);
    }



    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
            if(radius>0)
                this.radius = radius;
    }
    public String toString(){
        return super.toString()+"\n"+"Radius:"+radius;
    }

}
