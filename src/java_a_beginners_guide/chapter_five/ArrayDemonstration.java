package java_a_beginners_guide.chapter_five;

/**
 * This program first initializes the 10 elements of array called sample
 * then retrieves the elements using for-loop.
 */
public class ArrayDemonstration {
    public static void main(String[] args) {
        //Creating 1D Array of type integer.
        int[] sample = new int[10];

        //Using for loop to initialize array of integers list.
        for(int i = 0; i < 10; i++) {
            sample[i] = i;
        }

        //Using for loop to retrieve the array list of integers.
        for(int i = 0; i < 10; i++) {
            //Printing the message on every iteration.
            System.out.println("This is sample[" + i + "] : " + sample[i]);
        }
    }
}
