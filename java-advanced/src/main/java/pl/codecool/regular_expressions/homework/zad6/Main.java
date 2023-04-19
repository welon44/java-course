package pl.codecool.regular_expressions.homework.zad6;

import java.io.File;
import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("src/main/resources/regular_expressions/homework/zad6/file.text");

        Zad6 zad6 = new Zad6(file);

        System.out.println("Liczba wystąpień słowa hello w pliku to: " + zad6.countWordsInFile());

    }
}
