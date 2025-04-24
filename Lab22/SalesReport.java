package Lab22;
import java.text.NumberFormat;

public class SalesReport 
{
    public static void main(String[] args) 
    {
        System.out.println("The Sales Report application\n");

        double[][] sales = 
        {
            {1540.0, 2010.0, 2450.0, 1845.0}, // Region 1
            {1130.0, 1168.0, 1847.0, 1491.0}, // Region 2
            {1580.0, 2305.0, 2710.0, 1284.0}, // Region 3
            {1105.0, 4102.0, 2391.0, 1576.0}  // Region 4
        };

        NumberFormat currency = NumberFormat.getCurrencyInstance();

        System.out.println("Region\tQ1\t\tQ2\t\tQ3\t\tQ4");
        for (int region = 0; region < sales.length; region++) {
            System.out.print((region + 1) + "\t");
            for (int quarter = 0; quarter < sales[region].length; quarter++) 
            {
                System.out.print(currency.format(sales[region][quarter]) + "\t");
            }
            System.out.println();
        }

        System.out.println("\nSales by region:");
        double totalSales = 0;

        for (int region = 0; region < sales.length; region++) 
        {
            double regionTotal = 0;
            for (int quarter = 0; quarter < sales[region].length; quarter++) 
            {
                regionTotal += sales[region][quarter];
            }
            totalSales += regionTotal;
            System.out.println("Region " + (region + 1) + ": " + currency.format(regionTotal));
        }

        System.out.println("\nSales by quarter:");
        for (int quarter = 0; quarter < sales[0].length; quarter++) 
        {
            double quarterTotal = 0;
            for (int region = 0; region < sales.length; region++) 
            {
                quarterTotal += sales[region][quarter];
            }
            System.out.println("Q" + (quarter + 1) + ": " + currency.format(quarterTotal));
        }
        
        System.out.println("\nTotal sales: " + currency.format(totalSales));
    }
}

