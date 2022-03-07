package week4;

public class Circle extends TwoDShapes{


    Circle(String name, int xCoordinate, int yCoordinate, double radius){
        super(name,xCoordinate,yCoordinate);
        this.radius=radius;
    }

    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public String toString(){
        return super.toString()+"\n"+"Radius:"+radius;
    }

}
