package movie_work;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class MovieCollection {
    private List<Movie> movies = new ArrayList<>();

    public void add(Movie movie) {
        movies.add(movie);
    }

    public List<Movie> filterMovies(Predicate<Movie> condition) {
        List<Movie> filteredMovies = new ArrayList<>();
        for (Movie movie : movies) {
            if (condition.test(movie)) {
                filteredMovies.add(movie);
            }
        }
        return filteredMovies;
    }

    public double getLowestRating() {
        return movies.stream().mapToDouble(Movie::getRating).min().orElse(0);
    }

    public double getHighestRating() {
        return movies.stream().mapToDouble(Movie::getRating).max().orElse(0);
    }

    public double getAverageRating() {
        return movies.stream().mapToDouble(Movie::getRating).average().orElse(0);
    }

    public int getSize() {
        return movies.size();
    }

    public List<Movie> getAllMovies() {
        return movies;
    }
}