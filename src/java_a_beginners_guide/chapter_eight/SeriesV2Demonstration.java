package java_a_beginners_guide.chapter_eight;

public class SeriesV2Demonstration {
    public static void main(String[] args) {
        ByTwosV2 byTwos = new ByTwosV2();

        int i;

        for(i = 0; i < 5; i++)
            System.out.println("Next value is: " + byTwos.getNext());

        System.out.println("\nResetting");
        byTwos.reset();
        for(i = 0; i < 5; i++)
            System.out.println("Next value is: " + byTwos.getNext());

        System.out.println("\nStarting from 100");
        byTwos.setStart(100);
        for(i = 0; i < 5; i++)
            System.out.println("Next value is: " + byTwos.getNext());


        System.out.println("\n\nPrevious value is: " + byTwos.getPreviousValue());

    }
}
