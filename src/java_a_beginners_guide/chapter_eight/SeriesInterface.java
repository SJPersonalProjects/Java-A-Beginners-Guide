package java_a_beginners_guide.chapter_eight;

public interface SeriesInterface {
    /**
     * Method to get the next number in the series.
     * @return the next number.
     */
    int getNext();

    /**
     * Method to reset the number in the series.
     */
    void reset();

    /**
     * Method to set the starting value.
     * @param valueX: is the value that will be used for restarting.
     */
    void setStart(int valueX);
}
