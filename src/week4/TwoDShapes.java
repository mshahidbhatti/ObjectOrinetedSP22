package week4;

public class TwoDShapes extends Shape{
        private int xCoordinate;
        private int yCoordinate;
        TwoDShapes(String name, int xCoordinate, int yCoordinate){
                //call to parent constructor
                super(name);
                this.xCoordinate=xCoordinate;
                this.yCoordinate=yCoordinate;

        }

        public String toString(){
                return super.toString()+"\n"+"x:"+xCoordinate+" y:"+yCoordinate;
        }

}
