package java_a_beginners_guide.chapter_seven;

public class MethodOverriding {
    //Instance fields.
    private int valueOne;
    private int valueTwo;

    /**
     * Parameterized constructor to initialize the
     * object of MethodOverriding.
     * @param valueOne: value 1 in the parameter.
     * @param valueTwo: value 2 in the parameter.
     */
    public MethodOverriding(int valueOne, int valueTwo) {
        this.valueOne = valueOne;
        this.valueTwo = valueTwo;
    }

    /**
     * Method to set the value to valueOne variable.
     * @param valueOne: a random value by the user.
     */
    public void setValueOne(int valueOne) {
        this.valueOne = valueOne;
    }

    /**
     * Method to get the value assigned to valueOne.
     * @return valueOne.
     */
    public int getValueOne() {
        return valueOne;
    }

    /**
     * Method to set the value to valueTwo by the user.
     * @param valueTwo: a random value.
     */
    public void setValueTwo(int valueTwo) {
        this.valueTwo = valueTwo;
    }

    /**
     * Method to get the value of valueTwo.
     * @return valueTwo.
     */
    public int getValueTwo() {
        return valueTwo;
    }

    /**
     * Method to display the values assigned to the variables by the user randomly.
     */
    public void showValues() {
        System.out.println("ValueOne and valueTwo: " +
                valueOne + " and " + valueTwo);
    }
}
