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
        return (Book[]) Arrays.stream(books)
                .filter(book -> book.getAuthor().equals(author))
                .toArray();
    }

    public Book[] getByPublisher(String publisher){
        return (Book[]) Arrays.stream(books)
                .filter(book -> book.getPublisher().equals(publisher))
                .toArray();
    }

    public Book[] getByYear(int year){
        return (Book[]) Arrays.stream(books)
                .filter(book -> book.getYear() >= year)
                .toArray();
    }

    public void sortByPublisher(){
        books = (Book[]) Arrays.stream(books)
                .sorted(Comparator.comparing(Book::getPublisher))
                .toArray();
    }
}
