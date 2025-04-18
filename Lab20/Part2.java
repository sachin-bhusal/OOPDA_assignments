package Lab20;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Part2 
{
    public static void main(String[] args) 
    {
        List<Double> numbers = Arrays.asList(3.5, 5.0, 7.5, 10.0);

        Consumer<List<Double>> averagePrinter = list -> 
        {
            double sum = 0;
            for (double num : list) 
            {
                sum += num;
            }
            double average = sum / list.size();
            System.out.println("Average: " + average);
        };

        averagePrinter.accept(numbers);
    }
}


