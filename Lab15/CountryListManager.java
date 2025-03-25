package Lab15;

import java.util.ArrayList;
import java.util.Scanner;

public class CountryListManager 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        CountryIO countryIO = new CountryIO();
        ArrayList<String> countries = countryIO.getCountries();

        while (true) 
        {
            System.out.println("\nCountry List Manager");
            System.out.println("COMMAND MENU");
            System.out.println("1 - List countries");
            System.out.println("2 - Add a country");
            System.out.println("3 - Exit");
            System.out.print("Enter menu number: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice)
            {
                case 1:
                    System.out.println("\nCountries:");
                    for (String country : countries) 
                    {
                        System.out.println(country);
                    }
                    break;

                case 2:
                    System.out.print("\nEnter country: ");
                    String newCountry = scanner.nextLine();
                    countries.add(newCountry);
                    if (countryIO.saveCountries(countries)) 
                    {
                        System.out.println("This country has been saved.");
                    }
                    break;

                case 3:
                    System.out.println("\nGoodbye.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
            }
        }
    }
}

