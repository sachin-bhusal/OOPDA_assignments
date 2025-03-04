package Lab13;

public class Contact 
{
    private String firstName;
    private String lastName;
    private String email;
    private String phone;

    public void setFirstName(String name) 
    {
        this.firstName = name;
    }

    public String getFirstName() 
    {
        return firstName;
    }

    public void setLastName(String name) 
    {
        this.lastName = name;
    }

    public String getLastName() 
    {
        return lastName;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getEmail() 
    {
        return email;
    }

    public void setPhone(String phone) 
    {
        this.phone = phone;
    }

    public String getPhone() 
    {
        return phone;
    }

    public String displayContact() 
    {
        return "\n---- Current Contact ----\n" +
               "Name: " + firstName + " " + lastName + "\n" +
               "Email Address: " + email + "\n" +
               "Phone Number: " + phone + "\n" +
               "--------------------------";
    }
}