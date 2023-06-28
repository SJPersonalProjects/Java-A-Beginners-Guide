package java_a_beginners_guide.chapter_six;

public class MyClass {
    //Instance fields.
    private int alpha; //private access.
    public int beta; //public access.
    int gama; //default access.

    public void setAlpha(int alpha) {
        this.alpha = alpha;
    }
    public int getAlpha() {
        return alpha;
    }
}
