package pl.codecool.javainout.zad5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Zad5 {

    private final File file;
    private final List<User> usersList = new ArrayList<>();

    public Zad5(File file) {
        this.file = file;
    }

    public List<User> readFileAndReturnUsersList() throws IOException {
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String nextLine;
        while ((nextLine = bufferedReader.readLine()) != null) {
            String[] stringsList = nextLine.split(",");

           String firstName = stringsList[0];
           String lastName = stringsList[1];

           if (stringsList.length == 3) {
               int age = Integer.parseInt(stringsList[2]);
               usersList.add(new User(firstName, lastName, age));
           }
        }

        return usersList;
    }
}
