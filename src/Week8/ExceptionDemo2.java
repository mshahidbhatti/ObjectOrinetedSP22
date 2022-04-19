package Week8;

import javax.imageio.IIOException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ExceptionDemo2 {

    public static void main(String[] args){
        fileReader();

        try {
            fileReader2();
        }
        catch (MyException e){
            e.getMessage();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        //throw new MyException();

        //new A(4);
    }


    public static void fileReader()  {
        try {
            File f = new File("data.txt");
            FileWriter fw = new FileWriter(f);
        }
        catch (IOException e){

        }
    }

    public static void fileReader2() throws IOException{
        File f = new File("data.txt");
        FileWriter fw = new FileWriter(f);
    }
}
