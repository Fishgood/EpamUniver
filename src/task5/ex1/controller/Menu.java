package task5.ex1.controller;

import task5.ex1.Utility.InputUtility;
import task5.ex1.model.Entity.Student;
import task5.ex1.model.Journal;
import task5.ex1.view.View;

import java.util.ArrayList;

public class Menu {

    private Journal model = new Journal();
    private View view = new View();
    private InputUtility inputUtility = new InputUtility();
    private RegularExpressionCheck regCheck = new RegularExpressionCheck();

    public void menu() {
        while (true){
            view.printMessage(View.MENU);
            switch (inputUtility.inputIntValue()) {
                case 1:
                    view.printStudents(model.getStudent());
                    break;
                case 2:
                    do {
                        add(model);
                        view.printMessage("Want to add more(y/n)? ");
                    }while (!inputUtility.checkExit().equals("n"));
                    break;
                case 0:
                    System.exit(0);
                default:
                    view.printMessage(View.WRONG_INPUT);
            }


        }
    }

    public void add(Journal model) {
        String[] params = new String[5];
        boolean check;
        int index = 0;
        inputUtility.inputStringValue();
        do {
            view.printParam(index);
            params[index] = inputUtility.inputStringValue();
            check = regCheck.checkAll(params[index], index);
            if (check)
                index++;
            else view.printMessage(View.WRONG_INPUT);
        } while (index < 5);
        model.addStudent(params);
    }
}
