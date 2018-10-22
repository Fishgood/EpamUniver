package task3.ex2.Utility;

import task3.ex2.view.View;

import java.util.Scanner;

public class InputUtility<T> {

    private static Scanner scanner = new Scanner(System.in);

    public static String strValInp(String message) {
        View.printMessage(message);
        String value;
        while (true) {
            value = scanner.next();
            if (value.length() == 0) {
                View.printMessage(View.WRONG_INPUT);
            } else
                break;
        }
        return value;
    }







}

