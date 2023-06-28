package java_a_beginners_guide.chapter_five;

public class StringDemonstration {
    public static void main(String[] args) {
        //Creating String objects.
        String stringOne = new String("Java strings are objects.");
        String stringTwo = new String("They are constructed various ways.");
        String stringThree = new String(stringTwo);

        //Printing the values contained by the String objects on the console.
        System.out.println(stringOne);
        System.out.println(stringTwo);
        System.out.println(stringThree);
    }
}
