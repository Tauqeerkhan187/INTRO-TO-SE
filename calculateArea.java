public class calculateArea
{
    public static double calculateArea(double sideLength, int sides)
    {
        if (sideLength <= 0 || sides < 3)
        {
            throw new IllegalArgumentException("Invalid input : Enter positive sideLength and sides must be atleast 3.");
        }
     
        double perimeter = CalculatePerimeter.calculatePerimeter(sideLength, sides);

        double apothem = sideLength / (2 * Math.tan(Math.PI / sides));  
        return (perimeter * apothem) / 2;
    }
}
    
