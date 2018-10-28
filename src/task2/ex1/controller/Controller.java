package task2.ex1.controller;

import task2.ex1.model.Books;
import task2.ex1.model.Data;
import task2.ex1.view.BooksView;

public class Controller {

    private Books model = new Books();
    private BooksView view = new BooksView();

    public void run() {
        model.setBooks(Data.getBooks());
        view.printBooks("All books: ", model.getBooks());
        view.printBooks("Get books by author - Celia Rees: ", model.getByAuthor("Celia Rees"));
        view.printBooks("Get books by publisher - Ebook: ", model.getByPublisher("Ebook"));
        view.printBooks("Get books after 2004: ", model.getByYear(2004));
        model.sortByPublisher();
        view.printBooks("Get filtered books by publisher: ",model.getBooks());
    }


}
