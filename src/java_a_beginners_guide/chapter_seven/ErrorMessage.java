package java_a_beginners_guide.chapter_seven;

public class ErrorMessage {
    //Instance fields.
    //Error codes.
    private final int OUTERROR = 0;
    private final int INERROR = 1;
    private final int DISKERROR = 2;
    private final int INDEXERROR = 3;

    /**
     * Accessor methods to get the actual values of
     * these constacnts.
     */
    public int OUTERROR() {
        return OUTERROR;
    }
    public int INERROR() {
        return INERROR;
    }
    public int DISKERROR() {
        return DISKERROR;
    }
    public int INDEXERROR() {
        return INDEXERROR;
    }

    /**
     * 1D array instance variable to keep the error messages
     */
    private final String[] errorMessage = {
            "Output Error",
            "Input Error",
            "Disk Full",
            "Index Out-Of-Bounds"
    };

    /**
     * Method to get the error messages based on the index value.
     * @param index to get the error message.
     * @return error message.
     */
    public String getErrorMessage(int index) {
        if(index >= 0 && index <= 3) return errorMessage[index];
        else return "Invalid Error Code";
    }

}
