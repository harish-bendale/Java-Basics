package Object_Oriented_Programming.Interface;
// A class cannot inherits multiple abstract classes
// but a class can implements multiple interfaces

// class -> class extends
// class -> Interface implements
// Interface -> Interface implements
interface A2 {

    void show();
    void config();
}

interface X {
    void run();
}

class B2 implements A2,X 
{
    public void show()
    {
        System.out.println("in show ");
    }

    public void config() 
    {
        System.out.println("in config");
    }

    public void run() 
    {
        System.out.println("in run");
    }
}
public class Two {
    public static void main(String[] a) {
        A2 obj;
        obj = new B2();

        obj.config();
        obj.show();
        // obj.run(); It will show error bcz, we are 
        //            creating the reference of interface A
        //            to access run we have to take the reference of 
        //            interface X

        X obj1 = new B2();
        obj1.run();

    }
}
