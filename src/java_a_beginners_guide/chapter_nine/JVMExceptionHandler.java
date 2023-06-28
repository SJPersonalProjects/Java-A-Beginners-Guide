package java_a_beginners_guide.chapter_nine;

public class JVMExceptionHandler {
    public static void main(String[] args) {
        //1D array of type int.
        int[] array = new int[10];

        System.out.println("Before exception is generated.");

        array[11] = 100; //This line of code generates exception of ArrayIndexOutOfBounds.

        System.out.println("After exception is generated.");
    }
}
