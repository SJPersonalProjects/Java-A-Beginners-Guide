package java_a_beginners_guide.chapter_eight;

public class ConstanDemonstration implements InterfaceConstants{
    public static void main(String[] args) {
        //1D array of type int.
        int[] numbers = new int[MAX];

        //Traversing through array to put and get elements.
        for(int i = MIN; i < 11; i++) {
            if(i >= MAX) System.out.println(ERRORMESSAGE);
            else {
                numbers[i] = i;
                System.out.print(numbers[i] + " ");
            }
        }
    }
}
