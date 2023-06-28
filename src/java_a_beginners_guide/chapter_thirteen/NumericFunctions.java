package java_a_beginners_guide.chapter_thirteen;

public class NumericFunctions <T extends Number> {
    T numbers;

    //Pass the constructor a reference to a numeric object.
    public NumericFunctions(T numbers) {
        this.numbers = numbers;
    }

    //Return the reciprocal.
    double reciprocal() {
        return 1 / numbers.doubleValue();
    }

    //Return the fractional components.
    double fraction() {
        return numbers.doubleValue() - numbers.intValue();
    }

/*
    This won't compile because String is not a subclass of Number.
    NumericFunctions<String> stringObject =
            new NumericFunctions<String>("ABC");
*/
}
