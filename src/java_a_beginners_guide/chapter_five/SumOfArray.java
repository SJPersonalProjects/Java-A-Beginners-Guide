package java_a_beginners_guide.chapter_five;

/**
 * this program demonstrates the method to find the sum of all the elements in an array
 * and the method is accomplished using simple for loop.
 */
public class SumOfArray {
    public static void main(String[] args) {
        //1-D Array of type int.
        int[] numbersArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sumOfArray = 0; // variable to store sum of all integers in array.

        for(int a = 0; a < numbersArray.length; a++) sumOfArray += numbersArray[a];

        //Display the total sum of integers in the array.
        System.out.println("Sum of elements in numbersArray: " + sumOfArray);
    }
}
