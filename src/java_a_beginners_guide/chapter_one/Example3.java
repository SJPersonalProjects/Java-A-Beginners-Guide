package java_a_beginners_guide.chapter_one;

/**
 * This program demonstrates the difference between the int and double data types
 * using the method of division by 4.
 */
public class Example3 {
    public static void main(String[] args) {
        //Declaring variables of type integer and double.
        int variableInteger;
        double variableDouble;

        variableInteger = 10; //Assigns variableInteger the value 10.
        variableDouble = 10.0; //Assigns variableDouble the value 10.0

        //Printing the original values of both variables.
        System.out.println("Original value of variableInteger : " + variableInteger);
        System.out.println("Original value of variableDouble : " + variableDouble);

        //Printing a blank line on console output.
        System.out.println();

        //Now, dividing both variable by 4.
        variableInteger = variableInteger / 4;
        variableDouble = variableDouble / 4;

        //Printing the original values of both variables after division.
        System.out.println("variableInteger after division : " + variableInteger);
        System.out.println("variableDouble after division : " + variableDouble);
    }
}
