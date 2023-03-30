package pl.codecool.collections.set.zad1;

import java.util.SortedSet;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        MyObject myObject1 = new MyObject("String 3");
        MyObject myObject2 = new MyObject("String 2");
        MyObject myObject3 = new MyObject("String 1");

//        System.out.println(myObject1.compareTo(myObject2));
//        System.out.println(myObject2.compareTo(myObject1));
//        System.out.println(myObject1.compareTo(myObject3));

        SortedSet<String> sortedSet = new TreeSet<>();
        sortedSet.add(myObject1.getName());
        sortedSet.add(myObject2.getName());
        sortedSet.add(myObject3.getName());

        sortedSet.forEach(System.out::println);

    }
}
