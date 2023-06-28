package java_a_beginners_guide.chapter_fourteen;

public class LambdaExpressionDemonstration2 {
    public static void main(String[] args) {
        //This lambda expression determines if one string is part of another.
        StringTest isIn = (stringOne, stringTwo) -> stringOne.indexOf(stringTwo) != -1;

        String stringText = "This is a test";

        System.out.println("Testing string: " + stringText);

        if(isIn.stringTest(stringText, "is a"))
            System.out.println("is a found");
        else
            System.out.println("is a not found");

        if(isIn.stringTest(stringText, "xyz"))
            System.out.println("xyz found");
        else
            System.out.println("xyz not found");
    }
}
