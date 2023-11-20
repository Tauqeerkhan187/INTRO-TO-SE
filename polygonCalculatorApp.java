import java.util.Scanner;

public class polygonCalculatorApp
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        try 
        {
            //Identify Shape
            System.out.println("Please enter the number of sides for identification of the shape:");
            int sides = scanner.nextInt();
            String shape = ShapeIdentifier.identifyShape(sides);
            System.out.println("The shape is: " + shape);


            //calculatePerimeter
            System.out.println("Please enter the side length and number of sides for perimeter calculation:");
            double sideLength = scanner.nextdouble();
            int perimeterSides = scanner.nextInt();
            double perimeterSides = PerimeterCalculator.calculatePerimeter(sideLength, perimeterSides);
            System.out.println("The perimeter of the shape is: " + perimeter);
            
            //CalculateArea
            System.out.println("Enter the side length and number of sides for area calculation:");  
            double areaSideLength = scanner.nextdouble();
            int areaSides = scanner.nextInt();
            double area = AreaCalculator.calculateArea(areaSideLength, areaSides);
            System.out.println("The area of the given shape is: " + area);
            
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("Error: " + e.getMessage());
        }
        catch (Exception e)
        {
            System.out.println("An unexpected error occurred, Try again.");
        }
        finally 
        {
            scanner.close();
        }
    }
}


