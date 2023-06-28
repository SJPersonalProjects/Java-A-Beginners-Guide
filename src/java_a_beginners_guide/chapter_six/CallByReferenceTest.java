package java_a_beginners_guide.chapter_six;

public class CallByReferenceTest {
    //Instance fields.
    public int valueOne, valueTwo;

    public CallByReferenceTest(int valueOne, int valueTwo) {
        this.valueOne = valueOne;
        this.valueTwo = valueTwo;
    }

    /**
     * call-by-reference. Now, object.valueOne and object.valueTwo in the object
     * used in the arguments will be changed.
     * @param object
     */
    public void change(CallByReferenceTest object) {
        object.valueOne = object.valueOne + object.valueTwo;
        object.valueTwo = -object.valueTwo;
    }
}
