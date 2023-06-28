package java_a_beginners_guide.chapter_five;

public class SquaresMultidimensionalArray {
    public static void main(String[] args) {
        //Creating and initializing 2D array.
        int[][] squares = {
                {1, 1},
                {2, 4},
                {3, 9},
                {4, 16},
                {5, 25},
                {6, 36},
                {7, 49},
                {8, 64},
                {9, 81},
                {10, 100},
        };

        //Extracting values from 2D array.
        for(int a = 0; a < 10; a++) {
            for(int b = 0; b < 2; b++) {
                System.out.print(squares[a][b] + " ");
            }
            System.out.println();
        }
    }
}
