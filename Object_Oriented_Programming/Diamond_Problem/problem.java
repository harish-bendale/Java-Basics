package Object_Oriented_Programming.Diamond_Problem;

interface Grandparent {
    default void method() {
        System.out.println("Grandparent");
    }
}

interface Parent1 extends Grandparent {
    @Override
    default void method() {
        System.out.println("Parent1");
    }
}

interface Parent2 extends Grandparent {
    @Override
    default void method() {
        System.out.println("Parent2");
    }
}

class Child implements Parent1, Parent2 {
    // Resolving ambiguity by explicitly choosing Parent1's method
    @Override
    public void method() {
        Parent1.super.method(); // Calls Parent1's method
    }
}

public class problem {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.method(); // Output: Parent1
    }
}
