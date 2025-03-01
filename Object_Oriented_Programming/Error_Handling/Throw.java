package Object_Oriented_Programming.Error_Handling;
// The throw keyword in Java is used to explicitly throw an exception from a method
// or block of code. It is used when you want to indicate that an exceptional 
// condition has occurred, and you want to transfer control to an appropriate 
// exception handler (e.g., a catch block).
public class Throw {
    public static void main(String[] args) {
        try {
            int age = -5;
            if (age < 0) {
                throw new IllegalArgumentException("Age cannot be negative!");
            }
            System.out.println("Age is: " + age);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }
}
