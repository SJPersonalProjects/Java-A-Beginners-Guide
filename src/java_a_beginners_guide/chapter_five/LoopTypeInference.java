package java_a_beginners_guide.chapter_five;

public class LoopTypeInference {
    public static void main(String[] args) {
        //1D array of type int.
        int[] numbersArray = new int[]{10, 20, 1, 2, 8, 3, 5, 4};

        //Using for-loop to print the data with type inference feature.
        for(var count = 10.0; count <= 100.0; count += 10.0) System.out.println("Count is : " + count);

        System.out.print("Elements: ");
        //Using for-each style for loop to retrieve the list data.
        for(var elements : numbersArray) {
            System.out.print(elements + " ");
        }
    }
}
