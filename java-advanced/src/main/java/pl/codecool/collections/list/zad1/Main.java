package pl.codecool.collections.list.zad1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();

        stringList.add("stół");
        stringList.add("krzesło");
        stringList.add("abażur");
        stringList.add("Dywan");
        stringList.add("paproć");
        stringList.add("żubr");

        Collections.sort(stringList, String.CASE_INSENSITIVE_ORDER);

        System.out.println("A do Z: " + stringList);

        stringList.sort(Collections.reverseOrder(String.CASE_INSENSITIVE_ORDER));

        System.out.println("Z do A: " + stringList);

    }
}
