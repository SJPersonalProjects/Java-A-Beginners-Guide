package java_a_beginners_guide.chapter_eight;

public class ByThreesDemonstration {
    public static void main(String[] args) {
        ByThrees byThrees = new ByThrees();

        int i;

        for(i = 0; i < 5; i++)
            System.out.println("Next value is: " + byThrees.getNext());

        System.out.println("\nResetting");
        byThrees.reset();
        for(i = 0; i < 5; i++)
            System.out.println("Next value is: " + byThrees.getNext());

        System.out.println("\nStarting from 100");
        byThrees.setStart(100);
        for(i = 0; i < 5; i++)
            System.out.println("Next value is: " + byThrees.getNext());

        //Displaying previous value by -3 of the current value.
        System.out.println("\nPrevious value is: " + byThrees.getPreviousValue());
    }
}
