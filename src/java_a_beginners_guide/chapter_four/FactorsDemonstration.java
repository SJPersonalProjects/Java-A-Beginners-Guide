package java_a_beginners_guide.chapter_four;

public class FactorsDemonstration {
    public static void main(String[] args) {
        Factors factor = new Factors();

        //Conditional statements to find the factors of first values.
        if(factor.isFactor(2, 20)) System.out.println("2 is factor of 20");
        if(factor.isFactor(3, 20)) System.out.println("2 is factor of 30");
        if(factor.isFactor(3, 90)) System.out.println("3 is factor of 90");
    }
}
