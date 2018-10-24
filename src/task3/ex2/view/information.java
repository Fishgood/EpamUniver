package task3.ex2.view;

public interface Information {
    String MAIN_MENU = "\nMain menu (select option):\n" +
            "1 show all departments;\n" +
            "2 sort departments;\n" +
            "3 select department;\n" +
            "4 create department;\n" +
            "5 delete department;\n" +
            "0 exit program.";

    String DEPARTMENT_MENU = "department MENU (select option):\n" +
            "1 show items in department;\n" +
            "2 sort items by name;\n" +
            "3 sort items by price;\n" +
            "4 add item;\n" +
            "5 remove item;\n" +
            "0 back to main menu.";

    String WRONG_INPUT = "Wrong input. Repeat please.\n";
}
