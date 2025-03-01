
public class TimePass {
    public static void main(String[] args) {
       try {
        int number = 0;
        if(number == 0) {
            System.out.println("Entered");
            throw new Exception("Denominator is zero");
        }

        int n = 10 / number;
       }
       catch(Exception e) {
        System.out.println(e.getMessage().toString());
       }
    }
}
