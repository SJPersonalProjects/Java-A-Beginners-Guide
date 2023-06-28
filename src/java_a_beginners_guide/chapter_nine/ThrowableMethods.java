package java_a_beginners_guide.chapter_nine;

public class ThrowableMethods {
    public static void generateException() {
        //1D array of type int.
        int[] numbers = new int[5];

        System.out.println("Before exception is generated.");

        //This line causes the ArrayIndexOutOfBoundsException.
        numbers[7] = 100;
        System.out.println("This won't be displayed.");
    }
}
