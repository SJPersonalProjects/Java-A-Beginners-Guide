package java_a_beginners_guide.chapter_thirteen;

public class TwoGenericsDemonstration {
    public static void main(String[] args) {

        TwoGenerics<Integer, String> twoGenericsObject = new TwoGenerics<>(88, "Generics");

        //Show the types.
        twoGenericsObject.showTypes();

        //Obtain and shows values.
        int value = twoGenericsObject.getObjectOne();
        System.out.println("Value is: " + value);

        String valueString = twoGenericsObject.getObjectTwo();
        System.out.println("Value is: " + valueString);
    }
}
