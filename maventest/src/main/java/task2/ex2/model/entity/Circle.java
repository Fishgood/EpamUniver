package task2.ex2.model.entity;

public class Circle extends Shape {
    private int radius;

    public Circle(String shapeColor, int radius) {
        super(shapeColor);
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String draw() {
        return "Drawing circle..";
    }

    @Override
    public String toString() {
        return super.toString() + "Circle{" +
                "radius=" + radius +
                ", area=" + Shape.df2.format(this.calcArea()) +
                '}';
    }
}
