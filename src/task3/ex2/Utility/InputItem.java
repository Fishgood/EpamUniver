package task3.ex2.Utility;

import task3.ex2.model.Entity.Item;
import task3.ex2.view.View;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Scanner;

public class InputItem {

    private static Scanner scanner = new Scanner(System.in);

    public static ArrayList<String> inputParameter(Object fields) {
        View.printMessage("Enter next params: ");
        String line = null;
        ArrayList<String> inputsArray = new ArrayList<>();
        Field[] superClass = fields.getClass().getSuperclass().getDeclaredFields();
        Field[] subClass = fields.getClass().getDeclaredFields();
        //Field[] temp = Item.class.getDeclaredFields();

        do {
            if (inputsArray.size() < 2) {
                View.printMessage("Enter " + superClass[inputsArray.size()].getName());
            } else
                View.printMessage("Enter " + subClass[inputsArray.size() - 2].getName());

            line = scanner.next();
            inputsArray.add(line.trim());

        } while (inputsArray.size() != (superClass.length + subClass.length));

        return inputsArray;
    }


}
