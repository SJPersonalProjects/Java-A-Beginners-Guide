package java_a_beginners_guide.chapter_thirteen;

public class Summation {
    //Instance variable.
    private int sum;

    public <T extends Number> Summation(T arguments) {
        sum = 0;

        //Using for loop to calculate the sum of all Integer values.
        for(int i = 1; i <= arguments.intValue(); i++) {
            sum = sum + i;
        }
    }

    public int getSum() {
        return sum;
    }
}
