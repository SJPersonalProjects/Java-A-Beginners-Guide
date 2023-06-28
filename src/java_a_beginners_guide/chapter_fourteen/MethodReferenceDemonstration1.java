package java_a_beginners_guide.chapter_fourteen;

public class MethodReferenceDemonstration1 {
    /**
     * This method has a functional interface as the type of its
     * first parameter. Thus, it can be passed a reference to any
     * instance of that interface, including one created by a method
     * reference.
     */
    static boolean numberTest(IntegerPredicate integerPredicate, int value) {
        return integerPredicate.test(value);
    }

    public static void main(String[] args) {
        boolean result;

        //Here, a method reference to isPrime is passed to numberTest().
        result = numberTest(MyIntegerPredicate::isPrime, 17);
        if(result) System.out.println("17 is a prime number.");

        //Next, a method reference to isEven is used.
        result = numberTest(MyIntegerPredicate::isEven, 12);
        if(result) System.out.println("12 is an even number.");

        //Now, a method reference to isP
        result = numberTest(MyIntegerPredicate::isPositive, 11);
        if(result) System.out.println("11 is a positive number.");
    }
}
