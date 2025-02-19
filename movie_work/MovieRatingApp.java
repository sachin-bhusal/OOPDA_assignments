package movie_work;
import java.util.List;
import java.util.Scanner;

public class MovieRatingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MovieCollection movieCollection = new MovieCollection();

        while (true) {
            System.out.println("What do you want to do?");
            System.out.println("1 - Enter a movie");
            System.out.println("2 - View top rated movies");
            System.out.println("3 - View most recent movies");
            System.out.println("4 - View all movies");
            System.out.println("5 - View ratings");
            System.out.println("6 - Quit application");
            System.out.print("Choose a menu option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("How many movies do you want to enter? ");
                    int count = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    for (int i = 0; i < count; i++) {
                        System.out.println("Movie #" + (i + 1));
                        System.out.print("Enter title: ");
                        String title = scanner.nextLine();
                        System.out.print("Enter year: ");
                        int year = scanner.nextInt();
                        System.out.print("Enter rating between 1 and 5 (decimals OK): ");
                        double rating = scanner.nextDouble();
                        scanner.nextLine(); // Consume newline
                        movieCollection.add(new Movie(title, year, rating));
                    }
                    break;
                case 2:
                    System.out.println("Movies rated 4.0 or higher");
                    List<Movie> topRatedMovies = movieCollection.filterMovies(m -> m.getRating() >= 4.0);
                    topRatedMovies.forEach(System.out::println);
                    break;
                case 3:
                    System.out.println("Most recent movies");
                    List<Movie> recentMovies = movieCollection.filterMovies(m -> m.getYear() >= 2010);
                    recentMovies.forEach(System.out::println);
                    break;
                case 4:
                    System.out.println("All movies");
                    movieCollection.getAllMovies().forEach(System.out::println);
                    break;
                case 5:
                    System.out.println("Movie rating data");
                    System.out.println("Number of movies: " + movieCollection.getSize());
                    System.out.println("Lowest rating: " + movieCollection.getLowestRating());
                    System.out.println("Highest rating: " + movieCollection.getHighestRating());
                    System.out.println("Average rating: " + movieCollection.getAverageRating());
                    break;
                case 6:
                    System.out.println("Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}