package java_a_beginners_guide.chapter_fourteen;

public class LambdaDemonstration {
    public static void main(String[] args) {
        //Reference to the MyValue interface.
        MyValue myValue;

        //Here, a lambda expression is simply a constant expression.
        //When it is assigned to myValue, a class instance is
        //constructed in which the lambda expression implements
        //the getValue() in MyValue.
        myValue = () -> 98.6;

        //Call getValue(), which is provided by the previously assigned lambda expression.
        System.out.println("A constant value: " + myValue.getValue());

        //Now, create a parameterized lambda expression and assign it to a
        //MyParameterValue reference. This lambda expression returns the reciprocal of its argument.
        MyParameterValue myParameterValue = (n) -> 1.0 / n;

        //Call getValue() through the myParameterValue reference.
        System.out.println("Reciprocal of 4 is: " + myParameterValue.getValue(4));
        System.out.println("Reciprocal of 8 is: " + myParameterValue.getValue(8));

        //A lambda expression much be compatible with the method
        //defined by the functional interface. Therefore, these won't work.
//        myValue = () -> "Three";
//        myParameterValue = () -> java.lang.Math.random();
    }
}
