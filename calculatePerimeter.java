public class calculatePerimeter
{
    public static double calculatePerimeter(double sideLength, int sides)
    {
        if (sideLength <= 0 || sides < 3)
        {
            throw new IllegalArgumentException("Invalid Input: Enter a positive sideLength and side must be atleast 3.");
        }
        return sideLength * sides;
    }
}
