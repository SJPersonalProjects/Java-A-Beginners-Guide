package java_a_beginners_guide.chapter_eight;

public class ByThrees implements Series{
    //Instance fields.
    private int startValue;
    private int nextValue;
    private int previousValue;

    public ByThrees() {
        startValue = nextValue = 0;
        previousValue = - 3;
    }
    @Override
    public int getNext() {
        previousValue = nextValue;
        nextValue += 3;
        return nextValue;
    }

    @Override
    public void reset() {
        previousValue = startValue - 3;
        nextValue = startValue;
    }

    @Override
    public void setStart(int valueX) {
        startValue = nextValue = valueX;
        previousValue = startValue - 3;
    }

    /**
     * Method to get the previous value by -3 from the current value.
     * @return previousValue;
     */
    public int getPreviousValue() {
        return previousValue;
    }
}
