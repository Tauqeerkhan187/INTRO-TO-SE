public class calculatePerimeter
{
    public static double calculatePerimeter(double sideLength, int numberOfSides)
    {
        if (sideLength <= 0 || numberOfsides < 3)
        {
            throw new IllegalArgumentException("Invalid Input: Enter a positive sideLength and numberOfSide must be atleast 3.");
        }
        return sideLength * numberOfSides;
    }
}
