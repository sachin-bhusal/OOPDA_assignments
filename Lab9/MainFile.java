package Lab9;
import java.util.ArrayList;
import java.util.Scanner;

public class MainFile 
{
        public static void main(String args[])
        {
           Scanner scanner = new Scanner(System.in);
           int choice = scanner.nextInt();
           boolean continueChecking = true;
           while (continueChecking)
           { 
                System.out.println("Welcome to movie rating application!");
                System.out.println("");
                System.out.println("-----------------------");
                System.out.println("What do you want to do"); 
                System.out.println("-----------------------");
                System.out.println("");
                System.out.println("1 - Enter a movie");
                System.out.println("2 - View top rated movies");
                System.out.println("3 - View most recent movies");
                System.out.println("4 - View all movies");
                System.out.println("5 - View ratings");
                System.out.println("6 - Quit application");
                System.out.println("");
                System.out.print("Choose a menu option: ");
                scanner.nextLine();

                switch (choice)
                {
                    case 1:
                        int count = scanner.nextInt();
                        System.out.print("How many movies do you want to enter? ");
                        scanner.nextLine();
                        for (int i = 0; i < count; i++)
                        {
                            System.out.println("Movie #" + i + 1);
                            System.out.println("----------");
                            System.out.println("Enter Title:  ");
                            String title = scanner.nextLine();
                            System.out.println("Enter year:  ");
                            int year = scanner.nextInt();
                            System.out.println("Enter rating between 1 and 5 (decimals OK) :   ");
                            double rating = scanner.nextLong();
                            Moviecollection.add(new Movie(title, year, rating));
                        }
                        break;
                    
                    case 2:
                        System.out.println("Movier rated 4.0 or higher");
                        System.out.println("---------------------------");
                        List<Movie> higherRating = new ArrayList<>();
                        for(Movie movie : movies)
                        {
                            if(movie.rating > 4.0)
                            {
                                higherRating.add(movie);
                            }
                            
                        }


                }
 
           }
           
        } 

}
