package pl.codecool.collections.list.zad2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BookService bookService = new BookService();

        Author author1 = new Author("Marcin", "Welenc", "male");
        Author author2 = new Author("Janusz", "Kowalski", "male");
        Author author3 = new Author("Roman", "Tyk", "male");

        List<Author> list1 = new ArrayList<>();
        list1.add(author1);

        List<Author> list2 = new ArrayList<>();
        list2.add(author1);
        list2.add(author2);

        List<Author> list3 = new ArrayList<>();
        list3.add(author1);
        list3.add(author2);
        list3.add(author3);

        Book book1 = new Book(1, "Książka 1", 100, 1996, list1, BookGenre.FANTASY);
        Book book2 = new Book(2, "Książka 2", 101, 2000, list2, BookGenre.CRIMINAL);
        Book book3 = new Book(3, "Książka 3", 102, 2001, list3, BookGenre.CRIMINAL);

        bookService.addBook(book1);
        bookService.addBook(book2);
        bookService.addBook(book3);

        System.out.println("Wszystkie książki: " + bookService.getAllBooks());
        System.out.println("===========================");
        System.out.println("Książki wydane przed 1999: " + bookService.getAllBooksReleasedBefore(1999));
        System.out.println("===========================");
        System.out.println("Najdroższa książka to: " + bookService.getMostExpensiveBook());
        System.out.println("===========================");
        System.out.println("Najtańsza książka to: " + bookService.getMostCheapestBook());
        System.out.println("===========================");
        System.out.println("Książka z conajmniej 3 autorami: " + bookService.getBooksWithAtLeastThreeAuthors());
        System.out.println("===========================");
        System.out.println("Wyszukaj książkę: " + bookService.searchBooks(book3));
        System.out.println("===========================");
        System.out.println("Wyszukaj książkę po autorze: " + bookService.searchBooksByAuthor(author1));

    }
}
