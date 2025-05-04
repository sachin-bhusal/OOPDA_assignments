public class Customer 
{
    private String name;
    private String subscriptionType; 
    private double amountDue;

    public Customer(String name, String subscriptionType, double amountDue) 
    {
        this.name = name;
        this.subscriptionType = subscriptionType;
        this.amountDue = amountDue;
    }

    public String getName() 
    {
        return name;
    }

    public String getSubscriptionType() 
    {
        return subscriptionType;
    }

    public double getAmountDue() 
    {
        return amountDue;
    }

    @Override
    public String toString() 
    {
        return "Customer: " + name + ", Subscription: " + subscriptionType + ", Due: $" + amountDue;
    }
}
