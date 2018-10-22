package com.company.task1.ex2;

class PerfectNumView {
    final String INPUT_INT_DATA =
            "Enter an integer = ";
    final String WRONG_INPUT_INT_DATA =
            "Wrong input! Repeat please! ";
    final String OUR_INT = "Result = ";

    void printMessage(String message) {
        System.out.print(message);
    }

    void printMessageAndResult(String message, int[] value) {

        System.out.print(message);

        for (int i = 0; i < value.length - 1; i++) {
            if (value[i] == 0)
                break;
            System.out.print(value[i] + " ");
        }
    }
}
