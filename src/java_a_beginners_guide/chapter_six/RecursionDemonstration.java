package java_a_beginners_guide.chapter_six;

public class RecursionDemonstration {
    public static void main(String[] args) {
        //Recursion class object.
        Recursion recursion = new Recursion();

        System.out.println("Factorials using recursion method.");
        System.out.println("Factorial of 3 is : " + recursion.factorial(3));
        System.out.println("Factorial of 4 is : " + recursion.factorial(4));
        System.out.println("Factorial of 5 is : " + recursion.factorial(5));
    }
}
