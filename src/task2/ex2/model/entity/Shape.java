package task2.ex2.model.entity;

import java.text.DecimalFormat;

public abstract class Shape implements Drawable {
    private String shapeColor;

    Shape(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    public static DecimalFormat df2 = new DecimalFormat(".###");

    public String getShapeColor() {
        return shapeColor;
    }

    public abstract double calcArea();

    @Override
    public String toString() {
        return "Shape{" +
                "shapeColor='" + shapeColor + '\'' +
                '}';
    }
}
