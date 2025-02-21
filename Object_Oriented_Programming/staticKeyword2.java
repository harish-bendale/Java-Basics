package Object_Oriented_Programming;
class student {
    static String schoolName;
    int rollNo;
    
    static void set() {
        schoolName = "JSPM RSCOE";
        // rollNo = 23; we cant access non-static variable in static function
        // As non-static variable is not shared by objects they are specific for objects
    }
    void print() {
        System.out.println(schoolName + " " + rollNo);
    }
}
public class staticKeyword2 {
    public static void main(String a[]) {
        student.set();
        student st1 = new student();
        st1.rollNo = 20;

        student st2 = new student();
        st2.rollNo = 30;

        st1.print(); // SchoolName - JSPM RSCOE rollNo - 20
        st2.print(); // SchoolName - JSPM RSCOE rollNo - 20

        

    }
}
