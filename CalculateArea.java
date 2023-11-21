public class calculateArea
{
    public static double calculateArea(double sideLength, int numberOfSides)
    {
        if (numberOfSides == 4)
        { 
            return Math.pow(sideLength, 2);
        }
        return (numberOfSides * Math.pow(sideLength, 2)) / (4 * Math.tan(Math.PI / numberOfSides));
    }
}
        
    
