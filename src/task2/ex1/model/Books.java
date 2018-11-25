package task2.ex1.model;

import task2.ex1.model.entity.Book;

import java.util.*;

public class Books {

    private Book[] books;

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public Book[] getByAuthor(String author){
        return Arrays.stream(books)
                .filter(book -> book.getAuthor().equals(author))
                .toArray(Book[]::new);
    }

    public Book[] getByPublisher(String publisher){
        return Arrays.stream(books)
                .filter(book -> book.getPublisher().equals(publisher))
                .toArray(Book[]::new);
    }

    public Book[] getAfterYear(int year){
        return Arrays.stream(books)
                .filter(book -> book.getYear() >= year)
                .toArray(Book[]::new);
    }

    public void sortByPublisher(){
        books = Arrays.stream(books)
                .sorted(Comparator.comparing(Book::getPublisher))
                .toArray(Book[]::new);
    }
}
