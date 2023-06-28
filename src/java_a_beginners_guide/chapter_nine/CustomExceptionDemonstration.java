package java_a_beginners_guide.chapter_nine;

public class CustomExceptionDemonstration {
    public static void main(String[] args) {
        //Here number contains some odd values.
        int[] numbers = {4, 8, 15, 32, 64, 127, 256, 512};
        int[] divider = {2, 0, 4, 4, 0, 8};

        for(int i = 0; i < numbers.length; i++) {
            try{
                if(numbers[i] % 2 != 0) {
                    throw new NonIntegerResultException(numbers[i], divider[i]);
                }
                System.out.println(numbers[i] + "/" + divider[i] + " is: " +
                        (numbers[i]/divider[i]));

            }catch(ArithmeticException exception) {
                //Catch the exception.
                System.out.println("Can't divide by zero.");
            }catch(ArrayIndexOutOfBoundsException exception) {
                //Catch the exception.
                System.out.println("No matching element found.");
            }catch(NonIntegerResultException exception) {
                //Catch the exception.
                System.out.println(exception);
            }
        }
    }
}
