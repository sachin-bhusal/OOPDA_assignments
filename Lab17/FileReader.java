package Lab17;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        while (true) 
        {
            System.out.print("Enter a path to a file: ");
            String filePath = input.nextLine();
            
            File file = new File(filePath);
            
            if (file.exists() && file.isFile()) 
            {
                System.out.println("\nFile contents:\n");
                try (Scanner fileScanner = new Scanner(file)) 
                {
                    while (fileScanner.hasNextLine()) 
                    {
                        System.out.println(fileScanner.nextLine());
                    }
                } 
                catch (FileNotFoundException e) 
                {
                    System.out.println("Error reading the file.");
                }
            } 
            else 
            {
                System.out.println("File does not exist. Please check the path and try again.");
            }

            System.out.print("\nContinue? (y/n): ");
            String choice = input.nextLine().trim().toLowerCase();
            if (choice.equals("n")) 
            {
                System.out.println("Exiting program...");
                break;
            }
        }
        
        input.close();
    }
}

