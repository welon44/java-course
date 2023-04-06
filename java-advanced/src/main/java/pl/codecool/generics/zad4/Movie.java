package pl.codecool.generics.zad4;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
public class Movie extends Medium {

    private int premiereYear;
    private String director;

    public Movie(String title,  int premiereYear, String director) {
        super(title);
        this.premiereYear = premiereYear;
        this.director = director;
    }

}
