package Annotations;

/*
 *-> Annotation is a type of metadata that can be added to a class, field, method,
 *   program to provide additional information about the program.
 *-> Annotations are used by compiler, runtime and other tools to generate code,
 *   perform runtime checks and provide documentation and other information.  
 *  It is recommended to keep track of methods and code howabouts through various
 * methods. So that other team members working with you in a team can also
 * understand the working and why of code.
 * One way of keeping track of metadata of code is through Comments.
 * But comments work untill code goes to compiler.
 * Comments have no effect on Compiler/JVM or to maintain integrity of code.
 * They are just for developer readability.
 * 
 * 
 * -> When we want that the information about code reaches to Compiler/JVM and
 * JVM also supports us to maintain that information or maintain integrity of
 * code, we use "ANNOTATIONS".
 * 
 * 
 */

@FunctionalInterface
interface demo {
    void disp();
    // void disp2(); It will give error at compile time itself by denoting that it
    // is a functional interface
}

class Plane {
    void fly() {
        System.out.println("Plane flies at medium height!");
    }
}

class CargoPlane extends Plane {
    @Override // Using annotations to ensure the method should be overridden. If any typo or
    // syntax mistake happens while overriding the code, then due to annotation it
    // will give error at COMPILE TIME.
    void fly() {
        System.out.println("CargoPlane flies at lower height!");
    }
}

public class AnnotationCore {
    public static void main(String[] args) {
        Plane cp = new CargoPlane();
        cp.fly();
    }
}
