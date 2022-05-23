package Week12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Demo {
    public static void main(String[] args) {
        try {
            // read all bytes
            byte[] bytes = Files.readAllBytes(Paths.get("src/Week12/input.txt"));

            // convert bytes to string
            String content = new String(bytes);

            // print contents
            System.out.println(content);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
