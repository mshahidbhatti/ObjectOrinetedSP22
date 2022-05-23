package Week12;

import java.io.*;
import java.util.ArrayList;

public class ObjectsWriting {

    public static void main(String[] args) {
        //ObjectsWriting
        //ObjectOutputStream
        FileOutputStream fout=null;
        ObjectOutputStream oout=null;
try {
    fout = new FileOutputStream("data.ser",true);
    oout = new ObjectOutputStream(fout);
    Student st1=new Student("Name 2",2.0);
    oout.writeObject(st1);
    oout.close();
    fout.close();


    FileInputStream fin=new FileInputStream("data.ser");
    ObjectInputStream oin= new ObjectInputStream(fin);

    /*Object o=oin.readObject();
    Object o1=oin.readObject();


    Student temp=(Student) o;

    System.out.println("Name:"+temp.getName());
   // System.out.println("Name:"+((Student)o1).getName());*/

    ArrayList<Student> objectsList = new ArrayList<>();
    boolean cont = true;
    while (cont) {
        try (ObjectInputStream input = new ObjectInputStream(fin)) {
            Object obj = input.readObject();
            System.out.println();
            if (obj != null) {
                objectsList.add((Student) obj);
            } else {
                cont = false;
            }
        } catch (Exception e) {
            // System.out.println(e.printStackTrace());
        }
    }

        for(Student temp: objectsList)
            System.out.println(temp.getName());
}
catch (IOException e){

}







    }
}
