package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {


    @Test
    public void testDistance(){
        Point p = new Point(3,6,-4,0);
        Assert.assertEquals(p.distance(), 5.0);


    }
}
