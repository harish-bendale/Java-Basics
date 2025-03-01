package Object_Oriented_Programming.Interface;

// A Functional Interface in Java is an interface 
// that contains exactly one abstract method. It can
// have multiple default or static methods, but only
// one abstract method.

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
