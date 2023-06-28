package java_a_beginners_guide.chapter_six;

import java.util.Scanner;

/**
 * This program illustrates the non-recursive way to calculate
 * the factorial of a number 'N'.
 */
public class Factorial {
    public static void main(String[] args) {
        //Scanner class object.
        Scanner scanner = new Scanner(System.in);


        System.out.println("Please enter the number to calculate the factorial");
        System.out.print("Number: ");
        int factorialOf = scanner.nextInt(); //Getting input using scanner class.
        int factorial = 1;

        //A non-recursive way to calculate factorial of number N.
        for(int i = 1; i <= factorialOf; i++) factorial = factorial * i;

        System.out.println("Factorial of " + factorialOf + ": " + factorial); //Displaying result as console output.
    }
}
