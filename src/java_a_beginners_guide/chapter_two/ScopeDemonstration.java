package java_a_beginners_guide.chapter_two;

/**
 * This class demonstrates the difference of variable scope.
 */
public class ScopeDemonstration {
    public static void main(String[] args) {
        int valueX; //Known to all the code within the main.
        valueX = 10;

        if(valueX == 10) {
            int valueY = 20; //Known only to this block.
            //valueX and valueY are known here.
            System.out.println("valueX and valueY : " + valueX + " " + valueY);
            valueX = valueY * 2;
        }

        //Error: valueY not known here.
        //valueY = 100;

        //valueX is still known here and is updated as well.
        System.out.println("valueX is " + valueX);
    }
}
