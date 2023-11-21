import java.util.Scanner;

public class PolygonCalculatorApp
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        ShapeDisplayFrame frame = new ShapeDisplayFrame();

        try 
        {
            //Identify Shape
            System.out.println("Please enter the number of sides for identification of the shape:");
            int sides = scanner.nextInt();
            scanner.nextLine();
            String shape = IdentifyShape.identifyShape(sides); 
            System.out.println("The shape is: " + shape);
            
            // Display Shape Image
            System.out.println("Do you want to see an image of the shape? (Yes/No)");
            String response = scanner.nextLine();
            if ("yes".equalsIgnoreCase(response) && !"Unknown".equals(shape))
            {
                frame.displayShapeImage(shape);
            }

            // Calculate perimeter and area
            System.out.println("Please enter the side length for perimeter and area calculation:");
            double sideLength = scanner.nextDouble();
            scanner.nextLine();

            double perimeter = CalculatePerimeter.calculatePerimeter(sideLength, sides);
            System.out.println("The perimeter of the shape is: " + perimeter);
            
            double area = CalculateArea.calculateArea(sideLength, sides);
            System.out.println("The area of the shape is: " + area);

        }

        catch (IllegalArgumentException e)
        {
            System.out.println("Error: " + e.getMessage());
        }
        catch (Exception e)
        {
            System.out.println("An error occurred, Try again.");
        }
        finally 
        {
            scanner.close();
        }
    }
}            

            


