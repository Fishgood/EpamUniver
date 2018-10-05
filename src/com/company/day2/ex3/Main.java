package com.company.day2.ex3;

public class Main {

    public static void main(String[] args) {
        // write your code here

        PyramidView view = new PyramidView();
        PyramidModel model = new PyramidModel();
        PyramidController controller = new PyramidController(model, view);

        controller.calculate();

    }
}
