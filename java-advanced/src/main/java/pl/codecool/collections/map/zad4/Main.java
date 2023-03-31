package pl.codecool.collections.map.zad4;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<String, List<String>> storageMap = new HashMap<>();

        Storage storage = new Storage(storageMap);

        storage.addToStorage("Test", "test");
        storage.addToStorage("Test", "test");
        storage.addToStorage("Test 2", "test 2");
        storage.addToStorage("Z", "zz");

        System.out.println(storage.getStorageMap());
        System.out.println(storage.printValues("Test"));
        System.out.println(storage.findValues("zz"));
    }
}
