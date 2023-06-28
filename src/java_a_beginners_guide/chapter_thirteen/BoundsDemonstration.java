package java_a_beginners_guide.chapter_thirteen;

public class BoundsDemonstration {
    public static void main(String[] args) {
        NumericFunctions<Integer> integerObject =
                new NumericFunctions<>(5);

        System.out.println("Reciprocal of integerObject is: " +
                integerObject.reciprocal());

        System.out.println("Fractional component of integerObject is: " +
                integerObject.fraction());

        System.out.println();

        NumericFunctions<Double> doubleObject =
                new NumericFunctions<>(5.25);

        System.out.println("Reciprocal of doubleObject is: " +
                doubleObject.reciprocal());

        System.out.println("Fractional component of doubleObject is: " +
                doubleObject.fraction());
    }
}
