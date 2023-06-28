package java_a_beginners_guide.chapter_three;

public class BodyLessForLoop {
    public static void main(String[] args) {

        //A simple variable to store the value of sum of all the numbers.
        int sumOfNumbers = 0;
        //Loop starts from 1 and ends at 5 and all the numbers are stored as sum.
        for(int i = 1; i <= 5; sumOfNumbers = sumOfNumbers + i++);
        System.out.println("Sum is : " + sumOfNumbers); //And are printed here.
    }
}
