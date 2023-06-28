package java_a_beginners_guide.chapter_three;

import java.util.Scanner;
public class InteractiveForLoopTest {
    public static void main(String[] args) {
        //Scanner class object.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter s to quit otherwise keep going.");

        //This for-loop keep iterating until s is entered on the keyboard.
        for(int i = 1; scanner.next().charAt(0) != 's'; i++) {
            System.out.println("Pass #" + i);
        }
    }
}
