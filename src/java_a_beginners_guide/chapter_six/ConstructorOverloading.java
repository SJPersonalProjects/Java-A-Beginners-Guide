package java_a_beginners_guide.chapter_six;

public class ConstructorOverloading {
    //Instance field.
    public int valueX;

    //Constructor Overloading.

    /**
     * Parameter less constructor.
     * 1st version of Constructor overloading.
     */
    public ConstructorOverloading() {
        System.out.println("Inside ConstructorOverloading().");
        valueX = 0; //0 is assigned to the variable.
    }

    /**
     * Parameterized constructor.
     * 2nd version of constructor overloading.
     * @param i: single value to assign to the object.
     */
    public ConstructorOverloading(int i) {
        System.out.println("Inside ConstructorOverloading(int).");
        valueX = i;
    }

    /**
     * Parameterized constructor.
     * 3rd version of constructor overloading.
     * @param i: single value to assign to the object.
     */
    public ConstructorOverloading(double i) {
        System.out.println("Inside ConstructorOverloading(double).");
        valueX = (int) i;
    }

    /**
     * Parameterized constructor.
     * 4th version of constructor overloading.
     * @param x: value 1 for multiplication.
     * @param y: value 2 for multiplication.
     */
    public ConstructorOverloading(int x, int y) {
        System.out.println("Inside ConstructorOverloading(int x, int y).");
        valueX = x * y;
    }
}
