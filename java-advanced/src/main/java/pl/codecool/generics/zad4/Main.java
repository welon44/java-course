package pl.codecool.generics.zad4;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        /* WYWOŁANIE DLA KSIĄŻEK */

        List<Book> bookList = new ArrayList<>();
        Book book1 = new Book("W pustyni i w puszczy", "Henryk Sienkiewicz");
        Book book2 = new Book("Lalka", "Bolesław Prus");
        Book book3 = new Book("Nad Niemnem", "Eliza Orzeszkowa");
        Book book4 = new Book("Ludzie bezdomni", "Stefan Żeromski");
        Book book5 = new Book("Nieustraszony", "Marcin Najman");

        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);

        Library<Book> bookLibrary = new Library<>(bookList);
        System.out.println("Lista książek: " + bookLibrary.gettList());

        System.out.println("Dodawanie książki: ");
        bookLibrary.addItemToList(book5);
        System.out.println("W bibliotece: " + bookLibrary.gettList());

        System.out.println("Usuwanie książki: ");
        bookLibrary.removeItem(book2);

        System.out.println("W bibliotece po usunięciu: " + bookLibrary.gettList());

        /* WYWOŁANIE DLA GAZET */

        List<Newspaper> newspaperList = new ArrayList<>();
        Newspaper newspaper1 = new Newspaper("TYGODNIK NIE", new Date(2023, Calendar.MAY, 15), "Wydawnictwo 1", 30000);
        Newspaper newspaper2 = new Newspaper("Gazeta Wyborcza", new Date(2023, Calendar.MAY, 10), "Wydawnictwo 2", 40000);
        Newspaper newspaper3 = new Newspaper("Sieci", new Date(2023, Calendar.MAY, 10), "Wydawnictwo 3", 40000);

        newspaperList.add(newspaper1);
        newspaperList.add(newspaper2);

        Library<Newspaper> newspaperLibrary = new Library<>(newspaperList);
        System.out.println("Lista gazet: " + newspaperLibrary.gettList());

        System.out.println("Dodawanie gazety: ");
        newspaperLibrary.addItemToList(newspaper3);
        System.out.println("W bibliotece gazet: " + bookLibrary.gettList());

        System.out.println("Usuwanie gazety: ");
        newspaperLibrary.removeItem(newspaper2);

        System.out.println("W bibliotece po usunięciu: " + newspaperLibrary.gettList());

        /* WYWOŁANIE DLA FILMÓW */

        List<Movie> movieList = new ArrayList<>();
        Movie movie1 = new Movie("Film 1", 2000, "Reżyser 1");
        Movie movie2 = new Movie("Film 2", 2001, "Reżyser 2");
        Movie movie3 = new Movie("Film 3", 2002, "Reżyser 3");

        movieList.add(movie1);
        movieList.add(movie2);

        Library<Movie> movieLibrary = new Library<>(movieList);
        System.out.println("Lista filmów: " + movieLibrary.gettList());

        System.out.println("Dodawanie filmu: ");
        movieLibrary.addItemToList(movie3);
        System.out.println("W bibliotece filmów: " + movieLibrary.gettList());

        System.out.println("Usuwanie filmu: ");
        movieLibrary.removeItem(movie2);

        System.out.println("W bibliotece po usunięciu: " + movieLibrary.gettList());

    }
}
