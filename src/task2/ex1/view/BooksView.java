package task2.ex1.view;

import task2.ex1.model.entity.Book;

import java.util.Arrays;

public class BooksView  implements Information{

    public void printBooks(String message, Book[] books) {
        printMessage(message);
        if (!(books.length == 0)) {
            Arrays.stream(books)
                    .forEach(System.out::println);
        } else printMessage(" no such book with " + message);
    }

    public static void printMessage(String message) {
        System.out.println(message);
    }
}
