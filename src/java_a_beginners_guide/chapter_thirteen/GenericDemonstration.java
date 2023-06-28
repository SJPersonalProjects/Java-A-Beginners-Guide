package java_a_beginners_guide.chapter_thirteen;

/**
 * Demonstration of the Generic class.
 */
public class GenericDemonstration {
    public static void main(String[] args) {
        //Create a generic class reference of type Integer.
        Generic<Integer> integerObject;

        //Create a Generic<Integer> object and assign its
        //reference to integerObject. Notice the use of autoboxing
        //to encapsulate the value 88 within an integer object.
        integerObject = new Generic<>(88);

        //Show the type of data used by integerObject.
        integerObject.showType();

        //Get the value in integerObject. Notice that
        //no cast is needed.
        int value = integerObject.getObject();
        System.out.println("Value is: " + value);

        System.out.println();

        //Create a Generic object for Strings.
        Generic<String> stringObject = new Generic<>("Generic Test");

        //Show the type of data being used by stringObject.
        stringObject.showType();

        //Get the value of stringObject. Again, notice
        //that no cast is needed.
        String stringValue = stringObject.getObject();
        System.out.println("String value is: " + stringValue);
    }
}
