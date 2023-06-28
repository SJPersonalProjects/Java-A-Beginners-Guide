package java_a_beginners_guide.chapter_seven;

public class MethodOverridingSub extends MethodOverriding{
    //Instance field.
    private int valueThree;

    /**
     * Parameterized constructor to initialize the object
     * of MethodOverridingSub class.
     * @param valueOne: valueOne.
     * @param valueTwo: valueTwo.
     * @param valueThree: valueThree.
     */
    public MethodOverridingSub(int valueOne, int valueTwo, int valueThree) {
        super(valueOne, valueTwo);
        this.valueThree = valueThree;
    }

    /**
     * Method to set the value to valueThree randomly assigned by the user.
     * @param valueThree: a random value assigned by the user.
     */
    public void setValueThree(int valueThree) {
        this.valueThree = valueThree;
    }

    /**
     * Method to get the value from valueThree randomly assigned by the user.
     * @return valueThree.
     */
    public int getValueThree() {
        return valueThree;
    }

    /**
     * Method to display the value as console output assigned by the user randomly.
     */
    @Override
    public void showValues() {
        System.out.println("valueThree: " + valueThree);
    }
}
