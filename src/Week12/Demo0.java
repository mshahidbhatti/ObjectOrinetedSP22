package Week12;

import java.io.*;

public class Demo0 {
    public static void main(String[] args) {

        //IO oeprations
        //java.util.io
        //File
        //FileWriter
        //BufferedWriter

        //FileReader
        //BufferedReader

        File f=new File("src/Week12/big.txt");

      //  writeToFile(f,"Text 1");


        String t=readFromFile(f);

        System.out.println(t);

    }

    public static void writeToFile(File file, String text){

        try {
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw=new BufferedWriter(fw);
            bw.write(text);
            bw.newLine();
            bw.close();
        }
        catch (IOException e){

        }
    }

    public static String readFromFile(File f){

        String tempData="";
        StringBuilder data=new StringBuilder("");

        try {


            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            while((tempData=br.readLine())!=null){
                data.append(tempData+"\n");

            }

        }
        catch (IOException e){

        }

        return data.toString();
    }



}
