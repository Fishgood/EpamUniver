package com.company.day2.ex1;

public class Main {

    public static void main(String[] args) {
        // write your code here

        BinaryView view = new BinaryView();
        BinaryModel model = new BinaryModel();
        BinaryController controller = new BinaryController(model, view);

        controller.calculate();

    }
}
