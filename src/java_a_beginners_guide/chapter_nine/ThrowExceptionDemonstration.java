package java_a_beginners_guide.chapter_nine;

public class ThrowExceptionDemonstration {
    public static void main(String[] args) {
        //Throwing exception manually and handling them.
        try{
            System.out.println("Before throw.");
            throw new ArithmeticException(); //throwing arithmetic exception manually.
        }catch(ArithmeticException exception) {
            //Catch the exception.
            System.out.println("Exception caught.");
        }
        System.out.println("After try-catch block.");
    }
}
