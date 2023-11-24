package org.junit.jupiter;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class PolygonCalculatorAppWhiteBoxTests {

    @Test
    public void testIdentifyTriangle() {
        assertEquals("Triangle", IdentifyShape.identifyShape(3));
    }

    @Test
    public void testIdentifyNonTriangle() {
        assertEquals("Unknown", IdentifyShape.identifyShape(10));
    }

    @Test
    public void testPerimeterCalculationTriangle() {
        assertEquals(15.0, CalculatePerimeter.calculatePerimeter(5.0, 3), 0.001);
    }

    @Test
    public void testAreaCalculationTriangle() {
        assertEquals(10.825, CalculateArea.calculateArea(5.0, 3), 0.001);
    }

    @Test
    public void testAreaCalculationWithInvalidInput() {
        Executable executable = () -> CalculateArea.calculateArea(-1.0, 3);
        assertThrows(IllegalArgumentException.class, executable);
    }

    @Test
    public void testHandSizeComparisonWithinRange() {
        String result = PolygonCalculatorApp.compareAreaWithHandSize(80.0);
        assertEquals("The area is smaller than a child's hand size.", result);
    }

    @Test
    public void testHandSizeComparisonBelowRange() {
        String result = PolygonCalculatorApp.compareAreaWithHandSize(70.0);
        assertEquals("The area is smaller than a child's hand size.", result);
    }

    @Test
    public void testHandSizeComparisonAboveRange() {
        String result = PolygonCalculatorApp.compareAreaWithHandSize(95.0);
        assertEquals("The area is larger than a child's hand size.", result);
    }
}

