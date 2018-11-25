package task1.ex1;

class View {
    final String CHOICE_RES_DATA =
            "Enter option to choose Binary(1), Octal(2), Hexadecimal(3) calculating: ";
    final String INPUT_INT_DATA =
            "Enter an integer: ";
    final String WRONG_INPUT_INT_DATA =
            "Wrong input! Repeat please! ";
    final String OUR_INT = "Result: ";

    void printMessage(String message) {
        System.out.print(message);
    }

    void printMessageAndResult(String message, String value) {
        System.out.println(message + value);
    }
}
