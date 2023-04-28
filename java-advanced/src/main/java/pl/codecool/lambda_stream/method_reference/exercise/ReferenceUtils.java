package pl.codecool.lambda_stream.method_reference.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ReferenceUtils {

    private final List<Integer> integerList = new ArrayList<>();
    private final List<String> stringList = new ArrayList<>();

    public ReferenceUtils() {
        this.setStringList();
        this.setIntegerList();
    }

    public void setIntegerList() {
        for (int i = 0; i < 10; i++) {
            integerList.add(i);
        }
    }

    public void setStringList() {
        stringList.add("Testaaaa");
        stringList.add("Testa");
        stringList.add("Testaaf");
    }

    public List<Integer> getIntegerList() {
        return integerList;
    }

    public List<String> getStringList() {
        return stringList;
    }

    public int getSum() {
        return getIntegerList().stream()
                .reduce(0, Integer::sum);
    }

    public int getMaxNumberFromList() {
        return getIntegerList().stream()
                .max(Integer::compareTo)
                .orElseThrow(null);
    }

    public List<String> sortByLength() {
        return getStringList().stream()
                .sorted(ReferenceUtils::compareByLength).collect(Collectors.toList());
    }

    public List<Integer> getEventList() {
        return getIntegerList().stream()
                .filter(ReferenceUtils::isNumberEven)
                .collect(Collectors.toList());
    }

    private static int compareByLength(String aName, String bName) {
        return aName.length() - bName.length();
    }

    private static boolean isNumberEven(Integer number) {
        return number % 2 == 0;
    }
}
