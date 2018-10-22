package com.company.task1.ex3;

class PyramidView {
    final String INPUT_INT_DATA =
            "Enter height of pyramid (1 to 9) = ";
    final String WRONG_INPUT_INT_DATA =
            "Wrong input! Repeat please! ";
    final String OUR_INT = "Result = ";

    void printMessage(String message) {
        System.out.print(message);
    }

    void printMessageAndResult(String message, String value) {
        System.out.println(message + value);
    }
}
