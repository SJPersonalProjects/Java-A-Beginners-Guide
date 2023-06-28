package java_a_beginners_guide.chapter_six;

public class MethodOverloadingDemonstration {
    public static void main(String[] args) {
        MethodOverloading methodOverloading = new MethodOverloading();

        int additionInteger;
        double additionDouble;

        //Call all versions of overloaded methods.
        methodOverloading.overloading(); //Version 1.
        System.out.println(); //A gap of line.

        methodOverloading.overloading(5); //Version 2.
        System.out.println(); //A gap of line.

        additionInteger = methodOverloading.overloading(5, 20); //Version 3.
        System.out.println("Result of methodOverloading.overloading(5, 20): " +
                additionInteger); //Result printing.
        System.out.println(); //A gap of line.

        additionDouble = methodOverloading.overloading(20.0, 30.0); //Version 4.
        System.out.println("Result of methodOverloading.overloading(20.0, 30.0): " +
                additionDouble); //Result printing.
    }
}
