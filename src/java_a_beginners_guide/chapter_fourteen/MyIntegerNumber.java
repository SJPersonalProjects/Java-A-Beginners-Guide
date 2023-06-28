package java_a_beginners_guide.chapter_fourteen;

public class MyIntegerNumber {
    private int value;

    MyIntegerNumber(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    //Returns true if number is a factor of value.
    public boolean isFactor(int number) {
        return (value % number) == 0;
    }
}
