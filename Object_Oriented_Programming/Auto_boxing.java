package Object_Oriented_Programming;

public class Auto_boxing {
    public static void main(String[] a) {
        int num = 7;
        Integer num1 = num; // auto-boxing
        // Autoboxing is the automatic conversion of a primitive 
        // data type into its corresponding wrapper class object
        // by the Java compiler.


        int num2 = num1; // auto-unboxing
        // Auto-unboxing:
        // Auto-unboxing is the automatic conversion of a wrapper 
        // class object back to its corresponding primitive data 
        // type by the Java compiler.

        
        System.out.println(num2); // 7

        String str = "12";
        int num3 = Integer.parseInt(str);

        System.out.println(num3 * 2); // 24
    }
}
