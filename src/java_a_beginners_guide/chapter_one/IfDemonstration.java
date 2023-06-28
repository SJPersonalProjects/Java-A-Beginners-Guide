package java_a_beginners_guide.chapter_one;

/**
 * This program introduces to a java's new feature
 * if statement that controls the flow of a program.
 */
public class IfDemonstration {
    public static void main(String[] args) {
        int variableA, variableB, variableC; //Declaring 3 variables of type integer.

        variableA = 2;
        variableB = 3;

        //if statement checks, if the value of variableA is less than the value of variableB.
        //if it is then it executes the statement otherwise bypasses it.
        if(variableA < variableB) System.out.println("variableA is less than variableB");

        //Since both variables have different values, this statement won't execute.
        if(variableA == variableB) System.out.println("You won't see this statement being executed.");

        System.out.println(); //A gap of a line on console output.

        variableC = variableA - variableB; //variableC contains -1

        System.out.println("variableC contains -1");
        //Checks and outputs the only statement that results to true.
        if(variableC >= 0) System.out.println("variableC is non-negative");
        if(variableC < 0) System.out.println("variableC is negative");

        System.out.println();

        variableC = variableB - variableA; //variableC contains 1.

        System.out.println("variableC contains 1.");
        if(variableC >= 0) System.out.println("variableC is non-negative");
        if(variableC < 0) System.out.println("variableC is negative");
    }
}
