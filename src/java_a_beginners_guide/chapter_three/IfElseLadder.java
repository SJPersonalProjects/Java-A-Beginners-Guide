package java_a_beginners_guide.chapter_three;

public class IfElseLadder {
    public static void main(String[] args) {

        //Loops through if-else-if ladder to execute each statement as required.
        for(int count = 0; count <= 5; count++) {
            if(count == 1) {
                System.out.println("Count is on " + count);
            }else if(count == 2) {
                System.out.println("Count is on " + count);
            }else if(count == 3) {
                System.out.println("Count is on " + count);
            }else if(count == 4) {
                System.out.println("Count is on " + count);
            }else {
                System.out.println("Count is not between 1 and 4");
            }
        }
    }
}
