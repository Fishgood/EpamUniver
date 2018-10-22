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
        Book[] temp = new Book[books.length];

        int counter = 0;
        for (Book book : books) {
            if (book.getAuthor().equals(author))
                temp[counter++] = book;
        }

        return Arrays.copyOf(temp, counter);
    }

    public Book[] getByPublisher(String publisher){
        Book[] temp = new Book[books.length];

        int counter = 0;
        for (Book book : books) {
            if (book.getPublisher().equals(publisher))
                temp[counter++] = book;
        }

        return Arrays.copyOf(temp, counter);
    }

    public Book[] getByYear(int year){
        Book[] temp = new Book[books.length];

        int counter = 0;
        for (Book book : books){
            if (book.getYear() > year){
                temp[counter++] = book;
            }
        }

        return Arrays.copyOf(temp, counter);
    }

    public Book[] sortByPublisher(){
        Book[] temp = Arrays.copyOf(books, books.length);
        Arrays.sort(temp, Comparator.comparing(Book::getPublisher));
        return temp;
    }



}
