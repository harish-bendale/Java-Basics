interface A {
	default void method() {
		System.out.println("Inside A");
	}
}
interface B extends A{
	@Override
	default void method() {
		System.out.println("Inside B");
	}
}

interface C extends A{
	@Override
	default void method() {
		System.out.println("Inside C");
	}
}
class Child implements C, B {
	@Override
	public void method() {
		B.super.method();
	}
}
public class Test {
    public static void main(String[] args) {
		Child c = new Child();
		c.method();
    }
}
