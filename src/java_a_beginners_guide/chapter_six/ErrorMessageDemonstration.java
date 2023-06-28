package java_a_beginners_guide.chapter_six;

public class ErrorMessageDemonstration {
    public static void main(String[] args) {
        //ErrorMessage class object.
        ErrorMessage errorMessage = new ErrorMessage();

        System.out.println("Error Message at index " + 2 + ": " + (errorMessage.getErrorMessage(2)));
        System.out.println("Error Message at index " + 10 + ": " + (errorMessage.getErrorMessage(10)));
        System.out.println("Error Message at index " + 3 + ": " + (errorMessage.getErrorMessage(3)));
    }
}
