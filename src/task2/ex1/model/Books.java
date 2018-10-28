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
        /*Book[] temp = new Book[books.length];

        int counter = 0;
        for (Book book : books) {
            if (book.getAuthor().equals(author))
                temp[counter++] = book;
        }

        return Arrays.copyOf(temp, counter);*/
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
        /*Book[] temp = new Book[books.length];

        int counter = 0;
        for (Book book : books){
            if (book.getYear() > year){
                temp[counter++] = book;
            }
        }

        return Arrays.copyOf(temp, counter);*/
    }

    public void sortByPublisher(){
        books = (Book[]) Arrays.stream(books)
                .sorted(Comparator.comparing(Book::getPublisher))
                .toArray();
        /*Book[] temp = Arrays.copyOf(books, books.length);
        Arrays.sort(temp, Comparator.comparing(Book::getPublisher));*/
        //return temp;
    }



}
