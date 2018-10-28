package task2.ex1.controller;

import task2.ex1.Untility.InputUtility;
import task2.ex1.model.Books;
import task2.ex1.model.Data;
import task2.ex1.view.BooksView;

public class Controller {

    private Books model = new Books();
    private BooksView view = new BooksView();
    private InputUtility inputUtility = new InputUtility();

    public void run() {
        model.setBooks(Data.getBooks());

        while (true) {
            BooksView.printMessage(BooksView.MAIN_MENU);
            switch (inputUtility.inputIntBetween(5)) {
                case 1:
                    view.printBooks(BooksView.ALL_BOOKS, model.getBooks());
                    break;
                case 2:
                    view.printBooks("List by author: \n", model.getByAuthor(inputUtility.inputStringValue()));
                    break;
                case 3:
                    view.printBooks("List by publisher: \n", model.getByPublisher(inputUtility.inputStringValue()));
                    break;
                case 4:
                    view.printBooks("List after some: \n", model.getByYear(inputUtility.inputInt()));
                    break;
                case 5:
                    model.sortByPublisher();
                    view.printBooks("Sorted list: \n", model.getBooks());
                    break;
                case 0:
                    System.exit(0);
                default:
                    BooksView.printMessage(BooksView.WRONG_INPUT);
            }
        }
    }


}
