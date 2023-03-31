package pl.codecool.collections.map.zad4;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Storage {

    private final Map<String, List<String>> storageMap;

    public void addToStorage(String key, String value) {
        List<String> stringList = new ArrayList<>();

        storageMap.putIfAbsent(key, stringList);
        storageMap.get(key).add(value);
    }

    public List<String> printValues(String key) {
        return storageMap.get(key);
    }

    public List<String> findValues(String value) {
        List<String> keys = new ArrayList<>();
        for (Map.Entry<String, List<String>> entry : storageMap.entrySet()) {
            for (String element : entry.getValue()) {
                if (element.equals(value)) {
                    keys.add(entry.getKey());
                }
            }
        }

        return keys;
    }
}
