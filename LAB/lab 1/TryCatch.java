// program that demonstrate the try, catch and finally block to handle exception

public class TryCatch {

    public static void main(String[] args) {
        int dividend = 10;
        int divisor = 0;

        try {
            int result = dividend / divisor;
            System.out.println("Result: " + result);

        } catch (ArithmeticException error) {
            System.out.println("Exception caught: " + error.getMessage() + ", cannot divide by 0");

        } finally {
            System.out.println("Finally block executed.");
        }

        System.out.println("Program continues after exception handling.");
    }
}