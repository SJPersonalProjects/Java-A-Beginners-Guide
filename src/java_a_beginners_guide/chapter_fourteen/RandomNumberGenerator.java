package java_a_beginners_guide.chapter_fourteen;

public class RandomNumberGenerator{
    public static void main(String[] args) {
        
        Math randomNumberGenerator;
        randomNumberGenerator = (initialValue, endingValue) -> java.lang.Math.random() * endingValue;
        System.out.println("Random number generated: " + (int) randomNumberGenerator.generateRandom(1, 20));
    }
}
