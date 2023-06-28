package java_a_beginners_guide.chapter_seven;

public class FinalDemonstration {
    public static void main(String[] args) {
        ErrorMessage errorMessage = new ErrorMessage();

        System.out.println(errorMessage.getErrorMessage(errorMessage.OUTERROR()));
        System.out.println(errorMessage.getErrorMessage(errorMessage.DISKERROR()));
    }
}
