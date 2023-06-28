package java_a_beginners_guide.chapter_nine;

public class NestedTryBlocks {
    public static void main(String[] args) {
        //1D array of type int.
        int[] numbers = {4, 8, 16, 32, 64, 128, 256, 512};
        int[] divider = {2, 0, 4, 4, 0, 8};

        try{
            //Using for loop to divide numbers array by divider array elements.
            for(int i = 0; i < numbers.length; i++) {
                //Inner try, if any DivideByZero exception is generated,
                //it will be caught.
                try {
                    System.out.println(numbers[i] + "/" + divider[i] +
                            " is: " + (numbers[i] / divider[i]));
                }catch(ArithmeticException exception) {
                    //Catches the exception.
                    System.out.println("Can't divide by zero.");
                }
            }
        }catch(ArrayIndexOutOfBoundsException exception) {
            //Catches the exception.
            System.out.println("Exception: ArrayIndexOutOfBoundsException occured.");
            System.out.println("No matching element is found.");
            System.out.println("Fatal Error - Program is terminated.");
        }
    }
}
