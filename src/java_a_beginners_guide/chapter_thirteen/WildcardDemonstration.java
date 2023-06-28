package java_a_beginners_guide.chapter_thirteen;

public class WildcardDemonstration {
    public static void main(String[] args) {
        NumericFunctionsWildcard<Integer> integerObject =
                new NumericFunctionsWildcard<>(6);

        NumericFunctionsWildcard<Double> doubleObject =
                new NumericFunctionsWildcard<>(-6.0);

        NumericFunctionsWildcard<Long> longObject =
                new NumericFunctionsWildcard<>(5L);

        System.out.println("Testing integerObject and doubleObject:");

        if(integerObject.absoluteEqual(doubleObject)) {
            System.out.println("Absolute values are equal.");
        }else {
            System.out.println("Absolute values differ.");
        }

        System.out.println();

        System.out.println("Testing integerObject and longObject.");
        if(integerObject.absoluteEqual(longObject)) {
            System.out.println("Absolute values are equal.");
        }else {
            System.out.println("Absolute values differ.");
        }
    }
}
