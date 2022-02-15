public class Rectangle {

    //instance varibles, attrbutes, fields
    //encapsulated
    private double length;
    private double width;
    public void setLength(double length){
        if(length>=0)
            this.length=length;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width>=0)
            this.width = width;
    }
}
