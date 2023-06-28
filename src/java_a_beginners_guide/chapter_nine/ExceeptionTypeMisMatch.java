package java_a_beginners_guide.chapter_nine;

public class ExceeptionTypeMisMatch {
    public static void main(String[] args) {
        int[] numbers = new int[4];

        try{
            System.out.println("Before the exception is generated.");
            numbers[5] = 100; //This line generates ArrayIndexOutOfBoundsException.
            System.out.println("This won't be displayed.");
        }catch (ArithmeticException arithmeticException) {
            /**
             * Can't catch an Array boundary error with ArithmeticException.
             */
            System.out.println("Exception: ArrayIndexOutOfBoundsException occured.");
        }

        System.out.println("After the catch block.");
    }
}
