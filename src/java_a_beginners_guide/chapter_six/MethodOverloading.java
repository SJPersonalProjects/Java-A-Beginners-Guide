package java_a_beginners_guide.chapter_six;

public class MethodOverloading {
    //Methods overloading.

    /**
     * 1st version of overloaded method.
     * It's parameter less method.
     */
    void overloading() {
        System.out.println("Method with 0 parameters.");
    }

    /**
     * 2nd version of overloaded method.
     * It has 1 parameter.
     * @param a: single parameter value.
     */
    void overloading(int a) {
        System.out.println("One parameter: " + a);
    }

    /**
     * 3rd version of overloaded method.
     * It has 2 parameters.
     * @param a: value 1 for addition.
     * @param b: value 2 for addition.
     * @return returns the added values.
     */
    public int overloading(int a, int b) {
        System.out.println("Two parameters: " + a + " and " + b);
        return a + b;
    }

    /**
     * 4th version of overloaded method.
     * @param a: value 1 for addition.
     * @param b: value 2 for addition.
     * @return returns the added values.
     */
    public double overloading(double a, double b) {
        System.out.println("Two parameters: " + a + " and " + b);
        return a + b;
    }
}
