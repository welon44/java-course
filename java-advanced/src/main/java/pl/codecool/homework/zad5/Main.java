package pl.codecool.homework.zad5;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        /*PIES*/
        List<Dog> dogList = new ArrayList<>();
        Dog dog1 = new Dog("Azor", 10);
        Dog dog2 = new Dog("Psotka", 5);
        Dog dog3 = new Dog("Reksio", 6);

        dogList.add(dog1);
        dogList.add(dog2);

        House<Dog> dogHouse = new House<>(dogList);
        System.out.println("Lista psów: " + dogHouse.gettList());

        System.out.println("Dodawanie psa:");
        dogHouse.addItemToList(dog3);
        System.out.println("Lista psów po dodaniu: " + dogHouse.gettList());

        System.out.println("Usuwanie psa:");
        dogHouse.removeItem(dog2);

        System.out.println("Lista psów po usunięciu: " + dogHouse.gettList());

        /*KOT*/
        List<Cat> catList = new ArrayList<>();
        Cat cat1 = new Cat("Kot1", 10);
        Cat cat2 = new Cat("Kot2", 5);
        Cat cat3 = new Cat("KO3", 6);

        catList.add(cat1);
        catList.add(cat2);

        House<Cat> catHouse = new House<>(catList);
        System.out.println("Lista psów: " + dogHouse.gettList());

        System.out.println("Dodawanie psa:");
        dogHouse.addItemToList(dog3);
        System.out.println("Lista psów po dodaniu: " + dogHouse.gettList());

        System.out.println("Usuwanie psa:");
        dogHouse.removeItem(dog2);

        System.out.println("Lista psów po usunięciu: " + dogHouse.gettList());

    }
}
