package Object_Oriented_Programming.Error_Handling;

public class MultipleException {
    public static void main(String[] a) {
        int i = 0;
        int t = 10;
        int[] nums = new int[3];

        try {
            int ans = t/i;
            System.out.println(nums[4]);
        }
        catch(ArithmeticException e) {
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}
