package pl.codecool.generics.zad27;

import java.util.List;
import java.util.Objects;

public class Joiner<T> {

    private final String separator;

    public Joiner(String separator) {
        this.separator = separator;
    }

    public String join(List<T> tList) {

        StringBuilder newString = new StringBuilder();

        tList.stream().forEach(item -> {
            newString.append(newString.length() > 0 ? separator : "");
            newString.append(item.toString());
        });

        return newString.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Joiner joiner = (Joiner) o;
        return Objects.equals(separator, joiner.separator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(separator);
    }

    @Override
    public String toString() {
        return "Joiner{" +
                "separator='" + separator + '\'' +
                '}';
    }
}
