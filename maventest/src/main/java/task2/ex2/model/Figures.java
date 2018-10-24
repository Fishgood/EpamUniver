package task2.ex2.model;

import task2.ex2.model.entity.Shape;

import java.util.Arrays;
import java.util.Comparator;

public class Figures {
    private Shape[] shapes;

    public Shape[] getShapes() {
        return shapes;
    }

    public void setShapes(Shape[] shapes) {
        this.shapes = shapes;
    }

    public double getTotalArea() {
        return Arrays.stream(shapes)
                .map(Shape::calcArea)
                .reduce(0.0, Double::sum);
    }

    public double getTotalAreaOfCertainFigure(String figureType){
        return Arrays.stream(shapes)
                .filter(x -> x.getClass().getSimpleName().equals(figureType))
                .map(Shape::calcArea)
                .reduce(0.0, Double::sum);
    }

    public Object[] getSortedFiguresListByArea(){
        return  Arrays.stream(shapes)
                .sorted(Comparator.comparing(Shape::calcArea))
                .toArray();
    }

    public Object[] getSortedFiguresListByColour(){
        return Arrays.stream(shapes)
                .sorted(Comparator.comparing(Shape::calcArea))
                .toArray();
    }
}
