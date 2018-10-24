package task2.ex2.model;

import task2.ex2.model.entity.Circle;
import task2.ex2.model.entity.Rectangle;
import task2.ex2.model.entity.Shape;
import task2.ex2.model.entity.Triangle;

public class Data {

    public static Shape[] getFigures() {
        return new Shape[]{
                new Rectangle("red", 2, 5),
                new Rectangle("yellow", 5, 6),
                new Triangle("pink", 3, 4, 5),
                new Triangle("green", 5, 12, 13),
                new Circle("blue", 7),
                new Circle("brown", 4)
        };
    }
}
