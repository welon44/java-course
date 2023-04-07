package pl.codecool.javainout.serialization;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import pl.codecool.javainout.zad5.User;

public class SerializationExample {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        File file = new File("src/main/resources/serialization/serialization_file.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(bufferedOutputStream);

        User user = new User("Marcin", "Welenc", 34);
        objectOutputStream.writeObject(user);
        objectOutputStream.writeBoolean(true);
        objectOutputStream.flush();

        //*ODCZYT*//

        FileInputStream fileInputStream = new FileInputStream(file);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        ObjectInputStream objectInputStream = new ObjectInputStream(bufferedInputStream);

        System.out.println(objectInputStream.readObject());

    }
}
