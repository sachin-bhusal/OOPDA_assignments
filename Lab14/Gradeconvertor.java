package Lab14;
import java.util.Scanner;

public class Gradeconvertor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Letter Grade Converter");

        while (true) 
        {
            int numberGrade;

            while (true) 
            {
                System.out.print("Enter numerical grade: ");
                if (scanner.hasNextInt()) {
                    numberGrade = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    if (numberGrade >= 0 && numberGrade <= 100) 
                    {
                        break;
                    } 
                    else 
                    {
                        System.out.println("Error! Invalid integer. Try again.");
                    }
                } 
                else 
                {
                    System.out.println("Error! Invalid integer. Try again.");
                    scanner.nextLine();
                }
            }

            Grade grade = new Grade(numberGrade);
            System.out.println("Letter grade: " + grade.getLetter());

            String choice;
            while (true) {
                System.out.print("Continue? (y/n): ");
                choice = scanner.nextLine().trim().toLowerCase();
                if (choice.equals("y") || choice.equals("n")) 
                {
                    break;
                } 
                else 
                {
                    System.out.println("Error! Entry must be 'y' or 'n'. Try again.");
                }
            }

            if (choice.equals("n")) 
            {
                break;
            }
        }

        scanner.close();
        System.out.println("Goodbye!");
    }
}
