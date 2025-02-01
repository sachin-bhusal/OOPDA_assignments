package Homework1;
import java.util.ArrayList;
import java.util.Scanner;

public class Studentlist 
{   
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String choice;
        ArrayList<Student> studentList = new ArrayList<>(); 
        int i = 1;
        System.out.println("The Student Score Application");
        
        do
        {
            System.out.println("Student " + i++);
           
            System.out.print("Last name: ");
            String lastname = scanner.nextLine();

            System.out.print("First name: ");
            String firstname = scanner.nextLine();

            System.out.print("Score: ");
            int score= Integer.parseInt(scanner.nextLine());

            Student student = new Student(lastname, firstname, score);
            studentList.add(student);
            
            System.out.print("Enter another student? (y/n): ");
            choice = scanner.nextLine();

        }
        while (choice.equalsIgnoreCase("y"));

        System.out.println("SUMMARY");
        for(Student student : studentList)
        {
        System.out.println(student.getLastname() + ", " + student.getFirstname() + ": " + student.getScore() );
        }

        scanner.close();
    }
}
