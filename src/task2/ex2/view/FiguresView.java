package task2.ex2.view;

import task2.ex2.model.entity.Shape;

public class FiguresView {

    public void printFigures(String message, Object[] figures) {
        System.out.println(message);
        if (!(figures.length == 0)) {
            for (Object figure : figures) {
                System.out.println(figure);
            }
        } else System.out.println(" no such book with " + message);
    }

    public void drawAllFigures(Shape[] figures){
        for (Shape figure : figures) {
            System.out.println(figure.getClass().getSimpleName() + ": " + figure.draw());
        }
    }

    public void printResult(String messege, double value){
        System.out.println(messege + Shape.df2.format(value));
    }

    public void printMessage(String message) {
        System.out.println(message);
    }
}
