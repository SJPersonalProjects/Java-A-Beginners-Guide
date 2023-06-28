package java_a_beginners_guide.chapter_one;

public class BlockDemonstration {
    public static void main(String[] args) {
        double variableI, variableJ, variableK; //Declaring 3 variables of type double.

        variableI = 5;
        variableJ = 10;

        //Demonstration of a code block using if statement.
        //Also, prevention of division by zero.
        if(variableI != 0) {
            System.out.println("variableI doesn't equal to zero.");
            variableK = variableJ / variableI;
            System.out.println("variableJ / variableI : " + variableK);
        }
    }
}
