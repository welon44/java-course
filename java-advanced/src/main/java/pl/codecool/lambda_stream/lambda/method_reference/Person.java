package pl.codecool.lambda_stream.lambda.method_reference;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Person implements Comparable<Person> {

    private long id;
    private String firstName;
    private int age;

    public Person(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public int compareTo(Person o) {
        return age - o.age;
    }
}
