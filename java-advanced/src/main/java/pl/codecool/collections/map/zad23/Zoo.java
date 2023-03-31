package pl.codecool.collections.map.zad23;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class Zoo {

    private Map<String, Integer> animals;

    public int getNumberOfAllAnimals() {
        int size = 0;
        for (Map.Entry<String, Integer> animal : animals.entrySet()) {
            size += animal.getValue();
            System.out.println("size " + animal.getValue());
        }

        return size;
    }

    public Map<String, Integer> getAnimalsCount() {

        Map<String, Integer> result = new HashMap<>();

        animals.entrySet().forEach(animal -> {
            result.put(animal.getKey(), animal.getValue());
        });

        return result;
    }

    public Map<String, Integer> getAnimalsCountSorted() {

        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : animals.entrySet()) {
            list.add(entry.getValue());
        }

        list.sort(Collections.reverseOrder());

        for (int num : list) {
            for (Map.Entry<String, Integer> entry : animals.entrySet()) {
                if (entry.getValue().equals(num)) {
                    sortedMap.put(entry.getKey(), num);
                }
            }
        }

        return sortedMap;
    }

    public void addAnimals(String specie, Integer value) {
        animals.computeIfPresent(specie, (k, v) -> v + value);
        animals.putIfAbsent(specie, value);
    }

}
