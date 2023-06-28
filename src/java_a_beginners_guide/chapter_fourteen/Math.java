package java_a_beginners_guide.chapter_fourteen;

public interface Math {

    /**
     * A method that generates random numbers between the initial value
     * and the ending value.
     * @param initialNumber: the beginning point from where the numbers are generated.
     * @param endingNumber: the ending point till the number are generated.
     * @return the any random number generated between the initial and the ending values.
     */
    public double generateRandom(int initialNumber, int endingNumber);
}
