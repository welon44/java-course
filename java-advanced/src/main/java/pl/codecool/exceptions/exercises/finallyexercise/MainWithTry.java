package pl.codecool.exceptions.exercises.finallyexercise;

import java.io.*;

public class MainWithTry {

    public static void main(String[] args) {

        File sourceFile = new File("src/main/resources/exceptions/finally.txt");

        try (MyAutoCloseableExample myAutoCloseableExample = new MyAutoCloseableExample();
             FileReader fileReader = new FileReader(sourceFile)) {

            int nextChar;
            while ((nextChar = fileReader.read()) != -1) {
                System.out.println(nextChar);
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
            System.out.println("System out: " + System.out);
            System.out.println("Pierwszy bład z catcha: " + e.getMessage());
            for (Throwable throwable : e.getSuppressed()) {
                System.out.println("Suppressed");
                throwable.printStackTrace(System.out);
            }
        }
    }
}
