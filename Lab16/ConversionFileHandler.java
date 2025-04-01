package Lab16;

import java.io.*;
import java.util.*;

public class ConversionFileHandler 
{
    private static final String FILE_NAME = "conversion_types.txt";

    public static ArrayList<Conversion> getConversions() 
    {
        ArrayList<Conversion> conversions = new ArrayList<>();
        File file = new File(FILE_NAME);
        if (!file.exists()) return conversions;
        
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(file))) 
        {
            conversions = (ArrayList<Conversion>) in.readObject();
        } 
        catch (IOException | ClassNotFoundException e) 
        {
            System.out.println("Error reading conversion file: " + e.getMessage());
        }
        return conversions;
    }

    public static boolean saveConversions(ArrayList<Conversion> conversions)
    {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) 
        {
            out.writeObject(conversions);
            return true;
        } 
        catch (IOException e) 
        {
            System.out.println("Error saving conversion file: " + e.getMessage());
            return false;
        }
    }
}
