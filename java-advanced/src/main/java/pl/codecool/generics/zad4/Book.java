package pl.codecool.generics.zad4;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Book extends Medium {

    private String author;

    public Book(String title, String author) {
        super(title);
        this.author = author;
    }
}
