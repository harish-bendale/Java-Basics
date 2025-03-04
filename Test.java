import java.util.*;
public class Test {
    public static void main(String[] args) {
        int number = 0;

        try {
            if(number == 0) {
                throw new Exception("Denominator is zero");
            }
            int a = 10/number;
            System.out.println(a);
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
