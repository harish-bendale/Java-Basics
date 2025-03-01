package Object_Oriented_Programming.Polymorphism;
class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class CompileTime {
    public static void main(String[] a) {
        Calculator c = new Calculator();
        System.out.println(c.add(1, 2)); // 3
        System.out.println(c.add(1, 2, 3)); // 6
    }
}
