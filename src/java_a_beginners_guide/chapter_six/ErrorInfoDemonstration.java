package java_a_beginners_guide.chapter_six;

public class ErrorInfoDemonstration {
    public static void main(String[] args) {
        ErrorInfo errorInfo = new ErrorInfo();
        Error error;

        error = errorInfo.getErrorInfo(2);
        System.out.println("Error message: " + error.errorMessage + "\nSeverity: " + error.severity);

        error = errorInfo.getErrorInfo(19);
        System.out.println("Error message: " + error.errorMessage + "\nSeverity: " + error.severity);
    }
}
