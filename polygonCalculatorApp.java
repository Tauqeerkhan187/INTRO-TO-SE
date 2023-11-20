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
            String shape = identifyShape.identifyShape(sides);
            System.out.println("The shape is: " + shape);


            //calculatePerimeter
            System.out.println("Please enter the side length and number of sides for perimeter calculation:");
            double sideLength = scanner.nextDouble();
            int perimeterSides = scanner.nextInt();
            double perimeter = calculatePerimeter.calculatePerimeter(sideLength, perimeterSides);
            System.out.println("The perimeter of the shape is: " + perimeter);
            
            //CalculateArea
            System.out.println("Enter the side length and number of sides for area calculation:");  
            double areaSideLength = scanner.nextDouble();
            int areaSides = scanner.nextInt();
            double area = calculateArea.calculateArea(areaSideLength, areaSides);
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


