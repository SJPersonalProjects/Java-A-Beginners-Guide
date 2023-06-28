package java_a_beginners_guide.chapter_two;

public class ShortCircuitOperators {
    public static void main(String[] args){
        int valueOne, valueTwo;

        valueOne = 10;
        valueTwo = 2;

        if(valueTwo != 0 && (valueOne % valueTwo) == 0) System.out.println(valueTwo + " is a factor of " + valueOne);

        valueTwo = 0; //Now, set the valueTwo to zero.
        if(valueTwo != 0 && (valueOne % valueTwo) == 0) System.out.println(valueTwo + " is a factor of " + valueOne);

        //Now, trying the same thing using a normal AND operator
        //and, it will cause a divide by zero error.
        try {
            if (valueTwo != 0 & (valueOne % valueTwo) == 0)
                System.out.println(valueTwo + " is a factor of " + valueOne);
        } catch (ArithmeticException arithmeticException) {
            //Code here.
            System.out.println("You shouldn't divide any number by zero.");
        }
    }
}
