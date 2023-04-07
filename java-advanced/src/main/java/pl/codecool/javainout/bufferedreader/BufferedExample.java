package pl.codecool.javainout.bufferedreader;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedExample {

    public static void main(String[] args) throws IOException {

        File file = new File("src/main/resources/buffered_reader/buffered_reader.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        FileWriter fileWriter = new FileWriter(file, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        String nextLine;
        while ((nextLine = bufferedReader.readLine()) != null) {
            System.out.println(nextLine);
        }

        bufferedWriter.newLine();
        bufferedWriter.write("Next Line");

        bufferedReader.close();

        bufferedWriter.flush();
        bufferedWriter.close();

        file = new File("src/main/resources/buffered_reader/buffered_reader.txt");
        fileReader = new FileReader(file);
        bufferedReader = new BufferedReader(fileReader);

        file = new File("src/main/resources/buffered_reader/buffered_reader_saved.txt");
        fileWriter = new FileWriter(file, true);
        bufferedWriter = new BufferedWriter(fileWriter);

        nextLine = "";
        while ((nextLine = bufferedReader.readLine()) != null) {
            bufferedWriter.write(nextLine);
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.flush();
        bufferedWriter.close();

    }
}
