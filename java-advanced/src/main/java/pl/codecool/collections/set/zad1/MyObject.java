package pl.codecool.collections.set.zad1;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Getter
@Setter
public class MyObject implements Comparable<MyObject> {

    private String name;
    private Integer number;

//    @Override
//    public int compareTo(MyObject o) {
//        int length1 = this.name.length();
//        int length2 = o.name.length();
//        int limit = Math.min(length1, length2);
//
//        char[] v1 = this.name.toCharArray();
//        char[] v2 = o.name.toCharArray();
//
//        for (int i = 0; i < limit; i++) {
//            char ch1 = v1[i];
//            char ch2 = v2[i];
//
//            if (ch1 != ch2) {
//                return ch1 - ch2;
//            }
//        }
//
//        return length1 - length2;
//    }

    @Override
    public int compareTo(MyObject o) {
        int lengthToComparingResult = this.name.length() - o.name.length();

        if (lengthToComparingResult == 0) {
            return this.name.compareToIgnoreCase(o.name);
        }

        return lengthToComparingResult;
    }
}
