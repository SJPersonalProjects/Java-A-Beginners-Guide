package java_a_beginners_guide.chapter_nine;

public class MultiCatch {
    public static void main(String[] args) {
        int value = 88, divider = 0;
        int result;

        //1D array of type char.
        char[] characters = {'A', 'B', 'C'};

        for(int i = 0; i < characters.length; i++) {
            try{
                if(i == 0) result = value / divider; //Gnerates an ArithmeticException.
                else characters[5] = 'X'; //Generates an ArrayIndexOutOfBoundsException.

                //This catch block catches both exceptions.
            }catch(ArithmeticException | ArrayIndexOutOfBoundsException exception) {
                System.out.println("Exception caught: " + exception);
            }
        }

        System.out.println("After mutli-catch.");
    }
}
