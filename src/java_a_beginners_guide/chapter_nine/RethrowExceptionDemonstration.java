package java_a_beginners_guide.chapter_nine;

public class RethrowExceptionDemonstration {
    public static void main(String[] args) {
        try{
            RethrowException.generateException();
        }catch(ArrayIndexOutOfBoundsException exception) {
            System.out.println("Fatal error - program terminated.");
        }
    }
}
