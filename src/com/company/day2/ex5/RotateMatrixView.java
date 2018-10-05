package com.company.day2.ex5;

class RotateMatrixView {
    final String INPUT_INT_DATA =
            "Enter size of matrix = ";
    final String WRONG_INPUT_INT_DATA =
            "Wrong input! Repeat please! ";
    final String OUR_INT = "Result = \n";

    void printMessage(String message) {
        System.out.print(message);
    }

    void printMessageAndResult(String message, String value) {
        System.out.println(message + value);
    }
}
