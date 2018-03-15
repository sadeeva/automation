package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Point11Tests {


    @Test
    public void testDistance(){
        Point p = new Point(3,6,-4,0);
        Assert.assertEquals(p.distance(), 5.0);


    }
}
