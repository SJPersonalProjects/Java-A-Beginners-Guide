package java_a_beginners_guide.chapter_fourteen;

public class LambdaExpressionDemonstration {
    public static void main(String[] args) {
        //This lambda expression determines if one number is a factor of another.
        NumericTest factorOf = (valueOne, valueTwo) -> (valueTwo % valueOne) == 0;

        if(factorOf.test(10, 2))
            System.out.println("2 is a factor of 10");
        if(factorOf.test(10, 3))
            System.out.println("3 is a factor of 10");
        System.out.println(); //Statement for a gap of line.

        //This lambda expression returns true if the first argument is less than second.
        NumericTest compareArgument = (valueOne, valueTwo) -> (valueOne < valueTwo);

        if(compareArgument.test(2, 10))
            System.out.println("2 is less than 10");
        if(compareArgument.test(10, 2))
            System.out.println("10 is less than 2");
        System.out.println(); //Statement for a gap of line.

        //This lambda expression returns true if the absolute values of thw two arguments
        //are equal.
        NumericTest compareAbsoluteValue = (valueOne, valueTwo) -> (valueOne < 0 ? -valueOne : valueOne) == (valueTwo < 0 ? -valueTwo : valueTwo);

        if(compareAbsoluteValue.test(4, -4))
            System.out.println("4 is absolutly equal to 4");
        if(compareAbsoluteValue.test(4, -5))
            System.out.println("4 is absolutly equal to 5");

    }
}
