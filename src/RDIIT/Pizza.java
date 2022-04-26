package RDIIT;

public class Pizza {

    public double radius;

    public Pizza(double radius) {
        this.radius = radius;
    }

    double getArea(int i){
        return Math.PI*radius*radius;
    }
}
