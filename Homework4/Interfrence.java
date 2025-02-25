package Homework4;

public class Interfrence 
{
    public static int executeOperation(int a, int b, MathOperation operation)
    {
        return operation.operate(a, b);
    }

    public static void main(String[] args) 
    {
        MathOperation addition = (x, y) -> x + y;
        MathOperation multiplication = (x, y) -> x * y;

        int sum = executeOperation(5, 3, addition);
        int product = executeOperation(5, 3, multiplication);

        System.out.println("Sum: " + sum);         
        System.out.println("Product: " + product);  
    }
  
}
