package pl.codecool.exceptions.exercises.finallyexercise;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        File sourceFile = new File("src/main/resources/exceptions/finally2.txt");

        FileReader fileReader = null;
        IOException ioException = null;

        try {
            try {
                fileReader = new FileReader(sourceFile);

                int nextChar;
                while ((nextChar = fileReader.read()) != -1) {
                    System.out.println(nextChar);
                }
            } catch (FileNotFoundException e) {
                ioException = new IOException(e);
                System.out.println("Pierwszy bład z catcha: " + e.getMessage());
                throw ioException;
            } finally {
                try {
                    fileReader.close();
                } catch (Exception e) {
                    if (ioException == null) {
                        System.out.println("Bład finally: " + e.getMessage());
                        throw e;
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Bład końcowy " + e.getCause());
        }
    }
}
