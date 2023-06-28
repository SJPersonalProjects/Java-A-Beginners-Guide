package java_a_beginners_guide.chapter_six;

public class VarargsV2 {
    /**
     * Method to displays elements from a variable-length-arguments array.
     * @param message: a message that defines the number of arguments in words.
     * @param variableLengthArguments: number of actual arguments passed in.
     */
    public static void vaTest(String message, int... variableLengthArguments) {
        //Displays the message and the numbers of elements.
        System.out.println(message + " " + variableLengthArguments.length);

        System.out.println("Contents: ");
        if(variableLengthArguments.length == 0) System.out.println("Empty.\n");
        else {
            //Using for to iterate through the variable to retrieve data.
            for(int i = 0; i < variableLengthArguments.length; i++)
                //Displays the list of arguments passed to the method.
                System.out.println("Argument " + i + " : " + (variableLengthArguments[i]) + " ");
            System.out.println(); //For a gap of line.
        }
    }

    /**
     * Main method.
     * @param args: 1D array of type String.
     */
    public static void main(String[] args) {
        //Arguments passing to the vaTest method.
        vaTest("Five Arguments", 5, 4, 3, 2, 1);
        vaTest("No Arguments");
        vaTest("Two Arguments", 10, 20);
    }
}
