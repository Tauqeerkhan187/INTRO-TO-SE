public class IdentifyShape
{
    public static String identifyShape(int sides)
    {
        switch (sides)
        {
            case 3: return "Triangle";
            case 4: return "Square";
            case 5: return "Pentagon";
            case 6: return "Hexagon";
            case 7: return "Heptagon";
            default: return "Unknown";
        }
    }
}
