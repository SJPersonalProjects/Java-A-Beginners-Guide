package java_a_beginners_guide.chapter_fourteen;

/**
 * This class defines three static methods that check an integer
 * against some condition.
 */
public class MyIntegerPredicate {

    /**
     * A method that determines if a number passed as parameter
     * is prime or not.
     * @param value: number to be tested.
     * @return returns a boolean condition based on number if it's prime or not.
     */
    static boolean isPrime(int value) {
        if(value < 2) return false;

        for(int i = 2; i <= value / i; i++) {
            if(value % i == 0) {
                return false;
            }
        }

        return true;
    }

    /**
     * Method to determine if the number is even or not.
     * @param value: value to be tested.
     * @return returns a boolean condition based on if it is even or not.
     */
    static boolean isEven(int value) {
        return (value % 2) == 0;
    }

    /**
     * A static method that determines if a number is positive or not.
     * @param value: value to be tested.
     * @return returns a boolean condition based on the number if it's positive or not.
     */
    static boolean isPositive(int value) {
        return value > 0;
    }
}
