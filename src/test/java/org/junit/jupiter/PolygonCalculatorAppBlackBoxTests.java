package org.junit.jupiter;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PolygonCalculatorAppBlackBoxTests
{
    @Test
    public void testIdentifyTriangle()
    {
        assertEquals("Triangle", IdentifyShape.identifyShape(3));
    }

    @Test
    public void testPerimeterCalculation()
    {
        assertEquals(15.0, CalculatePerimeter.calculatePerimeter(5.0, 3), 0.001);
    }

    @Test
    public void testAreaCalculation()
    {
        assertEquals(10.825, CalculateArea.calculateArea(5.0, 3), 0.001);
    }

    @Test
    public void testHandSizeComparisonWithinRange()
    {
        String result = PolygonCalculatorApp.compareAreaWithHandSize(80);
        assertEquals("The area is close to the size of a child's hand.", result);
    }

    @Test
    public void testHandSizeComparisonBelowRange()
    {
        String result = PolygonCalculatorApp.compareAreaWithHandSize(70.0);
        assertEquals("The area is smaller than a child's hand size.", result);
    }

    @Test
    public void testHandsizeComparisonAboveRange()
    {
        String result = PolygonCalculatorApp.compareAreaWithHandSize(91.0);
        assertEquals("The area is larger than a child's hand size.", result);
    }
}

