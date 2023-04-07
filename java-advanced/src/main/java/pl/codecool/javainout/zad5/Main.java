package pl.codecool.javainout.zad5;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        File file = new File("src/main/resources/zad5/users.csv");
        Zad5 zad5 = new Zad5(file);

        var usersList = zad5.readFileAndReturnUsersList();
        System.out.println("Lista userów: " + usersList);
    }
}
