package java_a_beginners_guide.chapter_seven;

public class Y extends X{
    //Instance field.
    private int valueY;

    public Y(int valueX, int valueY) {
        super(valueX);
        this.valueY = valueY;
    }

    /**
     * Method to set the valueY a random value.
     * @param valueY: a random value to valueY.
     */
    public void setValueY(int valueY) {
        this.valueY = valueY;
    }

    /**
     * Method to get the random value from valueY.
     * @return a random value assigned to valueY.
     */
    public int getValueY() {
        return valueY;
    }
}
