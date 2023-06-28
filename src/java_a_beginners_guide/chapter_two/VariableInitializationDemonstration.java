package java_a_beginners_guide.chapter_two;

/**
 * This class demonstrates the difference of value re-initialization.
 */
public class VariableInitializationDemonstration {
    public static void main(String[] args) {

        int valueX;

        //Loop to iterate over 3 times.
        for(valueX = 0; valueX < 3; valueX++) {
            int valueY = -1;
            System.out.println("valueY is : " + valueY);
            valueY = 100;
            System.out.println("valueY is : " + valueY);
        }
    }
}
