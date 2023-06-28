package java_a_beginners_guide.chapter_two;

public class ModulusOperatorDemo {
    public static void main(String[] args) {
        int integerResult, integerRemainder;
        double doubleResult, doubleRemainder;

        integerResult = 10 / 3;
        integerRemainder = 10 % 3;
        doubleResult = 10.0 / 3.0;
        doubleRemainder = 10.0 % 3.0;

        System.out.println("Division and Remainder of Integer : " +
                integerResult + " " + integerRemainder);
        System.out.println("Division and Remainder of Double : " +
                doubleResult + " " + doubleRemainder);
    }
}
