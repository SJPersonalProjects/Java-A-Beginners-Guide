package java_a_beginners_guide.chapter_eight;

public interface Series {
    /**
     * Method to get the next number in the series.
     * @return next number.
     */
    int getNext();

    /**
     * Method to reset the series of numbers.
     */
    void reset();

    /**
     * Method to set the starting value.
     * @param valueX: is the value that will be used for restarting.
     */
    void setStart(int valueX);
}
