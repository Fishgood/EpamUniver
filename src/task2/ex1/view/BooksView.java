package task2.ex1.view;

import task2.ex1.model.entity.Book;

public class BooksView {

    public void printBooks(String message, Book[] books) {
        System.out.println(message);
        if (!(books.length == 0)) {
            for (Book book : books) {
                System.out.println(book);
            }
        } else System.out.println(" no such book with " + message);
    }

    public void printMessage(String message) {
        System.out.println(message);
    }
}
