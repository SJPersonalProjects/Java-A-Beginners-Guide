package java_a_beginners_guide.chapter_twelve;

public class AutoBoxing {
    public static void main(String[] args) {
        Integer integerObject = 100; //Auto-box an integer value.

        int i = integerObject; //Auto-unbox an Integer value.

        //Printing both the values.
        System.out.println(i + " " + integerObject);
    }
}
