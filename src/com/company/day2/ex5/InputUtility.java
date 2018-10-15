package com.company.day2.ex5;

import java.util.Scanner;

class InputUtility {
    private static Scanner sc = new Scanner(System.in);

    static int inputIntValueWithScanner(RotateMatrixView view) {

        view.printMessage(view.INPUT_INT_DATA);
        while (!sc.hasNextInt()) {
            view.printMessage(view.WRONG_INPUT_INT_DATA +
                    view.INPUT_INT_DATA);

            sc.next();
        }
        return sc.nextInt();
    }
}
