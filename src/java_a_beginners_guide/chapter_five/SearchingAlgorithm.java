package java_a_beginners_guide.chapter_five;

public class SearchingAlgorithm {
    public static void main(String[] args) {
        //1D Array of type int.
        int[] numbersArray = new int[]{1, 10, 5, 2, 6, 3, 19, 0, -1, -20, 4};
        int valueToFind = 19;
        boolean isFound = false;

        for(int x : numbersArray) {
            if(x == valueToFind) {
                System.out.print(x);
                isFound = true;
                break;
            }
        }

        if(isFound) System.out.print(" value found!");

    }
}
