package Week8;

import java.io.IOException;

public class A {
    private int x=0;

    public A(int x) throws IOException{
        if(x<0)
            this.x = x;
        else
            throw new IllegalArgumentException();

        //if you want to throw exception
       // throw new IOException();
    }
}
