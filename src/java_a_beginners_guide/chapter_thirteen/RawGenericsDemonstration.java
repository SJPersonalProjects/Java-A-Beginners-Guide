package java_a_beginners_guide.chapter_thirteen;

public class RawGenericsDemonstration {
    public static void main(String[] args) {
        //A generic object for integers.
        RawGenerics<Integer> integerObject = new RawGenerics<>(88);

        //A generic object for String.
        RawGenerics<String> stringObject = new RawGenerics<>("Generics Test");

        //A raw-type generic object with the double value.
        //when no type argument is supplied, a raw type is created.
        RawGenerics rawObject = new RawGenerics(98.6);

        //Cast here is necessary because type is unknown.
        Double doubleValue = (double) rawObject.getObject();
        System.out.println("Double value is: " + doubleValue);

        /**
         * The use of raw-type can lead to run-time exceptions
         * here are some examples.
         */

        //The following cast causes a runtime error.
        int intValue = (Integer) rawObject.getObject(); //runtime error.

        //This assignment overrides type safety.
        stringObject = rawObject; //OK, but potentially wrong.
        //String string = stringObject.getObject(); //runtime error.

        //This assignment also overrides type safety.




    }
}
