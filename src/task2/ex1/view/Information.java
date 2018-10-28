package task2.ex1.view;

public interface Information {
    String MAIN_MENU = "\nMain menu (select option):\n" +
            "1 show all books;\n" +
            "2 show books by author: \n" +
            "3 show books by publisher :\n" +
            "4 show books after year: \n" +
            "5 sort books by publisher: \n" +
            "0 exit program.";

    String WRONG_INPUT = "Wrong input. Repeat please.\n";

    String INPUT_VALUE = "\nEnter value: \n";

    String ALL_BOOKS = "All books: \n";
}
