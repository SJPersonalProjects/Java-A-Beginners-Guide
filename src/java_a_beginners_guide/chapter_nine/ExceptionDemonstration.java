package java_a_beginners_guide.chapter_nine;

public class ExceptionDemonstration {
    public static void main(String[] args) {
        //1D array of type int.
        int[] array = new int[5];

        //Using exception handling method to avoid error on runtime.
        try{
            System.out.println("Before exception is generated.");

            //Generating an index-out-of-bounds exception.
            array[6] = 16;
            System.out.println("This won't be displayed.");
        }catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            //Catches the exception.
            System.out.println("ArrayIndexOutOfBoundsException occured.");
        }

        System.out.println("After catch statement.");
    }
}
