package java_a_beginners_guide.chapter_twelve;

/**
 * This class demonstrates autoboxing/auto-unboxing takes place
 * with method parameters and return values.
 */
public class AutoBoxing2 {
    //This method has an Integer parameter.
    public static void valueInteger(Integer valueInteger) {
        System.out.println("valueInteger() received: " + valueInteger);
    }

    //This method returns an int.
    public static int valueInt() {
        return 10;
    }

    //This method returns an Integer.
    public static Integer valueInteger() {
        return 99; //Auto-boxing 99 into an Integer object.
    }

    public static void main(String[] args) {
        //Pass an int to valueInteger(). Because valueInteger() has an Integer
        //parameter, the int value passed is automatically boxed.
        valueInteger(100);

        //Here, Integer object receives the int value returned by valueInt().
        //This value is automatically boxed so that it can be assigned to integerObject.
        Integer integerObject = valueInt();
        System.out.println("Returned value from valueInt(): " + integerObject);

        //Next, valueInteger() is called. It returns an Integer value
        //which is auto-unboxed into an int.
        int integerValue = valueInteger();
        System.out.println("Returned value from valueInteger() is: " + integerValue);

        //Next, math.sqrt() is called with integerObject as an argument.
        //In this case, integerObject is auto-unboxed and its value promoted to double
        //which is the type needed by sqrt().
        System.out.println("Square root of " + integerObject + " is: " + Math.sqrt(integerObject));
    }
}
