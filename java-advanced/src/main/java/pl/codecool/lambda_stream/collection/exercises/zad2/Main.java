package pl.codecool.lambda_stream.collection.exercises.zad2;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Zad2 zad2 = new Zad2();

        System.out.println("Liczba wszystkich słów: " + zad2.readAllWordsInFile());
        zad2.readEveryWordCount();
    }
}
