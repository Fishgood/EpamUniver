package task2.ex2.model.entity;

public class Triangle extends Shape {
    private int a;
    private int b;
    private int c;

    public Triangle(String shapeColor, int a, int b, int c) {
        super(shapeColor);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calcArea() {
        int perimeter = a + b + c;
        return (2 * Math.sqrt(perimeter * (perimeter - a) * (perimeter - b) * (perimeter - c))) / a;
    }

    @Override
    public String draw() {
        return "Drawing triangle..";
    }

    @Override
    public String toString() {
        return super.toString() + "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", area=" + Shape.df2.format(this.calcArea()) +
                '}';
    }
}
