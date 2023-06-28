package java_a_beginners_guide.chapter_nine;

public class ThrowableMethodsDemonstration {
    public static void main(String[] args) {
        try{
            ThrowableMethods.generateException();
        }catch(ArrayIndexOutOfBoundsException exception) {
            //Catch the exception.
            System.out.println("Standard message is: " +
                    exception);
            System.out.println("\nStack Trace: ");
            exception.printStackTrace(); //This prints the stack trace message as console output.
        }
        System.out.println("After catch statement.");
    }
}
