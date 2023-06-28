package java_a_beginners_guide.chapter_four;

public class CheckNumberDemonstration {
    public static void main(String[] args) {
        CheckNumber number = new CheckNumber();

        //Conditional statements to check whether the numbers are even or not.
        if(number.isEven(10)) System.out.println("10 is even number.");
        if(number.isEven(9)) System.out.println("9 is even number.");
        if(number.isEven(8)) System.out.println("8 is even number.");
    }
}
