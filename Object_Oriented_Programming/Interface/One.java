package Object_Oriented_Programming.Interface;

// An interface is a blueprint of a class that contains abstract 
// methods (methods without a body) and constants. It is used to 
// achieve abstraction and multiple inheritance. A class that 
// implements an interface must provide implementations for all 
// its methods.

interface A {
    int age = 44; // final and static
    String area = "Mumbai"; // final and static

    void show();
    void config();
}

class B implements A { // we have to implement both the methods of 
                      // the interface else the class becomes abstract class
    public void show() {
        System.out.println("in show ");
    }

    public void config() {
        System.out.println("int config");
    }
}
public class One {
    public static void main(String[] a) {
        B obj = new B();
        obj.show(); // in show
        obj.config(); // in config

        return ;
    }
}
