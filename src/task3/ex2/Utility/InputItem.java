package task3.ex2.Utility;

import task3.ex2.model.Entity.Item;
import task3.ex2.view.View;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Scanner;

public class InputItem {

    private static Scanner scanner = new Scanner(System.in);

    public static ArrayList<String> inputParameter(int paramNum, Field... paramName) {
        View.printMessage("Enter next params: ");
        String line = null;
        ArrayList<String> inputsArray = new ArrayList<>();
        Field[] temp = Item.class.getDeclaredFields();

        do {
            if (inputsArray.size() < 2) {
                View.printMessage("Enter " + temp[inputsArray.size()].getName());
            } else
                View.printMessage("Enter " + paramName[inputsArray.size() - 2].getName());


            line = scanner.next();
            inputsArray.add(line.trim());

        } while (inputsArray.size() != paramNum + 2);

        return inputsArray;
    }


}
