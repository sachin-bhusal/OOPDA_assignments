package Lab15;

import java.io.*;
import java.util.ArrayList;

public class CountryIO 
{
    private static final String FILE_NAME = "countries.txt";

    public ArrayList<String> getCountries()
    {
        ArrayList<String> countries = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) 
        {
            String line;
            while ((line = reader.readLine()) != null) 
            {
                countries.add(line);
            }
        } 
        catch (FileNotFoundException e) 
        {
            System.out.println("No country list found. Creating a new one.");
        } 
        catch (IOException e) 
        {
            System.out.println("Error reading from file.");
            e.printStackTrace();
        }
        return countries;
    }

    // Save the list of countries to the file
    public boolean saveCountries(ArrayList<String> countries) 
    {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) 
        {
            for (String country : countries) 
            {
                writer.write(country);
                writer.newLine();
            }
            return true;
        } 
        catch (IOException e) 
        {
            System.out.println("Error writing to file.");
            e.printStackTrace();
            return false;
        }
    }
}
