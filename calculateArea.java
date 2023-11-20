public class calculateArea
{
    public static double calculateArea(double sideLength, int numberOfSides)
    {
        if (sideLength <= 0 || numberOfSides < 3)
        {
            throw new IllegalArgumentException("Invalid input : Enter positive sideLength and numberOfsides must be atleast 3.");
        }
    
        double apothem = sideLength / (2 * Math.tan(Math.PI / numberOfSides));
        double perimeter = calculatePerimeter.calculatePerimeter(sideLength, numberOfSides);
        return (perimeter * apothem) / 2;
    }
}
    
