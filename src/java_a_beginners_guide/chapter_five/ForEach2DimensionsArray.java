package java_a_beginners_guide.chapter_five;

/**
 * This program demonstrates the detailed use of for-each style for loop
 * and uses the 2D array and retrieves values.
 */
public class ForEach2DimensionsArray {
    public static void main(String[] args){
        //Creating a 2D Array of type int.
        //Array has 3 rows and 5 columns.
        int[][] numbersArray = new int[3][5];

        //using for loop to insert some values.
        for(int x = 0; x < 3; x++) {
            for(int y = 0; y < 5; y++) {
                numbersArray[x][y] = (x + 1) * (y + 1);
            }
        }

        //Variable to use to compute the sum of all the elements.
        int sumOfElements = 0;

        //Using for-each style for loop to retrieve values.
        for(int[] x: numbersArray) {
            for(int y : x) {
                System.out.println("Value is : " + y);
                sumOfElements += y;
            }
        }

        //Sum of all the elements displayed on console.
        System.out.println("Summation : " + sumOfElements);
    }
}
