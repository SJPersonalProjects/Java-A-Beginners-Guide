package java_a_beginners_guide.chapter_nine;

public class ExceptionMethodDemonstration {
    public static void main(String[] args) {
        try{
            ExceptionMethod.generateException();
        }catch(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            //Catches the exception.
            System.out.println("Exception: ArrayIndexOutOfBoundsException occured.");
        }

        System.out.println("After the exception.");
    }
}
