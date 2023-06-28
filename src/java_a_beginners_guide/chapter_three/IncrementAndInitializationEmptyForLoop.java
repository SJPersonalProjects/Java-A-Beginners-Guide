package java_a_beginners_guide.chapter_three;

public class IncrementAndInitializationEmptyForLoop {
    public static void main(String[] args) {

        //In this variation of the for-loop
        //Initialization and iteration portion is both missing from the parenthesis.
        int count = 1;//Initialized only once.
        for(; count <= 10;) {
            System.out.println("Pass #" + count);
            count++; //Incremented at the end.
        }
    }
}
