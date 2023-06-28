package java_a_beginners_guide.chapter_four;

public class Factors {
    //Method to verify if valueA is the factor of valueB.
    public boolean isFactor(int valueA, int valueB) {
        if(valueB % valueA == 0) return true;

        return false;
    }
}
