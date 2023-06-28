package java_a_beginners_guide.chapter_six;

public class MethodOverloadingV2 {
    //Overloading methods.

    /**
     * Method overloading version 1.
     * It takes 1 parameter.
     * @param x: single value to display.
     */
    void f(int x) {
        System.out.println("Inside f(int): " + x);
    }

    /**
     * Method overloading version 2.
     * It takes 1 parameter.
     * @param x: single value to display.
     */
    void f(double x) {
        System.out.println("Inside f(double): " + x);
    }
}
