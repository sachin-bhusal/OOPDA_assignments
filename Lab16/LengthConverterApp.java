package Lab16;

import java.util.*;

public class LengthConverterApp 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Conversion> conversions = ConversionFileHandler.getConversions();
        
        while (true) 
        {
            System.out.println("\nLength Converter");
            System.out.println("1 - Convert a length");
            System.out.println("2 - Add a type of conversion");
            System.out.println("3 - Delete a type of conversion");
            System.out.println("4 - Exit");
            System.out.print("Enter menu number: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            switch (choice)
            {
                case 1:
                    if (conversions.isEmpty()) 
                    {
                        System.out.println("No conversions available.");
                        break;
                    }
                    for (int i = 0; i < conversions.size(); i++) 
                    {
                        System.out.println((i + 1) + " - " + conversions.get(i));
                    }
                    System.out.print("Enter conversion number: ");
                    int convIndex = scanner.nextInt() - 1;
                    if (convIndex >= 0 && convIndex < conversions.size()) 
                    {
                        System.out.print("Enter " + conversions.get(convIndex).getFromUnit() + ": ");
                        double value = scanner.nextDouble();
                        System.out.println(value + " " + conversions.get(convIndex).getFromUnit() + " = " + 
                                conversions.get(convIndex).convert(value) + " " + conversions.get(convIndex).getToUnit());
                    } 
                    else 
                    {
                        System.out.println("Invalid choice.");
                    }
                    break;
                
                case 2:
                    System.out.print("Enter 'From' unit: ");
                    String fromUnit = scanner.nextLine();
                    System.out.print("Enter 'To' unit: ");
                    String toUnit = scanner.nextLine();
                    System.out.print("Enter the conversion ratio: ");
                    double ratio = scanner.nextDouble();
                    conversions.add(new Conversion(fromUnit, toUnit, ratio));
                    ConversionFileHandler.saveConversions(conversions);
                    System.out.println("Conversion added successfully.");
                    break;
                
                case 3:
                    for (int i = 0; i < conversions.size(); i++) 
                    {
                        System.out.println((i + 1) + " - " + conversions.get(i));
                    }
                    System.out.print("Enter conversion number to delete: ");
                    int delIndex = scanner.nextInt() - 1;
                    if (delIndex >= 0 && delIndex < conversions.size()) 
                    {
                        conversions.remove(delIndex);
                        ConversionFileHandler.saveConversions(conversions);
                        System.out.println("Conversion deleted successfully.");
                    } 
                    else 
                    {
                        System.out.println("Invalid choice.");
                    }
                    break;
                
                case 4:
                    System.out.println("Goodbye.");
                    scanner.close();
                    return;
                
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}