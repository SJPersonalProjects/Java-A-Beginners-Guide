package java_a_beginners_guide.chapter_three;

public class ForLoopIncrementEmpty {
    public static void main(String[] args) {

        //This for-loop variation is an example
        //In which iteration statement is missing at the end.
        //And is mentioned within the code block.
        for(int i = 0; i <= 9;) {
            System.out.println("Pass #" + i);
            i++; //'i' is incremented inside the code block.
        }
    }
}
