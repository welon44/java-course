package pl.codecool.javainout.zad32;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Zad32 {

    private List<Car> carList;
    private final static String PATH_TO_FILE = "src/main/resources/zad32/car_list.txt";

    public Zad32(List<Car> carList) {
        this.carList = carList;
    }

    public void saveObjectToFile() throws IOException {
        File file = new File(PATH_TO_FILE);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(bufferedOutputStream);

        objectOutputStream.writeObject(carList);

        objectOutputStream.flush();
        objectOutputStream.close();
    }

    public List<Car> readObjectFromFile() throws IOException, ClassNotFoundException {
        File file = new File(PATH_TO_FILE);
        FileInputStream fileInputStream = new FileInputStream(file);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        ObjectInputStream objectInputStream = new ObjectInputStream(bufferedInputStream);

        List<Car> carsToReturn = new ArrayList<>();

        try {
            List<Car> newCarsList = (List<Car>) objectInputStream.readObject();
            newCarsList.forEach(car -> carsToReturn.add(car));
        } catch (EOFException e) {}

        objectInputStream.close();

        return carsToReturn;
    }
}
