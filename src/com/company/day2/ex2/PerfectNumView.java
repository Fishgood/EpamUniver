package com.company.day2.ex2;

class PerfectNumView {
    final String INPUT_INT_DATA =
            "Enter an integer = ";
    final String WRONG_INPUT_INT_DATA =
            "Wrong input! Repeat please! ";
    final String OUR_INT = "Result = ";

    void printMessage(String message) {
        System.out.print(message);
    }

    void printMessageAndResult(String message, int value) {
        System.out.println(message + value);
    }
}
