package pl.codecool.collections.linked_hashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

    public static void main(String[] args) {

//        Map<String, Integer> linkedMap = new LinkedHashMap<>();
//
//        linkedMap.put("Elem1", 1);
//        linkedMap.put("Elem2", 2);
//        linkedMap.put("Elem3", 3);
//        linkedMap.put("Elem4", 4);
//        linkedMap.put("Elem5", 5);
//
//        linkedMap.put("Elem1", 10);
//
//        for (Map.Entry<String, Integer> entry : linkedMap.entrySet()) {
//            System.out.printf("Key: %s, value %d\n", entry.getKey(), entry.getValue());
//        }

        Map<String, Integer> newLinkedMap = new LinkedHashMap<>(6, 0.75f, true);
        newLinkedMap.put("Elem1", 1);
        newLinkedMap.put("Elem2", 2);
        newLinkedMap.put("Elem3", 3);
        newLinkedMap.put("Elem4", 4);
        newLinkedMap.put("Elem5", 5);
        newLinkedMap.put("Elem6", 6);
        newLinkedMap.put("Elem7", 7);
        newLinkedMap.put("Elem8", 8);

        for (Map.Entry<String, Integer> entry : newLinkedMap.entrySet()) {
            System.out.printf("Key: %s, value %d\n", entry.getKey(), entry.getValue());
        }

        newLinkedMap.get("Elem5");
        newLinkedMap.get("Elem1");
        newLinkedMap.put("Elem9", 9);
        System.out.println("======");

        for (Map.Entry<String, Integer> entry : newLinkedMap.entrySet()) {
            System.out.printf("Key: %s, value %d\n", entry.getKey(), entry.getValue());
        }

    }
}
