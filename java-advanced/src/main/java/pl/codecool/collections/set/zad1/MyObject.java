package pl.codecool.collections.set.zad1;

import java.util.Objects;

public class MyObject implements Comparable<MyObject> {

    private String name;

    public MyObject(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(MyObject o) {
        int length1 = this.name.length();
        int length2 = o.name.length();
        int limit = Math.min(length1, length2);

        char[] v1 = this.name.toCharArray();
        char[] v2 = o.name.toCharArray();

        for (int i = 0; i < limit; i++) {
            char ch1 = v1[i];
            char ch2 = v2[i];

            if (ch1 != ch2) {
                return ch1 - ch2;
            }
        }

        return length1 - length2;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MyObject myObject = (MyObject) o;
        return Objects.equals(name, myObject.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "MyObject{" +
                "name='" + name + '\'' +
                '}';
    }
}
