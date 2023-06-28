package java_a_beginners_guide.chapter_five;

public class lengthVariableArrayDemonstration {
    public static void main(String[] args) {
        int[] list = new int[10]; // 1D array of type int.
        int[] numbers = {1, 2, 3}; // 1D array of type int with 3 elements.
        int[][] table = {
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9}
        };

        //Printing the length of each array.
        System.out.println("Length of list is : " + list.length);
        System.out.println("Length of numbers is : " + numbers.length);
        System.out.println("Length of table is : " + table.length);
        System.out.println("Length of table[0] is : " + table[0].length);
        System.out.println("Length of table[1] is : " + table[1].length);
        System.out.println("Length of table[2] is : " + table[2].length);

        //Using length to initialize list.
        for(int a = 0; a < list.length; a++) {
            list[a] = a * a;
        }

        System.out.print("Here's list : ");
        //Now use length to display list.
        for(int a = 0; a < list.length; a++) {
            System.out.print(list[a] + " ");
        }
        System.out.println(); //a gap of line.
    }
}
