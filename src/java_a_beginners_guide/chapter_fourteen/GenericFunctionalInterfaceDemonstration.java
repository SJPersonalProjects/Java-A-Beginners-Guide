package java_a_beginners_guide.chapter_fourteen;

public class GenericFunctionalInterfaceDemonstration {
    public static void main(String[] args) {
        //This lambda expression determines if one integer is a factor of another.
        SomeTest<Integer> isFactor = (valueOne, valueTwo) -> (valueOne % valueTwo == 0);

        if(isFactor.test(10, 2))
            System.out.println("2 is a factor of 10");
        System.out.println(); //Statement for a space of line.

        //The next lambda expression determines if one Double is a factor of another.
        SomeTest<Double> isFactorD = (valueOne, valueTwo) -> (valueOne % valueTwo == 0.0D);

        if(isFactorD.test(212.0, 4.0))
            System.out.println("4.0 is a factor of 212.0");
        System.out.println(); //Statement for a space of line.

        //This lambda expression determines if one string is part of another.
        SomeTest<String> isPart = (valueOne, valueTwo) -> valueOne.indexOf(valueTwo) != -1;

        String stringTest = "Generic Functional Interface";
        System.out.println("Testing string: " + stringTest);

        if(isPart.test(stringTest, "Nothing"))
            System.out.println("'face' is found");
        else
            System.out.println("'face' not found");
    }
}
