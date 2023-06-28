package java_a_beginners_guide.chapter_six;

public class Static {
    //Instance field.
    public int valueX;
    //Static field.
    public static int valueY;

    /**
     * Method to return the sum of global variables.
     * @return sum of two global variables.
     */
    public int sum() {
        return valueX + valueY;
    }
}
