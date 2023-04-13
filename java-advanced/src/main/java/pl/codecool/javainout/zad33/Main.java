package pl.codecool.javainout.zad33;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        final String DIRECTORY = "C:\\Users\\y087599\\Pictures\\poziom1";

        Zad33 zad33 = new Zad33(DIRECTORY);

        var listFromSubdirectories = zad33.listFilesFromSubdirectories();

        listFromSubdirectories.forEach(item -> System.out.println(item + "\n"));

    }
}
