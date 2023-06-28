package java_a_beginners_guide.chapter_thirteen;

public class SumDemonstration {
    public static void main(String[] args) {
        Summation summation = new Summation(4.0);
        int values = summation.getSum();
        System.out.println("Sum of values from 1 to 4: " + values);
    }
}
