// A class inherits from two or more parent classes.

package Object_Oriented_Programming.Inheritance;
interface Shape {
    int area();
}

interface Output {
    void print(int a);
}

class Rectangle implements Shape, Output {
    int length , breadth;

    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    public int area() {
        return length * breadth;
    }

    public void print(int a) {
        System.out.println(a);
    }
}
public class MultipleInheritance {
    public static void main(String[] a) {
        Rectangle r = new Rectangle(10, 2);
        r.print(r.area());
    }
}
