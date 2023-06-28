package java_a_beginners_guide.chapter_five;

/**
 * This program illustrates the finding of a minimum and maximum
 * numbers from a list of 1D array of type integer.
 */
public class MinimumAndMaximum {
    public static void main(String[] args) {
        //Creating 1D array of type int.
        int[] numbers = new int[10];
        int minimumValue, maximumValue;

        //Initializing array with random integers (negative or positive)
        numbers[0] = 99;
        numbers[1] = -10;
        numbers[2] = 100123;
        numbers[3] = 18;
        numbers[4] = -978;
        numbers[5] = 5623;
        numbers[6] = 463;
        numbers[7] = -9;
        numbers[8] = 287;
        numbers[9] = 49;

        //Assigning the minimumValue and maximumValue the value of 0th position of array numbers.
        minimumValue = numbers[0];
        maximumValue = numbers[0];

        //Using for loop to find and re-assign the smallest and the largest
        //value in the list to minimumValue and maximumValue variables.
        for(int i = 0; i < 10; i++) {
            if(minimumValue > numbers[i]) minimumValue = numbers[i];
            if(maximumValue < numbers[i]) maximumValue = numbers[i];
        }

        //Prints as the console output.
        System.out.println("The minimum value is : " + minimumValue + "\nThe maximum value is : " + maximumValue);

    }
}
