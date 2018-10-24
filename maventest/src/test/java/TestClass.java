import org.junit.Assert;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import task2.ex2.model.Figures;
import task2.ex2.model.entity.Circle;
import task2.ex2.model.entity.Rectangle;
import task2.ex2.model.entity.Triangle;

public class TestClass {

    private static final double DELTA = 1e-15;

    private Circle testCircle;
    private Rectangle testRectangle;
    private Triangle testTriangle;
    private Figures testFigures;


    @Before
    public void initialize() {
        testCircle = new Circle("Brown", 4);
        testRectangle = new Rectangle("White", 3, 4);
        testTriangle = new Triangle("Yellow", 5, 7, 8);
        testFigures = new Figures();
    }

    @Test
    public void testCircleArea() {
        assertEquals(50, Math.round(testCircle.calcArea()));
    }

    @Test
    public void testRectangleArea() {
        assertEquals(12, testRectangle.calcArea(), DELTA);
    }

    @Test
    public void testTriangleArea() {
        assertEquals(17, Math.round(testTriangle.calcArea()), DELTA);
    }
}
