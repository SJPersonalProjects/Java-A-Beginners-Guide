package java_a_beginners_guide.chapter_five;

public class StringMethods {
    public static void main(String[] args) {
        //String object.
        String stringOne = "When it comes to Web programming Java is #1.";
        String stringTwo = new String(stringOne);
        String stringThree = "Java strings are powerful.";

        //local variables.
        int result, index;
        char character;

        //Using length() method to find the length of stringOne object.
        System.out.println("Length of stringOne : " + stringOne.length());

        for(int i = 0; i < stringOne.length(); i++) {
            System.out.print(stringOne.charAt(i));
        }
        System.out.println(); //A gap of line.

        //Condition to check if stringOne is equal to stringTwo.
        if(stringOne.equals(stringTwo)) System.out.println("stringOne is equals stringTwo.");
        else System.out.println("stringOne doesn't equal to stringTwo.");

        //Checks if stringOne is equal to stringThree.
        if(stringOne.equals(stringThree)) System.out.println("stringOne is equal to stringThree.");
        else System.out.println("stringOne doesn't equal to stringThree.");

        result = stringOne.compareTo(stringThree);
        if(result == 0) {
            System.out.println("stringOne and stringThree are equal.");
        }else if(result < 0) {
            System.out.println("stringOne is less than stringThree.");
        }else {
            System.out.println("stringOne is greater than stringThree.");
        }

        //Assign a new string to stringTwo.
        stringTwo = "One Two Three One";
        index = stringTwo.indexOf("One");
        System.out.println("Index of first occurrence of One: " + index);
        index = stringTwo.lastIndexOf("One");
        System.out.println("Index of last occurrence of One: " + index);

    }
}
