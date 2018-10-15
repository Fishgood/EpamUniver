package com.company.task1.ex1;

public class Main {

    public static void main(String[] args) {
        // write your code here

        View view = new View();
        Model model = new Model();
        Controller controller = new Controller(model, view);

        controller.calculate();

    }
}
