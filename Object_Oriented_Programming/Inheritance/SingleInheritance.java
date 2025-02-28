// A class inherits properties and behavior from one 
// parent class only.

package Object_Oriented_Programming.Inheritance;
class Polygon2 {
    int length;
    int breadth;

    Polygon2(int l, int b) {
        length = l;
        breadth = b;
    }
}

class Rectangle extends Polygon {
    Rectangle(int l, int b) {
        super(l, b);
    }

    int area() {
        return length * breadth;
    }
}
public class SingleInheritance {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(10, 2);
        System.out.println(r.area()); // 20
    }
}
