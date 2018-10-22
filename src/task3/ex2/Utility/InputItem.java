package task3.ex2.Utility;

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

        do {
            View.printMessage("Enter " + paramName[inputsArray.size()]);
            if (line != null) {
                View.printMessage("empty");
            } else {
                line = scanner.nextLine();
                inputsArray.add(line.trim());
            }
        } while (inputsArray.size() == paramNum);

        return inputsArray;
    }


}
