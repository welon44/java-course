package pl.codecool.javainout.Zad4;

import java.io.File;
import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("src/main/resources/buffered_reader/example_read_write.txt");

        Zad4 zad4 = new Zad4(file);

        System.out.println("Najdłuższe słowo w pliku to: " +  zad4.findLongestWordInFile());
    }
}
