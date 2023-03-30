package pl.codecool.collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetExample {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();

        Integer integer = 50;
        set.add(1);
        set.add(10);
        set.add(14);
        set.add(17);
        set.add(21);
        set.add(100);
        set.add(121);
        set.add(integer);

        Iterator<Integer> iterator = set.iterator();

        while (iterator.hasNext()) {
            System.out.println("I: " + iterator.next());
        }

        Set<Integer> linkedSet = new LinkedHashSet<>();
        linkedSet.add(10);
        linkedSet.add(2);
        linkedSet.add(4);
        linkedSet.add(5);
        linkedSet.add(6);
        linkedSet.add(7);
        linkedSet.add(-100);

        linkedSet.forEach(System.out::println);

    }

}
