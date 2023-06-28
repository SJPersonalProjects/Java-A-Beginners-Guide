package java_a_beginners_guide.chapter_eight;

public class ByTwosV3 implements SeriesInterface{
    //Fields.
    public int startValue;
    public int nextValue;

    /**
     * Constructor to initialize the object with default values.
     */
    public ByTwosV3() {
        startValue = nextValue = 0;
    }

    /**
     * Method implemented from SeriesInterface.
     * It adds +2 in nextValue every time it gets called.
     * @return nextvalue.
     */
    @Override
    public int getNext() {
        nextValue += 2;
        return nextValue;
    }

    /**
     * Method implemented from SeriesInterface.
     * It resets the nextValue field to 0.
     */
    @Override
    public void reset() {
        nextValue = startValue;
    }

    /**
     * Method implemented from SeriesInterface.
     * @param valueX: is the value that will be used for restarting.
     */
    @Override
    public void setStart(int valueX) {
        nextValue = startValue = valueX;
    }
}
