package Object_Oriented_Programming;
class Student4 {
    Student4() {
        System.out.println("Constructor called");
    }
}
public class AnonymousObject {
    public static void main(String a[]) {
        new Student4(); // Constructor called
        new Student4(); // Constructor called

        // These objects are called as anonymous objects
    }
}
