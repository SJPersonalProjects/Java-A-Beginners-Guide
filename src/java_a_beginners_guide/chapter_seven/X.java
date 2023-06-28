package java_a_beginners_guide.chapter_seven;

public class X {
    //Instance field.
    private int valueX;

    public X(int valueX) {
        this.valueX = valueX;
    }

    /**
     * Method to set the valueX a value.
     * @param valueX: parameter of random value.
     */
    public void setValueX(int valueX) {
        this.valueX = valueX;
    }

    /**
     * Method to get the valueX as random value.
     * @return valueX.
     */
    public int getValueX() {
        return valueX;
    }
}
