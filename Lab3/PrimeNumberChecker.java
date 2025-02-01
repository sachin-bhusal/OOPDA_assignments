package Lab3;
import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumberChecker 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        String choice;
        
        do 
        {
            System.out.print("Please enter an integer between 1 and 5000: ");
            int number = scanner.nextInt();
            
            if (isPrime(number)) 
            {
                System.out.println(number + " is a prime number.");
            } 
            else 
            {
                ArrayList<Integer> factors = getFactors(number);
                System.out.println(number + " is NOT a prime number.");
                System.out.print("It has " + factors.size() + " factors: ");
                for (int factor : factors) 
                {
                    System.out.print(factor + " ");
                }
                System.out.println();
            }
            
            System.out.print("Try again? (y/n): ");
            choice = scanner.next();
        } 
        while (choice.equalsIgnoreCase("y"));
        
        System.out.println("Bye!");
        scanner.close();
    }
    
    public static boolean isPrime(int number) //Found a really good technique for efficiency as every composite number have 
    {                                         //a factor thats equal to or less than its square root 
        if (number < 2) return false;         
        for (int i = 2; i <= Math.sqrt(number); i++)  
        {
            if (number % i == 0) 
            {
                return false;
            }
        } 
        return true;
    }
    
    public static ArrayList<Integer> getFactors(int number)
    {
        ArrayList<Integer> factors = new ArrayList<>();
        for (int i = 1; i <= number; i++) 
        {
            if (number % i == 0) 
            {
                factors.add(i);
            }
        }
        return factors;
    }
}


