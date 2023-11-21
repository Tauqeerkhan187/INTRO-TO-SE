public class CalculatePerimeter
{
    public static double calculatePerimeter(double sideLength, int numberOfSides)
    {
        if (sideLength <= 0 || numberOfSides < 3)
        {
            throw new IllegalArgumentException("Invalid Input: Enter a positive sideLength and numberOfSide must be atleast 3.");
        }
        return sideLength * numberOfSides;
    }
}
