package week4;

import util.Point;

public class TwoDShapes extends Shape{

        private Point center;

        public TwoDShapes(String name, Point center){
                //call to parent constructor
                super(name);
                this.center=center;
        }

        public String toString(){
                return super.toString()+"\n"+"x:"+center.toString();
        }

}
