package Object_Oriented_Programming;
// Definiton - the static keyword is used to indicate that a member 
// (variable, method, or block) belongs to the class 
// rather than to any specific instance of the class.

class student1 {
    static String schoolName;
    int rollNo;
    
    void print() {
        System.out.println(schoolName + " " + rollNo);
    }
}
public class staticKeyword {
    public static void main(String a[]) {
        student st1 = new student();
        st1.schoolName = "JSPM RSCOE";
        st1.rollNo = 20;

        student st2 = new student();
        st2.schoolName = "JSPM Narhe";
        st2.rollNo = 30;

        st1.print(); // SchoolName - JSPM Narhe rollNo - 20
        st2.print(); // SchoolName - JSPM Narhe rollNo - 20

        // Its because static member variable is shared by objects 
        // so after making any modifications it would be modified for 
        // all the objects of class

        student.schoolName = "JSPM RSCOE";
        st1.print();  // SchoolName - JSPM RSCOE rollNo - 20
        // Its better to declare static member varibale by the name of 
        // the class.

    }
}
