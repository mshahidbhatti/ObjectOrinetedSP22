package week11;

import java.util.ArrayList;

public class SwapElements<T> {

    T t;

    public SwapElements(T t) {
        this.t = t;
    }
    public SwapElements(){

    }


    public void swap(ArrayList<T> list,Integer sourseLocation, Integer destinationLocation){

        T source=list.get(sourseLocation);
        list.set(sourseLocation, list.get(destinationLocation));

        list.set(destinationLocation,source);

    }


}
