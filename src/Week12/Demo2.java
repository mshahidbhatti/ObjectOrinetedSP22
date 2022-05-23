package Week12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Demo2 {
    public static void main(String[] args) {
        try {
            // read all lines
            List<String> lines = Files.readAllLines(Paths.get("src/week12/big.txt"));
            //By default its encoding is UTF-8
            //List<String> lines = Files.readAllLines(Paths.get("input.txt"), StandardCharsets.UTF_16);

            // print all lines
            for (String line : lines) {
                System.out.println(line);
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
