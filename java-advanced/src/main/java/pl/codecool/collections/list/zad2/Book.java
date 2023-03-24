package pl.codecool.collections.list.zad2;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Book {

    private int id;
    private String title;
    private double price;
    private int year;
    private List<Author> authors;
    private final BookGenre bookGenre;

}
