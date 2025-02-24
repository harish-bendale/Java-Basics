package Object_Oriented_Programming.Inheritance;

interface Shape {
    int area();
}

interface Output {
    void print(int a);
}

interface Calculation extends Shape , Output {
    int perimeter();
}

class Rectangle2 implements Calculation {
    int length, breadth;

    Rectangle2(int length, int breadth) {
        this.length= length;
        this.breadth = breadth;
    }

    // If we are implementing the method from the interface then it
    // should be public in the implemented class
    public int area() {
        return length * breadth;
    }

    public int perimeter()
    {
        return 2 * (length + breadth);
    }

    public void print(int a) {
        System.out.println(a);
    }
}

public class HybridInheritance {
    public static void main(String[] arg) {
        Rectangle2 r = new Rectangle2(5, 2);
        r.print(r.perimeter()); // 14
        r.print(r.area()); // 10

        return ;
    }
}
