package Api;

enum Season {
    WINTER, SUMMER, RAINY;

    // Behind the scenes constants in enum are defined like this:
    // public static Season WINTER = new Season();
    // public static Season SUMMER = new Season();
    // public static Season RAINY = new Season();

    int degree;

    Season() {
        System.out.println("Season enum Constructor is called.");
    }

    void setDegree(int degree) {
        this.degree = degree;
    }

    int getDegree() {
        return degree;
    }

}

public class EnumAdv {

    /*
     * Inside an enum we can also define variables, methods and constructors.
     * 
     * enum constructor is called equal number of times of number of constants in
     * that enum.
     * 
     * In Season enum case constructor is called 3 times because there are 3
     * constants in Season enum.
     */

    public static void main(String[] args) {

        Season.WINTER.setDegree(10);
        System.out.println(Season.WINTER.getDegree());// prints 10

        System.out.println(Season.SUMMER.getDegree());// prints 0 (Default value) as we haven't set any value for SUMMER
                                                      // constant.
        Season.RAINY.setDegree(25);
        System.out.println(Season.RAINY.getDegree());// prints 25 as we have set degree value for RAINY

        // We can also use Enum in switch case

        Season s = Season.WINTER;

        switch (s) {
            case WINTER:
                System.out.println("Winter Season!!!");
                break;

            case SUMMER:
                System.out.println("Summer Season!!!");
                break;

            case RAINY:
                System.out.println("Rainy Season!!!");
                break;

        }
    }
}
