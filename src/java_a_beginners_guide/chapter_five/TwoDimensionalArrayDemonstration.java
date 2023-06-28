package java_a_beginners_guide.chapter_five;

public class TwoDimensionalArrayDemonstration {
    public static void main(String[] args) {
        //Creating 2D array of type integer.
        int[][] tableOfNumbers = new int[3][4];

        //Using for-loop to initialize and extract values from array at the same time.
        for(int a = 0; a < 3; a++) {
            for(int b = 0; b < 4; b++) {
                tableOfNumbers[a][b] = (a * 4) + b + 1; //Initializing array.
                System.out.print(tableOfNumbers[a][b] + " "); //Extract values by printing as console output.
            }
            System.out.println();//Statement to bring output to the next line.
        }
    }
}
