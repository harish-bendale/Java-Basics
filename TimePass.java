abstract class Integer {
    int a;
    Integer(int a) {
        this.a = a;
    }
    void show() {
        System.out.println(a);
    }
}

class Temp extends Integer {
    Temp(int t) {
        super(t);
    } 
}
public class TimePass {
    public static void main(String[] args) {
        Temp t = new Temp(10);
        t.show();
    }
}
