package java_a_beginners_guide.chapter_eight;

public class ByTwos implements Series{
    //Instance fields.
    public int start;
    public int value;

    /**
     * Default constructor to start the values from 0.
     */
    public ByTwos() {
        start = value = 0;
    }

    @Override
    public int getNext() {
        value += 2;
        return value;
    }

    @Override
    public void reset() {
        value = start;
    }

    @Override
    public void setStart(int valueX) {
        start = value = valueX;
    }
}
