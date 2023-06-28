package java_a_beginners_guide.chapter_nine;

public class RethrowException {

    public static void generateException() {
        //1D arrays of type integer.
        int[] numbers = {4, 8, 16, 32, 64, 128, 256, 512};
        int[] divider = {2, 0, 4, 4, 0, 8};

        for(int i = 0; i < numbers.length; i++) {
            try{
                System.out.println(numbers[i] + "/" + numbers[i] +
                        " is: " + (numbers[i]/divider[i]));
            }catch(ArithmeticException exception) {
                //catch the exception.
                System.out.println("Can't divide by zero.");
            }catch(ArrayIndexOutOfBoundsException exception) {
                System.out.println("No matching element is found.");
                throw exception; //Throwing the same object of ArrayIndexOutOfBoundsException.
            }
        }
    }
}
