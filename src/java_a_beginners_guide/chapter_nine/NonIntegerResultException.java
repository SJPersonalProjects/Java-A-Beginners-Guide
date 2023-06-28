package java_a_beginners_guide.chapter_nine;

public class NonIntegerResultException extends Exception{
    //Instance fields.
    int n;
    int d;

    public NonIntegerResultException(int n, int d) {
        this.n = n;
        this.d = d;
    }
    public String toString() {
        return "Result of " + n + "/" + d +
                " is non-integer.";
    }
}
