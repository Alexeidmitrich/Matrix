package core;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class TestPoint {

    @Test
    public void poinToStringTest(){
        Point p = new Point();
        Assert.assertEquals("(0.0, 0.0,0.0)", p.toString());
        Point p2 = new Point(3,5,-8);
        Assert.assertEquals("(3.0, 5.0,-8.0)", p2.toString());
    }

    @Test
    public void moveToPointTest(){
        Point p = new Point(2, 5 , 6);
        Point p1 = new Point(4,8,3);
        Assert.assertEquals("(2.0, 5.0,6.0)", p.toString());
        p.moveTo(p1);
        Assert.assertEquals("(4.0, 8.0,3.0)", p.toString());
        //chwck another method move
        p.moveTo(2,4,3);
        Assert.assertEquals("(2.0, 4.0,3.0)", p.toString());

    }

    @Test
    public void distanceTest(){
        Point p = new Point(1, 1 , 0);
        Point p1 = new Point();
        Assert.assertEquals(Math.sqrt(2.0) , p.distance(p1), 0);
    }

}
