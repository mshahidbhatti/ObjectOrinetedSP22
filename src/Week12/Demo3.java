package Week12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Demo3 {
    public static void main(String[] args) {
        try {
            // initialize lines stream
            Stream<String> stream = Files.lines(Paths.get("src/week12/big.txt"));

            // apply filters and print all ines
            stream.map(String::trim)
                    .filter(l -> !l.isEmpty())
                    .forEach(System.out::println);

            // close the stream
            stream.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }


    public static void writeToFile(){
        try {
            // data to write
            String contents = "Hey, there!\nWhat's up?";

            // write to file
            Files.write(Paths.get("output.txt"), contents.getBytes());
            // append to file
            //Files.write(Paths.get("output.txt"), contents.getBytes(), StandardOpenOption.APPEND);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
