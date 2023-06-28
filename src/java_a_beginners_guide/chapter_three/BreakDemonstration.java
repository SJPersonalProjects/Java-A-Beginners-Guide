package java_a_beginners_guide.chapter_three;

public class BreakDemonstration {
    public static void main(String[] args) {

        //End number to terminate the loop.
        int number = 100;

        //Looping through the number sequence and terminate at a certain point
        //using break statement.
        for(int value = 0; value <= number; value++) {
            //using break statement to exit a loop.
            if(value * value >= number) break;
            System.out.print(value + " ");
        }
        System.out.println("Loop completed...");
    }
}
