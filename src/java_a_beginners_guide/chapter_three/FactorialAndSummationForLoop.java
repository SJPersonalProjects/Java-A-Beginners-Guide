package java_a_beginners_guide.chapter_three;

public class FactorialAndSummationForLoop {
    public static void main(String[] args) {
        int sumOfNumbers = 0, factorialOfNumber = 1;

        //Compute teh factorial of the number through 5.
        for(int i = 1; i <= 5; i++) {
            sumOfNumbers += i; //Calculates the sum of all the numbers.
            factorialOfNumber *= i; //Calculates the factorial of all the numbers.
        }

        //Look, the variable i is not known here, and is considered as a local variable in this case.

        System.out.println("Sum is : " + sumOfNumbers);
        System.out.println("Factorial is : " + factorialOfNumber);
    }
}
