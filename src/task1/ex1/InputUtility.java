package task1.ex1;

import java.util.Scanner;

class InputUtility {
    private static Scanner sc = new Scanner(System.in);

    static int inputOptionOfCalculating(View view, int option) {
        view.printMessage(view.CHOICE_RES_DATA);
        while (!sc.hasNextInt()) {
            view.printMessage(view.WRONG_INPUT_INT_DATA +
                    view.CHOICE_RES_DATA);
            sc.next();
        }
        return sc.nextInt();
    }

    static int inputIntValueWithScanner(View view) {
        view.printMessage(view.INPUT_INT_DATA);
        while (!sc.hasNextInt()) {
            view.printMessage(view.WRONG_INPUT_INT_DATA +
                    view.INPUT_INT_DATA);

            sc.next();
        }
        return sc.nextInt();
    }
}
