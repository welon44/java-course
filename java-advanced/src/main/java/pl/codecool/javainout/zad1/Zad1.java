package pl.codecool.javainout.zad1;

import java.io.File;


public class Zad1 {

    public static void main(String[] args) {

        File file = new File("src/main/java/pl/codecool/generics/examples");

        var cataloguesList = file.list();
        var filesList = file.listFiles();

        System.out.println("Lista katalogów: ");

        for (String item : cataloguesList) {
            System.out.println(item);
        }

        System.out.println("Lista plików: ");

        for (File item : filesList) {
            System.out.println(item);
        }
    }
}
