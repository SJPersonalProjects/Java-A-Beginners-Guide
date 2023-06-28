package java_a_beginners_guide.chapter_thirteen;

/**
 * Uses a wildcard.
 * @param <T>: a placeholder for any Number's sub object.
 */
public class NumericFunctionsWildcard<T extends Number> {
    //Instance variable.
    T numbers;

    //Pass the constructor a reference to a numeric object.
    public NumericFunctionsWildcard(T numbers) {
        this.numbers = numbers;
    }

    //Return the reciprocal.
    public double reciprocal() {
        return 1 / numbers.doubleValue();
    }

    //Return the fractional component.
    public double fractionalValue() {
        return numbers.doubleValue() - numbers.intValue();
    }

    //Determine if the absolute values of two objects are the same.
    public boolean absoluteEqual(NumericFunctionsWildcard<?> numbers) {
        if(Math.abs(this.numbers.doubleValue()) ==
                Math.abs(numbers.numbers.doubleValue())) {
            return true;
        }

        return false;
    }
}
