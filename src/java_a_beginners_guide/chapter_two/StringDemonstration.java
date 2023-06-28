package java_a_beginners_guide.chapter_two;

/**
 * This program demonstrates Java's new feature called escape sequence
 * with the practice of String literals which is also new.
 */
public class StringDemonstration {
    public static void main(String[] args) {

        //In this line we're using a special escape sequence
        //that simply takes us to the new/next line.
        System.out.println("First line\nSecond line");
        //And here we are using another escape sequence
        //that brings a space of a tag in each character.
        System.out.println("A\tB\tC");
        System.out.println("D\tE\tF");
    }
}
