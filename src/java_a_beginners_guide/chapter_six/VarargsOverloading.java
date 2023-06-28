package java_a_beginners_guide.chapter_six;

public class VarargsOverloading {
    public static void vaTest(int... variableLengthArguments) {
        System.out.println("vaTest(int... variableLengthArguments):\n" +
                "Number of arguments: " + variableLengthArguments.length);

        System.out.println("Contents: ");
        if(variableLengthArguments.length == 0) System.out.println("Empty.\n");
        else {
            //Using for loop to retrieve data from the variable-length arguments.
            for(int i = 0; i < variableLengthArguments.length; i++)
                System.out.println("Argument " + i + " : " + (variableLengthArguments[i]));
        }
        System.out.println(); //For a gap of a line.
    }

    public static void vaTest(boolean... variableLengthArguments) {
        System.out.println("vaTest(boolean... variableLengthArguments):\n" +
                "Number of arguments: " + variableLengthArguments.length);

        System.out.println("Contents: ");
        if(variableLengthArguments.length == 0) System.out.println("Empty.\n");
        else {
            //Using for loop to retrieve data from the variable-length arguments.
            for(int i = 0; i < variableLengthArguments.length; i++)
                System.out.println("Argument " + i + " : " + (variableLengthArguments[i]));
        }
        System.out.println(); //For a gap of a line.
    }

    public static void vaTest(String message, int... variableLengthArguments) {
        System.out.println("vaTest(String message, int... variableLengthArguments)\n" +
                message + ": " + variableLengthArguments.length);

        System.out.println("Contents: ");
        if(variableLengthArguments.length == 0) System.out.println("Empty.\n");
        else {
            //Using for loop to retrieve data from the variable-length arguments.
            for(int i = 0; i < variableLengthArguments.length; i++)
                System.out.println("Argument " + i + " : " + (variableLengthArguments[i]));
        }
        System.out.println();
    }


    /**
     * Main method.
     * @param args: 1D array of type string.
     */
    public static void main(String[] args) {
        vaTest(5, 2, 10);
        vaTest(true, false, true, true);
        vaTest("Three number of arguments", 10, 20, 30);
    }
}
