public class Tester {
    public static void main(String[] args) 
    {
        PaperRoute myCusts = new PaperRoute();

        myCusts.addCustomer("Alice", "daily", 15.00);
        myCusts.addCustomer("Bob", "Sunday", 10.00);
        myCusts.addCustomer("Charlie", "both", 20.00);
        myCusts.addCustomer("Dana", "daily", 12.50);

        System.out.println("Total Due: $" + myCusts.totDue());

        System.out.println("\nAll Customers:");
        myCusts.displayAll();

        System.out.println("\nSubscription Counts:");
        System.out.println("Daily: " + myCusts.countBySubscriptionType("daily"));
        System.out.println("Sunday: " + myCusts.countBySubscriptionType("Sunday"));
        System.out.println("Both: " + myCusts.countBySubscriptionType("both"));
    }
}
