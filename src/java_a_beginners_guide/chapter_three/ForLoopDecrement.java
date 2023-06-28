package java_a_beginners_guide.chapter_three;

public class ForLoopDecrement {
    public static void main(String[] args) {
        //Iterative statement to print numbers from 100 to -95 with the decrement of -5.
        for(int number = 100; number > -100; number = number - 5) System.out.println("Number is : " + number);
    }
}
