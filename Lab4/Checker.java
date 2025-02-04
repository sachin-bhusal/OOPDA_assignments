package Lab4;
public class Checker 
{
    public static void main(String [] args) 
    {  
         MyConsole console = new MyConsole(); 
         System.out.println("Welcome to Odd/Even Checker!");
 
         boolean continueChecking = true;
         while (continueChecking) 
         {
             int number = Console.getInt("Enter an integer: "); 
 
             if (number % 2 == 0) 
             {
                 System.out.println("The number " + number + " is even.");
             } 
             else 
             {
                 System.out.println("The number " + number + " is odd.");
             }
 
             String choice;
             while (true) 
             {
                 choice = console.getString("Continue? (y/n): ").toLowerCase(); 
                 if (choice.equals("y")) 
                 {
                     break;
                 } 
                 else if (choice.equals("n")) 
                 {
                     continueChecking = false;
                     break;
                 } 
                 else 
                 {
                     System.out.println("Error! Enter 'y' or 'n'. Try again.");
                 }
             }
         }
         
         System.out.println("Thank you for using Odd/Even Checker!");
    }
 }
 