package pl.codecool.generics.zad4;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Newspaper extends Medium {

    private Date date;
    private String publishingHouse;
    private int overlay;

    public Newspaper(String title, Date date, String publishingHouse, int overlay) {
        super(title);
        this.date = date;
        this.publishingHouse = publishingHouse;
        this.overlay = overlay;
    }
}
