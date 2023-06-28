package java_a_beginners_guide.chapter_six;

public class ErrorInfo {
    //Instance fields.
    String[] errorInfo = {
            "Output Error",
            "Input Error",
            "Disk Full",
            "Index-Out-Of-Bounds"
    };

    int[] howBadIsError = {3, 3, 2, 4};

    Error getErrorInfo(int index) {
        if(index >= 0 && index < errorInfo.length) {
            return new Error(errorInfo[index], howBadIsError[index]);
        }else {
            return new Error("Invalid Error Code", 0);
        }
    }
}
