package Object_Oriented_Programming;
interface A {
    void show(int i);
}

interface B {
    int sum(int a, int b);
}
public class LambdaExpression {
    public static void main(String[] a) {
        // A obj = new A() {
        //     public void show(int i) {
        //         System.out.println("in show function " + i);
        //     }
        // };

        //Above commented part can be written with less syntax as follows
        A obj = i -> System.out.println("in show function " + i); // in show function 5

        obj.show(5);

        B obj2 = (int p, int q) -> p + q;

        obj2.sum(4,5);
    }
}
