package java_a_beginners_guide.chapter_six;

public class QuickSortDemonstration {
    public static void main(String[] args) {
        //Creating 1D array of type char.
        char[] arrayElements = {'d', 'x', 'a', 'r', 'p', 'j', 'i'};
        int i;

        System.out.print("Original array: ");
        for(i = 0; i < arrayElements.length; i++) {
            System.out.print(arrayElements[i] + " ");
        }

        System.out.println("\n"); //Gap of 2 lines between unsorted and sorted arrays.

        //Now, sort the array.
        QuickSort.quickSort(arrayElements);

        //Sorted Array.
        System.out.print("Sorted array: ");
        for(i = 0; i < arrayElements.length; i++) {
            System.out.print(arrayElements[i] + " ");
        }
    }
}
