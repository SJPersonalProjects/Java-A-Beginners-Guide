package java_a_beginners_guide.chapter_two;

public class BooleanDemo {
    public static void main(String[] args) {
        boolean booleanValue;

        booleanValue = false;
        System.out.println("booleanValue is : " + booleanValue);
        booleanValue = true;
        System.out.println("booleanValue is : " + booleanValue);

        //A boolean value can also control the conditional statement.
        if(booleanValue) System.out.println("This is executed.");

        booleanValue = false;
        if(booleanValue) System.out.println("This is not executed.");

        //Outcome of a relational operator is a boolean value.
        System.out.println("10 > 9 is " + (10 > 9));
    }
}
