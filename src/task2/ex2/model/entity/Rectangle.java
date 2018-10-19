package task2.ex2.model.entity;

public class Rectangle extends Shape{
    private int a;
    private int b;

    public Rectangle(String shapeColor, int a, int b) {
        super(shapeColor);
        this.a = a;
        this.b = b;
    }

    @Override
    public double calcArea() {
        return a * b;
    }

    @Override
    public String draw() {
        return "Drawing rectangle..";
    }

    @Override
    public String toString() {
        return super.toString() + "Rectangle{" +
                "a=" + a +
                ", b=" + b +
                ", area=" + Shape.df2.format(this.calcArea()) +
                '}';
    }
}
