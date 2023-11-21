public class calculateArea
{
    public static double calculateArea(double sideLength, int sides)
    {
        switch (sides)
        {
            case 3: //Triangle
                return (Math.sqrt(3) / 4) * sideLength * sideLength;
            break;

            case 4: // Square
                area = Math.pow(sideLength, 2);
            break;

            case 5: // Pentagon
            case 6: // Hexagon
            case 7: // Heptagon
                area = (sides * Math.pow(sideLength, 2)) / (4 * Math.tan(Math.PI / sides));
                break;
            default: 
                throw new IllegalArgumentException("Invalid number of sides");

        }
        return area;
    }
                            
}
    
