package pl.codecool.javainout.zad3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Zad3 {

    public static void main(String[] args) throws IOException {

        File file = new File("src/main/resources/buffered_reader/example_read_write.txt");
        FileWriter fileWriter = new FileWriter(file, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        bufferedWriter.write(System.lineSeparator());
        bufferedWriter.write("Żartowałem");

        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
