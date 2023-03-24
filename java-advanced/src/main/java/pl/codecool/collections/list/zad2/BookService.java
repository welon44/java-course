package pl.codecool.collections.list.zad2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class BookService {

    private final List<Book> booksList = new ArrayList<>();

    public void addBook(Book book) {
        booksList.add(book);
    }

    public void removeBookById(int id) {
        List<Book> booksToRemove = new ArrayList<>();
        booksList.forEach(book -> {
            if (book.getId() == id) {
                booksToRemove.add(book);
            }
        });

        booksList.removeAll(booksToRemove);
    }

    List<Book> getAllBooks() {
        return booksList;
    }

    List<Book> getAllBooksReleasedBefore(int year) {
        return booksList.stream().filter(book -> book.getYear() < year).collect(Collectors.toList());
    }

    Book getMostExpensiveBook() {
        return booksList.stream().max(Comparator.comparing(Book::getPrice)).orElseThrow();
    }

    Book getMostCheapestBook() {
        return booksList.stream().min(Comparator.comparing(Book::getPrice)).orElseThrow();
    }

    List<Book> getBooksWithAtLeastThreeAuthors() {
        return booksList.stream().filter(book -> book.getAuthors().size() >= 3).collect(Collectors.toList());
    }

    List<Book> searchBooks(Book searchedBook) {
        return booksList.stream().filter(book -> book.equals(searchedBook)).collect(Collectors.toList());
    }

    List<Book> searchBooksByAuthor(Author searchedAuthor) {
        return booksList.stream().filter(book -> book.getAuthors().contains(searchedAuthor)).collect(Collectors.toList());
    }



}
