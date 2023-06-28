package java_a_beginners_guide.chapter_six;

public class Varargs {

    public static void vaTest(int... variableLengthArguments) {
        System.out.println("Number of args: " + variableLengthArguments.length);

        System.out.println("Contents: ");
        if(variableLengthArguments.length == 0) System.out.println("Empty");
        else {
            //Using for loop to retrieve the data from the variable-length-arguments.
            for (int i = 0; i < variableLengthArguments.length; i++) {
                System.out.println("Argument " + i + " : " + (variableLengthArguments[i]) + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        //Notice that vaTest() can be called with a variable numbers of arguments.
        vaTest(10); //1 argument
        vaTest(1, 2, 3); //3 arguments
        vaTest(); //no arguments
    }
}
