package java_a_beginners_guide.chapter_eight;

public class ICharacterQueueDemonstration {
    public static void main(String[] args) {
        FixedQueue fixedQueue = new FixedQueue(10);
        CircularQueue circularQueue = new CircularQueue(10);
        DynamicQueue dynamicQueue = new DynamicQueue(5);

        ICharacterQueue queueInterface;

        char character;
        int i;

        queueInterface = fixedQueue;
        //Put some characters into fixed queue.
        for(i = 0; i < 10; i++) {
            queueInterface.put((char) ('A' + i));
        }

        //Show the queue.
        System.out.println("Contents of fixed queue: ");
        for(i = 0; i < 10; i++) {
            System.out.print(queueInterface.get());
        }
        System.out.println(); //for a gap of line.

        queueInterface = dynamicQueue;
        //Put some characters into the dynamic queue.
        for(i = 0; i < 10; i++)
            queueInterface.put((char) ('Z' - i));

        //Show the queue.
        System.out.println("Contents of dynamic queue: ");
        for(i = 0; i < 10; i++) {
            character = dynamicQueue.get();
            System.out.print(character);
        }
        System.out.println(); //for a gap of a line.

        queueInterface = circularQueue;
        //Put some characters into circular queue.
        for(i = 0; i < 10; i++) {
            queueInterface.put((char) ('A' + i));
        }

        //Show the queue.
        System.out.println("Contents of circular queue: ");
        for(i = 0; i < 10; i++)
            System.out.print(queueInterface.get());
        System.out.println(); //For a gap of line.

        //Put more characters into circular queue.
        for(i = 10; i < 20; i++) {
            queueInterface.put((char) ('A' + i));
        }

        //Show the characters from the circular queue.
        System.out.println("More contents of circular queue: ");
        for(i = 10; i < 20; i++) {
            character = queueInterface.get();
            System.out.print(character);
        }

        System.out.println(); //For a gap of a line.

        System.out.println("Store and consume from circular queue.");
        //Store and consume from circular queue.
        for(i = 0; i < 20; i++) {
            queueInterface.put((char) ('A' + i));
            character = queueInterface.get();
            System.out.print(character);
        }

    }
}
