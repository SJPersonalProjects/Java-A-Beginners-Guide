package java_a_beginners_guide.chapter_three;

public class WhileDemonstration {
    public static void main(String[] args) {

        //character is initialized as 'a', which is its starting point.
        char character = 'a';

        //While-loop will keep iterating until the condition becomes false.
        //In this case until z is reached.
        while(character <= 'z') {
            System.out.println("Character : " + character);
            character++; //Here its incremented.
        }
    }
}
