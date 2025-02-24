package Object_Oriented_Programming.Inheritance;
class Polygon {
    int length, breadth;
    Polygon(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    int area() {
        return length * breadth;
    }
}

class Square extends Polygon {
    Square(int side) {
        super(side, side);
    }
}
public class HierarchicalInheritance {
    public static void main(String[] a) {
        Square s = new Square(5); 
        System.out.println(s.area()); // 25
    }
}
