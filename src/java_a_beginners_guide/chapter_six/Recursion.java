package java_a_beginners_guide.chapter_six;

public class Recursion {
    public int factorial(int valueN) {
        int result;

        if(valueN == 1) return 1;
        result = factorial(valueN - 1) * valueN;
        return result;
    }
}
