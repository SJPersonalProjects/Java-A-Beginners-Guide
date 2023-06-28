package java_a_beginners_guide.chapter_nine;

public class DivideByZeroException {
    public static void main(String[] args) {
        //1D arrays of type int.
        int[] numbers = {4, 8, 16, 32, 64, 128};
        int[] divider = {2, 0, 4, 4, 0, 8};

        //Using for loop to traverse the whole numbers array.
        //To divide the numbers array with each divider element.
        for(int i = 0; i < numbers.length; i++) {
            try {
                System.out.println(numbers[i] + "/" + divider[i] +
                        " is: " + (numbers[i] / divider[i]));
            } catch (ArithmeticException exception) {
                //Catch the exception.
                System.out.println("Can't divide by zero.");
            }
        }
    }
}
