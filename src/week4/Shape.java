package week4;

public class Shape {
    private String name;

    Shape(String name){
        this.name=name;
    }

/*    Shape(){

    }*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name:"+name;
    }
}
