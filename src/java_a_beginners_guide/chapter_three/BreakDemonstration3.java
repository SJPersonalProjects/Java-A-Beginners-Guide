package java_a_beginners_guide.chapter_three;

public class BreakDemonstration3 {
    public static void main(String[] args) {

        for(int count = 0; count < 3; count++) {
            System.out.println("Outer loop count : " + count);
            System.out.print("\tInner loop count : ");

            int value =  0;
            while(value < 100) {
                if(value == 10) break;
                System.out.print(value + " ");
                value++;
            }
            System.out.println();
        }
        System.out.println("Loops complete");
    }
}
