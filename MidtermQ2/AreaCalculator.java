package MidtermQ2;
import java.util.Scanner;

public class AreaCalculator 
{
        public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        boolean continueCalculation = true;

        System.out.println("Welcome to the Area Calculator");

        while (continueCalculation) 
        {
            System.out.print("\nCalculate area of a circle, square, or rectangle? (c/s/r): ");
            char shapeType = sc.next().toLowerCase().charAt(0);

            Shape shape = null;

            switch (shapeType) 
            {
                case 'c':
                    System.out.print("Enter radius: ");
                    double radius = sc.nextDouble();
                    shape = new Circle(radius);
                    break;

                case 's':
                    System.out.print("Enter width: ");
                    double width = sc.nextDouble();
                    shape = new Square(width);
                    break;

                case 'r':
                    System.out.print("Enter width: ");
                    double rectWidth = sc.nextDouble();
                    System.out.print("Enter height: ");
                    double rectHeight = sc.nextDouble();
                    shape = new Rectangle(rectWidth, rectHeight);
                    break;

                default:
                    System.out.println("Invalid shape type!");
                    continue;
            }

            System.out.println(shape);
            continueCalculation = getYesOrNo(sc, "Continue? (y/n): ");
        }

        System.out.println("\nGoodbye!");
        sc.close();
    }

    public static boolean getYesOrNo(Scanner sc, String prompt) 
    {
        while (true) 
        {
            System.out.print(prompt);
            String input = sc.next().trim().toLowerCase();
            if (input.equals("y")) 
            {
                return true;
            } 
            else if (input.equals("n"))
            {
                return false;
            } 
            else 
            {
                System.out.println("Error! Entry must be 'y' or 'n'. Try again.");
            }
        }
    }
}
