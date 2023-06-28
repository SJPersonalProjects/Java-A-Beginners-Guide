package java_a_beginners_guide.chapter_nine;

public class UseFinally {
    public static void generateException(int what) {
        //1D array of type int.
        int[] numbers = new int[2];
        int t;

        //Receiving the number from parameter.
        System.out.println("Receiving: " + what);

        try{
            switch(what) {
                case 0:
                    t = 10 / what; //Generates divide-by-zero exception.
                    break;
                case 1:
                    numbers[3] = 100; //Generates ArrayIndexOutOfBoundsException.
                    break;
                case 2:
                    break; //Returns from try block.
            }
        }catch(ArithmeticException exception) {
            //Catch the exception.
            System.out.println("Can't divide by zero.");
            return; //Returns from catch block.
        }catch(ArrayIndexOutOfBoundsException exception) {
            //Catch the exceptin.
            System.out.println("No matching element is found.");
        }finally {
            System.out.println("Leaving try block.");
        }
    }
}
