package java_a_beginners_guide.chapter_five;

/**
 * This program demonstrates the computation of sum of an array
 * the method is achieved using for-each style for loop.
 */
public class SumOfArrayV2 {
    public static void main(String[] args){
        //1-D array of type int.
        int[] numbersArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sumOfNumbers = 0;

        //using for-each style for loop to compute the sum of all
        //the elements in the array above.
        for(int a : numbersArray) {
            //This line computes the sum.
            //After each iterate one single value from the array
            //is passed to a from the array object.
            sumOfNumbers += a;

        }

        //Displaying the sum of elements on console.
        System.out.println("Sum of array: " + sumOfNumbers);
    }
}
