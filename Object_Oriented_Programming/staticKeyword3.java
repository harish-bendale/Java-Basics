package Object_Oriented_Programming;

import java.lang.reflect.Constructor;

class student3 {
    static String schoolName;
    int rollNo;
    
    student3(int rollNo) {
        System.out.println("Constructor executed");
        this.rollNo = rollNo;
    }
    static {
        System.out.println("Static block executed");
        schoolName = "JSPM RSCOE";
        // static block get executed only once if we have created any
        // object of the class 
        // It's not executed during every object creation as of constructor
    }
    void print() {
        System.out.println(schoolName + " " + rollNo);
    }
}
public class staticKeyword3 {
    public static void main(String a[]) {
        student3 st1 = new student3(20);

        student3 st2 = new student3(30);      
        
        // Static block executed
        // Constructor executed
        // Constructor executed

        // 2 times object get create but static block executed only once
        // If we have written class but not created any object of it , then
        // static block would not get executed

    }
}
