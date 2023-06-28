package java_a_beginners_guide.chapter_five;

public class LengthVariableDemonstrationV2 {
    public static void main(String[] args) {
        int[] numberOne = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; //1D array of type int has numbers in ascending order.
        int[] numberTwo = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1}; //1D array of type int has numbers in descending order.
        int[] temporaryList = new int[10];

        int a;

        System.out.print("Here's numberOne list (before assignment): ");
        for(a = 0; a < numberOne.length; a++) System.out.print(numberOne[a] + " "); //Extracting values from array numberOne.

        System.out.println(); //Prints a gap of line.

        System.out.print("Here's numberTwo list (before assignment): ");
        for(a = 0; a < numberTwo.length; a++) System.out.print(numberTwo[a] + " "); //Extracting values from array numberTwo.

        //For-loops to swap elements between numberOne array and numberTwo array using temporaryList array.
        for(a = 0; a < temporaryList.length; a++) temporaryList[a] = numberOne[a]; //Assigning values of numberTwo array to numberOne.
        for(a = 0; a < numberOne.length; a++) numberOne[a] = numberTwo[a]; //Assigning numberTwo elements into numberOne array.
        for(a = 0; a < numberTwo.length; a++) numberTwo[a] = temporaryList[a]; //Assigning temporaryList elements into numberTwo array.

        System.out.print("\n\nHere's numberOne list (after assignment): ");
        //Extracting data after swapping data.
        for(a = 0; a < numberOne.length; a++) System.out.print(numberOne[a] + " ");

        System.out.println(); //Prints a gap of line.

        System.out.print("Here's numberTwo list (after assignment): ");
        //Extracting data after swapping data.
        for(a = 0; a < numberTwo.length; a++) System.out.print(numberTwo[a] + " ");

        System.out.println(); //Prints a gap of line.
    }
}
