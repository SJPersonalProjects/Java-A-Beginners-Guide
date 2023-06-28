package java_a_beginners_guide.chapter_eight;

public class SeriesDemonstration {
    public static void main(String[] args) {
        ByTwos byTwos = new ByTwos();

        for(int i = 0; i < 5; i++) {
            System.out.println("Next value is : " + byTwos.getNext());
        }

        System.out.println("\nResetting");
        byTwos.reset();

        for(int i = 0; i < 5; i++) {
            System.out.println("Next value is : " + byTwos.getNext());
        }

        System.out.println("\nStarting from 100");
        byTwos.setStart(100);
        for(int i = 0; i < 5; i++) {
            System.out.println("Next value is : " + byTwos.getNext());
        }
    }
}
