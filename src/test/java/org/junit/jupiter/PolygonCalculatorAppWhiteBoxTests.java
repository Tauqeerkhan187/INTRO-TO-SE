package org.junit.jupiter;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class PolygonCalculatorAppWhiteBoxTests 
{

    @Test
    public void testIdentifyTriangle() 
    {
        assertEquals("Triangle", IdentifyShape.identifyShape(3));
    }

    @Test
    public void testIdentifyNonTriangle() 
    {
        assertEquals("Unknown", IdentifyShape.identifyShape(10));
    }

    @Test
    public void testPerimeterCalculationTriangle() 
    {
        assertEquals(15.0, CalculatePerimeter.calculatePerimeter(5.0, 3), 0.001);
    }

    @Test
    public void testAreaCalculationTriangle() 
    {
        double sideLength = 5.0;
        double expectedArea = (Math.sqrt(3) / 4) * Math.pow(sideLength, 2);
        assertEquals(expectedArea, CalculateArea.calculateArea(sideLength,3), 0.001);
    }

    @Test
    public void testAreaCalculationWithInvalidInput() 
    {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> 
        {
            CalculateArea.calculateArea(-1.0, 3);
        });
        
        assertNotNull(exception);
    }

    @Test
    public void testHandSizeComparisonWithinRange() 
    {
        double area = 80.0; //assuming this is within the range of a child's hand
        String expectedMessage = "The area is close to the size of a child's hand.";
        assertEquals(expectedMessage, PolygonCalculatorApp.compareAreaWithHandSize(area));

    }

    @Test
    public void testHandSizeComparisonBelowRange() 
    {
        String result = PolygonCalculatorApp.compareAreaWithHandSize(70.0);
        assertEquals("The area is smaller than a child's hand size.", result);
    }

    @Test
    public void testHandSizeComparisonAboveRange() 
    {
        String result = PolygonCalculatorApp.compareAreaWithHandSize(95.0);
        assertEquals("The area is larger than a child's hand size.", result);
    }
}

