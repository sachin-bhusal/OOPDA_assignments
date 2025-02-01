package Homework1;

public class Student
{
    private String lastname;
    private String firstname;
    private int score;
    
    Student (String lastname, String firstname, int score)
        {
            this.lastname = lastname;
            this.firstname = firstname;
            this.score = score;
        }
    
    public String getLastname()
    {
        return lastname;
    }

    public String getFirstname()
    {
        return firstname;
    }

    public int getScore()
    {
        return score;
    }
}    



    
 