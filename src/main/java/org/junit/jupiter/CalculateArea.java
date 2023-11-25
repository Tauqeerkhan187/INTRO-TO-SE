package org.junit.jupiter;

public class CalculateArea
{
    public static double calculateArea(double sideLength, int numberOfSides)
    {   
        if (sideLength <= 0 || numberOfSides < 3)
        {
            throw new IllegalArgumentException("Side length and number of sides must be positive");
        }
        
        if (numberOfSides == 4)
        {
            return Math.pow(sideLength, 2);
        }
        else
        {
            return (numberOfSides * Math.pow(sideLength, 2)) / (4 * Math.tan(Math.PI / numberOfSides));
        }
    }
}
        
    
