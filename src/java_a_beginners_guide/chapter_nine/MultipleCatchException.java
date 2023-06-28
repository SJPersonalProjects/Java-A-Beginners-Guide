package java_a_beginners_guide.chapter_nine;

public class MultipleCatchException {
    public static void main(String[] args) {
        //1D array of type integers.
        int[] numbers = new int[]{4, 8, 16, 32, 64, 128, 256, 512};
        int[] dividers = new int[]{2, 0, 4, 4, 0, 8};

        for(int i = 0; i < numbers.length; i++) {
            try{
                System.out.println(numbers[i] + "/" + dividers[i] +
                        " is: " + (numbers[i]/dividers[i]));
            }catch(ArithmeticException exception) {
                //Catch the exception.
                System.out.println("Can't divide by zero.");
            }catch(ArrayIndexOutOfBoundsException exception) {
                //Catch the exception.
                System.out.println("No matching element found.");
            }
        }
    }
}
