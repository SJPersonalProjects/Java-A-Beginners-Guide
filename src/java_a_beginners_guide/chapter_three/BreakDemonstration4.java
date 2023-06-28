package java_a_beginners_guide.chapter_three;

/**
 * This program demonstrates a break statement as a form of goto.
 * and teaches to jump from one block to another.
 */
public class BreakDemonstration4 {
    public static void main(String[] args) {

        //Using break as a form of goto.
        for(int value = 1; value < 4; value++) {
           one:{
                two:{
                    three:{
                        System.out.println("\nvalue is : " + value);
                        if(value == 1) break one;
                        if(value == 2) break two;
                        if(value == 3) break three;

                        //This statement won't be reached.
                        System.out.println("This statement won't execute.");
                    }
                    System.out.println("After block three.");
                }
                System.out.println("After block two.");
           }
           System.out.println("After block one.");
        }
        System.out.println("After for.");
    }
}
