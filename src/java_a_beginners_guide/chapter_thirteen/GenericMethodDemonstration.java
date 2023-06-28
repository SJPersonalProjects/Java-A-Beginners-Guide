package java_a_beginners_guide.chapter_thirteen;

public class GenericMethodDemonstration {
    //Determine if the contents of the two arrays are the same.
    public static <T extends Comparable<T>, V extends T> boolean arrayEqual(T[] arrayT, V[] arrayV) {
        //If array's length differ then arrays differ.
        if(arrayT.length != arrayV.length) {
            return false;
        }

        //Checks if elements in the array's are same.
        for(int i = 0; i < arrayT.length; i++) {
            if(!arrayT[i].equals(arrayV[i])) {
                return false;
            }
        }

        //Returns true if the elements in the array are same.
        //and length of both arrays is the same.
        return true;
    }

    public static void main(String[] args) {
        Integer[] numberOne = {1, 2, 3, 4, 5};
        Integer[] numberTwo = {1, 2, 3, 4, 5};
        Integer[] numberThree = {2, 3, 7, 1, 7, 6};
        Integer[] numberFour = {2, 3, 1, 7, 9, 10, 2, 7, 0};

        if(arrayEqual(numberOne, numberOne)) System.out.println("ArrayOne equals arrayOne");
        if(arrayEqual(numberOne, numberTwo)) System.out.println("ArrayOne equals arrayTwo");
        if(arrayEqual(numberOne, numberThree)) System.out.println("ArrayOne equals arrayThree");
        if(arrayEqual(numberOne, numberFour)) System.out.println("ArrayOne equals arrayFour");

        //Creating an array of doubles.
        Double[] arrayDouble = {1.0, 2.1, 2.2, 1.5, 6.0, 1.9};

        //This won't compile because numberOne and arrayDouble aren't the same.
        //if(arrayEqual(numberOne, arrayDouble)) System.out.println("ArrayOne equals arrayDouble");
    }
}
