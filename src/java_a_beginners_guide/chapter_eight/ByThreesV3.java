package java_a_beginners_guide.chapter_eight;

public class ByThreesV3 implements SeriesInterface{
    //Fields.
    public int startValue;
    public int nextValue;

    /**
     * Constructor to initialize the object with default 0 values.
     */
    public ByThreesV3() {
        startValue = nextValue = 0;
    }

    /**
     * Method implemented from SeriesInterface.
     * Method to add +3 to nextValue everytime it gets called.
     * @return nextValue.
     */
    @Override
    public int getNext() {
        nextValue += 3;
        return nextValue;
    }

    /**
     * Method implemented from SeriesInterface.
     * Method reset the nextValue to startValue which is basically 0.
     */
    @Override
    public void reset() {
        nextValue = startValue;
    }

    /**
     * Method to set the starting value using parameters.
     * @param valueX: is the value that will be used for restarting.
     */
    @Override
    public void setStart(int valueX) {
        nextValue = startValue = valueX;
    }
}
