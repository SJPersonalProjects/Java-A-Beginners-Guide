package java_a_beginners_guide.chapter_nine;

public class SuperClassException {
    public static void main(String[] args) {
        //1D array of type int.
        int[] numbers = {4, 8, 16, 32, 64, 128, 256, 512};
        int[] dividers = {2, 0, 4, 4, 0, 8};

        for(int i = 0; i < numbers.length; i++) {
            try{
                System.out.println(numbers[i] + "/" + dividers[i] +
                        " is: " + (numbers[i]/dividers[i]));
            }catch(ArrayIndexOutOfBoundsException exception) {
                //Catch this exception.
                System.out.println("No matching element found.");
            }catch(Throwable exception) {
                System.out.println("Some exception occured.");
            }
        }
    }
}
