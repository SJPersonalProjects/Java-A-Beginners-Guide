package java_a_beginners_guide.chapter_two;

/**
 * This program demonstrates the difference between logical and relational operators
 */
public class RelationalAndLogicalOperations {
    public static void main(String[] args) {

        int valueOne, valueTwo;
        boolean valueOneB, valueTwoB;

        valueOne = 10;
        valueTwo = 11;

        //These expressions will result to true and therefore output will be generated.
        if(valueOne < valueTwo) System.out.println(valueOne + " is less than " + valueTwo);
        if(valueOne <= valueTwo) System.out.println(valueOne + " is less than or equal to " + valueTwo);
        if(valueOne != valueTwo) System.out.println(valueOne + " is not equal to " + valueTwo);

        //These expressions will result to false and therefore won't show any output.
        if(valueOne == valueTwo) System.out.println(valueOne + " is equal to " + valueTwo);
        if(valueOne > valueTwo) System.out.println(valueOne + " is greater than " + valueTwo);
        if(valueOne >= valueTwo) System.out.println(valueOne + " is greater than or equal to " + valueTwo);

        valueOneB = true;
        valueTwoB = false;

        //Operator & requires both of the operands to be true to result true, therefore, it won't generate any output.
        if(valueOneB & valueTwoB) System.out.println(valueOneB + " & " + valueTwoB + (valueOneB & valueTwoB));
        //Operator | require one of the operands to be true to result true, therefore, it will generate output.
        if(valueOneB | valueTwoB) System.out.println(valueOneB + " | " + valueTwoB + (valueOneB | valueTwoB));
        //Operator ! (NOT) turns the output of a boolean condition into opposite, therefore, it will generate some output.
        if(!(valueOneB & valueTwoB)) System.out.println("!(" + valueOneB + " & " + valueTwoB + ") " + (!(valueOneB & valueTwoB)));
        //Operator ^ (XOR) requires one and only one operand to be true to result in true condition, therefore, it will generate output.
        if(valueOneB ^ valueTwoB) System.out.println(valueOneB + " ^ " + valueTwoB + (valueOneB ^ valueTwoB));
    }
}
