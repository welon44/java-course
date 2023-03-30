package pl.codecool.collections.set.zad1;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        MyObject myObject1 = new MyObject("Zuzanna", 3);
        MyObject myObject2 = new MyObject("Paweł", 2);
        MyObject myObject3 = new MyObject("Staszek", 1);
        MyObject myObject4 = new MyObject("Tadeusz", 50);

//        System.out.println(myObject1.compareTo(myObject2));
//        System.out.println(myObject2.compareTo(myObject1));
//        System.out.println(myObject1.compareTo(myObject3));

        SortedSet<MyObject> sortedSet = new TreeSet<>();
        sortedSet.add(myObject1);
        sortedSet.add(myObject2);
        sortedSet.add(myObject3);
        sortedSet.add(myObject4);

        Comparator<MyObject> nameFieldComparator = new Comparator<MyObject>() {
            @Override
            public int compare(MyObject o1, MyObject o2) {
                int lengthToComparingResult = o1.getName().length() - o2.getName().length();

                if (lengthToComparingResult == 0) {
                    return o1.getName().compareToIgnoreCase(o2.getName());
                }

                return lengthToComparingResult;
            }
        };

        Comparator<MyObject> numberFieldComparator = new Comparator<MyObject>() {
            @Override
            public int compare(MyObject o1, MyObject o2) {
                return o1.getNumber().compareTo(o2.getNumber());
            }
        };

        Comparator<MyObject> finalComparator = nameFieldComparator.thenComparing(numberFieldComparator);

        SortedSet<MyObject> twoFieldSortedSet = new TreeSet<>(finalComparator);
        twoFieldSortedSet.add(myObject1);
        twoFieldSortedSet.add(myObject2);
        twoFieldSortedSet.add(myObject3);
        twoFieldSortedSet.add(myObject4);

        twoFieldSortedSet.forEach(System.out::println);

        Comparator<MyObject> finalFieldComparator = new Comparator<MyObject>() {
            @Override
            public int compare(MyObject o1, MyObject o2) {
                int lengthToComparingResult = o1.getName().length() - o2.getName().length();

                if (lengthToComparingResult == 0) {
                    int caseComparingResult = o1.getName().compareToIgnoreCase(o2.getName());
                    if (caseComparingResult == 0) {
                        return o1.getNumber().compareTo(o2.getNumber());
                    }

                    return caseComparingResult;
                }

                return lengthToComparingResult;
            }
        };

    }
}
