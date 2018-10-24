package task5.ex1.Utility;

import java.util.Scanner;

public class InputUtility {

    private static Scanner scanner = new Scanner(System.in);

    public String inputStringValue() {
        String value = scanner.nextLine();
        return value;
    }

    public int inputIntValue() {
        int value = scanner.nextInt();
        return value;
    }

    public String checkExit(){
        String value = scanner.next();
        return value;
    }
}
