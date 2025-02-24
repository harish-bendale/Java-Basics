package Object_Oriented_Programming.Polymorphism;
class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Cat Meows");
    }
}

public class Runtime {
    public static void main(String[] a) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.sound(); // Dog barks
        myCat.sound(); // Cat Meows
    }
}
