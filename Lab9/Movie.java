package Lab9;

public class Movie 
{
    private String title;
    private int year;
    private double rating;

    public void Movie(String title, int year, double rating)
    {
        this.title = title;
        this.year = year;
        this.rating = rating;
    }    
    
    public String getTitle()
    {
        return title;
    }

    public int getYear()
    {
        return year;
    }

    public double getRating()
    {
        return rating;
    }

    public String toString()
    {
        return title + "(" + year + ") Rating: " + rating;
    }
}
