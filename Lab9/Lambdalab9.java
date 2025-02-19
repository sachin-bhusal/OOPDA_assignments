package Lab9;

interface MathOperation 
{
    int operate(int a, int b);
}

public class Lambdalab9
{
    public static void main(String[] args) 
    {
        MathOperation addition = (a, b) -> a + b;
        MathOperation multiplication = (a, b) -> a * b;

        System.out.println("Addition: " + addition.operate(5, 3));
        System.out.println("Multiplication: " + multiplication.operate(5, 3));
    }
}