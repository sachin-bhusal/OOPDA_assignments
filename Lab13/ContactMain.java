package Lab13;
import java.util.Scanner;

public class ContactMain 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String choice;
        do
        {
            Contact contact = new Contact();

            System.out.println("Welcome to the Contact List Application");
            System.out.println();
            System.out.print("Enter first name: ");
            contact.setFirstName(scanner.nextLine());
            System.out.print("Enter last name:  ");
            contact.setLastName(scanner.nextLine());
            System.out.print("Enter email:      ");
            contact.setEmail(scanner.nextLine());
            System.out.print("Enter phone:      ");
            contact.setPhone(scanner.nextLine());

            System.out.println(contact.displayContact());

            System.out.print("Continue? (y/n):  ");
            choice = scanner.nextLine();
        } 
        while(choice.equalsIgnoreCase("y"));

        scanner.close();
    }
}
