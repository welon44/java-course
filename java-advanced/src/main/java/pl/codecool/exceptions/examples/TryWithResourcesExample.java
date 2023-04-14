package pl.codecool.exceptions.examples;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class TryWithResourcesExample {

    public static void main(String[] args) {

        File sourceFile = new File("src/main/resources/exceptions/finall.txt");
        File outputFile = new File("src/main/resources/exceptions/finally_output.txt");

        try (MyAutoCloseable myAutoCloseable = new MyAutoCloseable();
             CloseExample closeExample = new CloseExample();
             FileReader fileReader = new FileReader(sourceFile);
             FileWriter fileWriter = new FileWriter(outputFile)) {

            int nextChar;
            while ((nextChar = fileReader.read()) != -1) {
                fileWriter.write(nextChar);
            }

        } catch (Exception e) {
            System.out.println("Catch");
            System.out.println("Original");
            e.printStackTrace(System.out);
            for (Throwable throwable : e.getSuppressed()) {
                System.out.println("Suppressed");
                throwable.printStackTrace(System.out);
            }
        }
    }
}
