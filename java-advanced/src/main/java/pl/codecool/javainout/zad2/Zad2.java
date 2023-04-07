package pl.codecool.javainout.zad2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Zad2 {

    public static void main(String[] args) throws IOException {

        File file = new File("src/main/resources/buffered_reader/example_read_write.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String nextLine;

        while ((nextLine = bufferedReader.readLine()) != null) {
            System.out.println(nextLine);
        }

        bufferedReader.close();
    }
}
