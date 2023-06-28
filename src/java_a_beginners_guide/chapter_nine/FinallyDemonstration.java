package java_a_beginners_guide.chapter_nine;

public class FinallyDemonstration {
    public static void main(String[] args) {
        //Using for loop to traverse the whole switch statement
        //to execute each case and generate exceptions tp all types mentioned.
        for(int i = 0; i < 3; i++) {
            UseFinally.generateException(i);
            System.out.println(); //To seperate lines without executions.
        }
    }
}
