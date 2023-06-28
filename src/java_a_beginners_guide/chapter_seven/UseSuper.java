package java_a_beginners_guide.chapter_seven;

public class UseSuper {
    public static void main(String[] args) {
        B subClass = new B(100, 10);

        subClass.showValues(); //this statement shows the values of variableI in A and variableI in B.
    }
}
