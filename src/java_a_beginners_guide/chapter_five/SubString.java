package java_a_beginners_guide.chapter_five;

public class SubString {
    public static void main(String[] args) {
        String originalString = "Java makes the web move.";

        //Construct a sub-string.
        String subString = originalString.substring(5, 18);

        //Displaying both of the strings.
        System.out.println("Original String " + originalString + "\nSub-String " + subString);
    }
}
