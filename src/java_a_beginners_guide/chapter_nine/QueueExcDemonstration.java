package java_a_beginners_guide.chapter_nine;

public class QueueExcDemonstration {
    public static void main(String[] args) {
        //FixedQueue class object.
        FixedQueue fixedQueue = new FixedQueue(10);

        char character;
        int i;

        try{
            //Overrun the queue.
            for(i = 0; i < 11; i++) {
                System.out.print("Attempting to store: " + (char) ('A' + i));
                fixedQueue.put((char) ('A' + i));
                System.out.println("  - OK");
            }
            System.out.println();
        }catch(QueueFullException exception) {
            System.out.println(exception);
        }
        System.out.println();

        try{
            //Over-empty the queue.
            for(i = 0; i < 11; i++) {
                System.out.print("Getting next char: ");
                character = fixedQueue.get();
                System.out.println(character);
            }
        }catch(QueueEmptyException exception) {
            System.out.println(exception);
        }
    }
}
