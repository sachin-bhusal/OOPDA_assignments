package MidtermQ3;

import java.util.ArrayList;
import java.util.Scanner;

public class WizardInventory 
{
    private static final int MAX_ITEMS = 4;

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> inventory = new ArrayList<>();
                    
        inventory.add("wooden staff");
        inventory.add("wizard hat");
        inventory.add("cloth shoes");

        System.out.println("The Wizard Inventory game");
        System.out.println("\nCOMMAND MENU");
        System.out.println("show - Show all items");
        System.out.println("grab - Grab an item");
        System.out.println("edit - Edit an item");
        System.out.println("drop - Drop an item");
        System.out.println("exit - Exit program");

        while (true) 
        {
            System.out.print("\nCommand: ");
            String command = sc.nextLine().trim().toLowerCase();

            switch (command) 
            {
                case "show":
                    showItems(inventory);
                    break;

                case "grab":
                    grabItem(inventory, sc);
                    break;

                case "edit":
                    editItem(inventory, sc);
                    break;

                case "drop":
                    dropItem(inventory, sc);
                    break;

                case "exit":
                    System.out.println("Bye!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid command! Try again.");
            }
        }
    }

    private static void showItems(ArrayList<String> inventory) 
    {
        if (inventory.isEmpty()) 
        {
            System.out.println("Inventory is empty.");
        } 
        else 
        {
            for (int i = 0; i < inventory.size(); i++) 
            {
                System.out.println((i + 1) + ". " + inventory.get(i));
            }
        }
    }

    private static void grabItem(ArrayList<String> inventory, Scanner sc) 
    {
        if (inventory.size() >= MAX_ITEMS) 
        {
            System.out.println("You can't carry any more items. Drop something first.");
            return;
        }
        System.out.print("Name: ");
        String newItem = sc.nextLine();
        inventory.add(newItem);
        System.out.println(newItem + " was added.");
    }

    private static void editItem(ArrayList<String> inventory, Scanner sc) 
    {
        System.out.print("Number: ");
        int index = getValidIndex(sc, inventory);
        if (index == -1) return;

        System.out.print("Updated name: ");
        String updatedItem = sc.nextLine();
        inventory.set(index, updatedItem);
        System.out.println("Item number " + (index + 1) + " was updated.");
    }

    private static void dropItem(ArrayList<String> inventory, Scanner sc) 
    {
        System.out.print("Number: ");
        int index = getValidIndex(sc, inventory);
        if (index == -1) return;

        String removedItem = inventory.remove(index);
        System.out.println(removedItem + " was dropped.");
    }

    private static int getValidIndex(Scanner sc, ArrayList<String> inventory) 
    {
        int index;
        try 
        {
            index = Integer.parseInt(sc.nextLine()) - 1;
            if (index < 0 || index >= inventory.size()) 
            {
                System.out.println("Invalid item number.");
                return -1;
            }
        } 
        catch (NumberFormatException e) 
        {
            System.out.println("Invalid input! Please enter a number.");
            return -1;
        }
        return index;
    }
}
