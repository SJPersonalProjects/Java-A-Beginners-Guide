package java_a_beginners_guide.chapter_six;

public class SummationDemonstration {
    public static void main(String[] args) {
        //Summation class objects.
        Summation summationOne = new Summation(100);
        Summation summationTwo = new Summation(summationOne);

        System.out.println("summationOne.sumOfValue: " + summationOne.sumOfValue);
        System.out.println("summationTwo.sumOfValue: " + summationTwo.sumOfValue);
    }
}
