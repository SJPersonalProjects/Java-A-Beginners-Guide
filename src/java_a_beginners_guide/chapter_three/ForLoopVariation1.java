package java_a_beginners_guide.chapter_three;

public class ForLoopVariation1 {
    public static void main(String[] args) {
        //This for-loop uses initialization and iteration twice
        //and uses both variables in single condition.
        for(int i = 0, j = 10; i < j; i++, j--) {
            System.out.println("i and j : " + i + " " + j);
        }
    }
}
