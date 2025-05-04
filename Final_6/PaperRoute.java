import java.util.ArrayList;

public class PaperRoute 
{
    private ArrayList<Customer> customers;

    public PaperRoute() 
    {
        customers = new ArrayList<>();
    }

    public void addCustomer(String name, String subscriptionType, double amountDue) 
    {
        customers.add(new Customer(name, subscriptionType, amountDue));
    }

    public double totDue() 
    {
        double total = 0;
        for (Customer c : customers) 
        {
            total += c.getAmountDue();
        }
        return total;
    }

    public void displayAll() 
    {
        for (Customer c : customers) 
        {
            System.out.println(c);
        }
    }

    public int countBySubscriptionType(String kind) 
    {
        int count = 0;
        for (Customer c : customers) 
        {
            if (c.getSubscriptionType().equalsIgnoreCase(kind)) 
            {
                count++;
            }
        }
        return count;
    }
}
