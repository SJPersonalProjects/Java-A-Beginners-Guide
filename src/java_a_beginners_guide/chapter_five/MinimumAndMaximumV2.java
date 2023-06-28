package java_a_beginners_guide.chapter_five;

/**
 * This program is the better version (version 2) of the previous program
 * In which we find the minimum and maximum values from the array list of integers
 * Here array list of integer is assigned and created in a single line whereas there was
 * the initialization being done manually.
 */
public class MinimumAndMaximumV2 {
    public static void main(String[] args) {
        //Creating and initializing 1D array of type int.
        int[] numbers = {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};
        int minimumValue = numbers[0] ,maximumValue = numbers[0]; //Assigning the 0th indexed value to both variables.

        //Using for loop to find the minimum and maximum values in the array.
        for(int i = 0; i < 10; i++) {
            if(minimumValue > numbers[i]) minimumValue = numbers[i];
            if(maximumValue < numbers[i]) maximumValue = numbers[i];
        }

        //Printing the output on the console.
        System.out.println("The minimum value : " + minimumValue + "\nThe maximum value : " + maximumValue);
    }
}
