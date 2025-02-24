package Object_Oriented_Programming.Error_Handling;

public class try_catch {
    public static void main(String[] args) {
        try {
            int number = 10;
            int result = number / 0;  // This will cause ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        }
        System.out.println("Program continues after the catch block.");
    }
}
