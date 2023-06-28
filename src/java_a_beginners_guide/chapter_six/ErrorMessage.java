package java_a_beginners_guide.chapter_six;

public class ErrorMessage {
    //Instance fields.
    private final String[] errorMessage = {
            "Output Error",
            "Input Error",
            "Disk Full",
            "Index Out-of-Bounds"
    };

    //Return the error message.
    public String getErrorMessage(int indexValue) {
        if(indexValue >= 0 && indexValue < errorMessage.length) {
            return errorMessage[indexValue];
        }

        return "Invalid Error Code";
    }
}
