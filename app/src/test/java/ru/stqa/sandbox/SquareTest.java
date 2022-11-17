package ru.stqa.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SquareTest {

    @Test
    public void testSquareArea() {
        Square s = new Square(5);
        Assert.assertEquals(s.area(), 25.0);
    }

    @Test
    public void testRectandleArea() {
        Rectangle r = new Rectangle(5, 5);
        Assert.assertEquals(r.area(), 25);
    }

    @Test
    public void testPointDistance() {
        Point p1 = new Point(2,2);
        Point p2 = new Point(4, 4);

        Assert.assertEquals(Point.distance(p1, p2), 2.8284271247461903);
    }

    @Test
    public void testPointDistanceNegativ() {
        Point p1 = new Point(2,2);
        Point p2 = new Point(4, 4);

        Assert.assertNotEquals(Point.distance(p1, p2), 3);
    }
}
