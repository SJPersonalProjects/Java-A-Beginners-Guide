package java_a_beginners_guide.chapter_thirteen;

public class GenericMethodDemonstration1 {
    /**
     * Method to determine if the contents of the two array are the same.
     */
    public static <T extends Comparable<T>, V extends T> boolean
        arrayEqual(T[] x, V[] y) {
        if(x.length != y.length) return false; //Array contents length differ.

        for(int i = 0; i < x.length; i++) {
            if(!x[i].equals(y[i])) return false; //Checks if contents of the array are same.
        }

        return true; //Returns true because now length and contents of the array is same.
    }

    public static void main(String[] args) {
        Integer[] number1 = {1, 2, 3, 4, 5};
        Integer[] number2 = {1, 2, 3, 4, 5};
        Integer[] number3 = {1, 2, 7, 4, 5};
        Integer[] number4 = {1, 2, 7, 4, 5, 6};

        if(arrayEqual(number1, number1))
            System.out.println("number1 equals number1");

        if(arrayEqual(number1, number2))
            System.out.println("number1 equals number2");

        if(arrayEqual(number1, number3))
            System.out.println("number1 equals number3");

        if(arrayEqual(number1, number4))
            System.out.println("number1 equals number4");

        //Create an array of doubles...
        Double[] arrayOfDouble = {1.1, 1.2, 1.3, 1.4, 1.5};

        //This won't compile because numbers and arrayOfDouble
        //aren't the same.
//        if(arrayEqual(number1, arrayOfDouble))
//            System.out.println("number1 equals arrayOfDouble");


    }
}
