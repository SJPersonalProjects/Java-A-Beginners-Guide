package java_a_beginners_guide.chapter_eight;

public class ByTwosV2 implements Series{
    //Instance fields.
    public int start;
    public int value;
    private int previousValue;

    public ByTwosV2() {
        start = value = 0;
        previousValue = -2;
    }

    @Override
    public int getNext() {
        previousValue = start;
        value += 2;
        return value;
    }

    @Override
    public void reset() {
        value = start;
        previousValue = start -2;
    }

    @Override
    public void setStart(int valueX) {
        start = valueX;
        value = valueX;
        previousValue = start - 2;
    }

    /**
     * Method to always get the previous value of the current value.
     * @return previous value of the current value.
     */
    public int getPreviousValue() {
        return previousValue;
    }
}
