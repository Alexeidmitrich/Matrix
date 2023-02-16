package core;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class TestLine {

    @Test
    public void lengthTest(){
        Point p = new Point();
        Point p1 = new Point(2, 0, 0);
        Line line = new Line(p, p1);
        Assert.assertEquals(2.0, line.length(), 0);
    }
}
