package java_a_beginners_guide.chapter_nine;

public class ExceptionMethod {
    public static void generateException() {
        //1D array of type int.
        int[] numbers = new int[7];

        numbers[10] = 100; //This line is the cause of exception.
        System.out.println("This won't be displayed.");
    }
}
