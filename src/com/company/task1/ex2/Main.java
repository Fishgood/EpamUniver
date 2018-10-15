package com.company.task1.ex2;

public class Main {

    public static void main(String[] args) {
        // write your code here

        PerfectNumView view = new PerfectNumView();
        PerfectNumModel model = new PerfectNumModel();
        PerfectNumController controller = new PerfectNumController(model, view);

        controller.calculate();

    }
}
