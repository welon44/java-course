package pl.codecool.collections.list.zad2;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@EqualsAndHashCode
@Getter
@ToString
public class Author {

    private final String firstName;
    private final String lastName;
    private final String gender;

}
