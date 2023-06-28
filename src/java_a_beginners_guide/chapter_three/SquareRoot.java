package java_a_beginners_guide.chapter_three;

public class SquareRoot {
    public static void main(String[] args) {
        double value, squareRoot;

        //Using for-loop to iterate from 1 to 100
        //and find the square root of each number that follows the iteration.
        for(value = 1.0; value < 100.0; value++) {
            squareRoot = Math.sqrt(value);
            System.out.println("Square root of " + value + " is " + squareRoot);

            //Compute rounding errors.
            double roundingError = value - (squareRoot * squareRoot);
            System.out.println("Rounding error is : " + roundingError);
            System.out.println();
        }
    }
}
