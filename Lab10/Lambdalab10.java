package Lab10;

interface MathOperation {
    int operate(int a, int b);
}

public class Lambdalab10 
{
        public static int executeOperation(int a, int b, MathOperation operation) 
        {
            return operation.operate(a, b);
        }

    public static void main(String[] args) 
    {
        MathOperation addition = (x, y) -> x + y;
        MathOperation multiplication = (x, y) -> x * y;

        System.out.println("Addition: " + executeOperation(5, 3, addition));
        System.out.println("Multiplication: " + executeOperation(5, 3, multiplication));
    }
}