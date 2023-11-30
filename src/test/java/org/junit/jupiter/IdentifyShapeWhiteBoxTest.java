package org.junit.jupiter;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class IdentifyShapeWhiteBoxTest
{
    @Test
    public void testIdentifyTriangle()
    {
        assertEquals("Triangle", IdentifyShape.identifyShape(3));
    }

    @Test
    public void testIdentifySquare()
    {
        assertEquals("Square", IdentifyShape.identifyShape(4));
    }

    @Test
    public void testIdentifyPentagon()
    {
        assertEquals("Pentagon", IdentifyShape.identifyShape(5));
    }

    @Test
    public void testIdentifyHexagon()
    {
        assertEquals("Hexagon", IdentifyShape.identifyShape(6));
    }

    @Test
    public void testIdentifyHeptagon()
    {
        assertEquals("Heptagon", IdentifyShape.identifyShape(7));
    }

    @Test
    public void testIdentifyUnknownShapeNegative()
    {
        assertEquals("Unknown", IdentifyShape.identifyShape(8));
    }

    @Test
    public void testIdentifyUnknownShapeZero()
    {
        assertEquals("Unknown", IdentifyShape.identifyShape(0));
    }

}
