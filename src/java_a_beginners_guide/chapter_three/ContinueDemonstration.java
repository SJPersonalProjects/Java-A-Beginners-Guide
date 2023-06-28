package java_a_beginners_guide.chapter_three;

public class ContinueDemonstration {
    public static void main(String[] args) {

        for(int value = 0; value < 100; value++) {
            if(value % 2 != 0) continue;
            System.out.println(value);
        }
    }
}
