package java_a_beginners_guide.chapter_five;

public class StringArrays {
    public static void main(String[] args) {
        //1D array of type String.
        String[] stringArray = new String[]{"This", "is", "a", "test"};

        System.out.print("Original array: ");
        //Using for-each style for loop to retrieve the array elements.
        for(String elements : stringArray) {
            System.out.print(elements + " ");
        }

        System.out.println("\n"); //brings two gaps of lines.

        //Updating the values of the below indexed values.
        stringArray[1] = "was";
        stringArray[2] = "test";
        stringArray[3] = "too!";

        System.out.print("Updated array: ");
        //Using for-each style for loop to retrieve the array elements.
        for(String elements : stringArray) {
            System.out.print(elements + " ");
        }
    }
}
