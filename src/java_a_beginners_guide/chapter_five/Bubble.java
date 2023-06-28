package java_a_beginners_guide.chapter_five;

/**
 * This program demonstrates the Bubble sort algorithm.
 */
public class Bubble {
    public static void main(String[] args) {
        //Creating and initializing 1D array of type int.
        int[] numbers = {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};

        int i, j, temporary;
        int size = 10; //Number of elements to sort.

        //Display the original array.
        for(int a = 0; a < size; a++) {
            System.out.print(" " + numbers[a]);
        }
        System.out.println(); //Prints a gap of line.

        //Bubble sort algorithm.
        for(i = 0; i < size; i++) {
            //Condition to break the loop if the list is sorted already.
            boolean isSorted = true;
            for(j = 0; j < size - 1 - i; j++) {
                if(numbers[j + 1] < numbers[j]) {
                    //Swapping values when the condition meets.
                    temporary = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temporary;
                    //Makes it false if it's not sorted.
                    isSorted = false;
                }
            }
            System.out.println("Turn #" + i);
            //Breaks it if it's not sorted already or didn't change to false.
            if(isSorted) break;
        }

        //Displaying the sorted array.
        for(i = 0; i < size; i++) {
            System.out.print(" " + numbers[i]);
        }
        System.out.println(); //Prints a gap of line.
    }
}
