interface Shape {
    int area();
}

interface Output {
    void print(int a);
}

interface Calculation extends Shape, Output {
    int perimeter();
}

class Rectangle implements Calculation {
    int length;
    int breadth;
    
    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    
    public int area() {
        return length * breadth;
    }
    
    public int perimeter() {
        return 2 * (length + breadth);
    }
    
    public void print(int a) {
        System.out.println(a);
    }
}
public class TimePass {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(10, 2);
        r.print(r.area());
        r.print(r.perimeter());
    }
}
