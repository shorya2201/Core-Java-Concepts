package Constructors;

class Demo {
    private int a;
    private int b;

    Demo() {
        System.out.println("Zero Parameterized Constructor made by programmer.");
    }

    Demo(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void disp() {
        System.out.println(a);
        System.out.println(b);
    }
}

// There are two types of Constructors:

// 1.Default Constructor(Zero Parameterized): If we havent write any constructor
// in the class , then at the
// time of object creation the JVM itself will include a Constructor
// which is known as Default Constructor. It is Zero parameterized.
// Default Constructor will only be automatically included if and only if
// no constructor is present inside the class. If any type of constructor is
// written inside the class then default constructor will not be included.

// 2.Parameterized Constructor:
public class MoreAboutCons {
    public static void main(String[] args) {
        Demo st1 = new Demo();// As we havent wrote any constructor then default
        st1.disp(); // constructor will be created
                    // and called.

        Demo st2 = new Demo(10, 20);// As we have written a parameterized constructor inside the class then that
                                    // constructor will be called and default constructor will not be included.
        st2.disp();
    }
}
