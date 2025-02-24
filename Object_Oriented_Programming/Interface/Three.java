package Object_Oriented_Programming.Interface;

// Functional interace is the interface having only one method
@FunctionalInterface
interface A3 {
    void show();
}

class C implements A3 {
    public void show() {
        System.out.println("Inside show function");
    }
}
public class Three {
   public static void main(String[] a) {
        C obj = new C();
        obj.show();
   }
}
