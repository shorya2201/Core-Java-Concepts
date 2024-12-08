package Encapsulation;

/*
 * When we make a variable private it cannot be easily accessed by another class 
 * To access it either we use Getter-Setter or else we create a function to setData and show Data
 * 
 */

class Main {
    private int id;
    private String name;

    /*
     * Like in this function we are assigning values to private variable ID by
     * defining a function.
     * 
     * But the shadowing problem arises when we want to give same name to local
     * variable[inside the function] and instance variable[as a argument we give]
     * both.
     * 
     * In this condition the JVM gives more priority to the local variable
     * therefore due to this we are not able to assign values because the local
     * variable has Default value i.e. 0 and null.
     * 
     * To solve this either we can create objects in each function so that the local
     * variable can become instance variable using the object name
     * or we can use this keyword
     */

    public void setData1(int id) {
        // id = id; in this both variable get 0 value by default

        /*
         * First obj = new First();
         * obj.id = id;
         * In this we have to create objects every time we define function
         */

        this.id = id;// This will be the correct approach
    }

    public void setData2(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println(id + " " + name);
    }
}

public class ThisKeyword {
    public static void main(String[] args) {

        Main obj1 = new Main();
        Main obj2 = new Main();

        obj1.setData1(10);
        obj2.setData1(20);
        obj1.setData2("Shorya");
        obj2.setData2("Rastogi");
        obj1.show();
        obj2.show();
    }
}
