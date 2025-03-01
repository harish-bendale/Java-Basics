// A "chain" of inheritance where a child class 
// becomes a parent for another class.
package Object_Oriented_Programming.Inheritance;
class Animals {
    void category() {
        System.out.println("Animal");
    }
}
class Mammal extends Animals {
    void type() {
        System.out.println("Mammal");
    }
}
class Breed extends Mammal {
    void specification() {
        System.out.println("Dog");
    }
}
public class MultilevelInheritance {
    public static void main(String[] a) {
        Breed b = new Breed();
        b.category(); // Animal
        b.type(); // Mammal
        b.specification(); // Dog
    }
}
