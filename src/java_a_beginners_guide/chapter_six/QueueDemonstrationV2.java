package java_a_beginners_guide.chapter_six;

public class QueueDemonstrationV2 {
    public static void main(String[] args) {
        //Construct 10-elements empty queue.
        QueueV2 queue1 = new QueueV2(10);

        //Creating 1D array of type char.
        char[] charElements = {'T', 'O', 'M'};
        //Construct queue from array.
        QueueV2 queue2 = new QueueV2(charElements);

        char character;
        int i;

        //Put some characters into queue1.
        for(i = 0; i < 10; i++) {
            queue1.put((char) ('A' + i));
        }

        //Construct a queue from another queue.
        QueueV2 queue3 = new QueueV2(queue1);

        //Show the queues...
        System.out.print("Contents of queue1: ");
        for(i = 0; i < 10; i++) {
            character = queue1.get();
            System.out.print(character + " "); //Displaying elements.
        }

        System.out.println("\n"); //gap of two lines.

        System.out.print("Contents of queue2: ");
        for(i = 0; i < 3; i++) {
            character = queue2.get();
            System.out.print(character + " "); //Displaying elements.
        }

        System.out.println("\n"); //gap of two lines.

        System.out.print("Contents of queue3: ");
        for(i = 0; i < 10; i++) {
            character = queue3.get();
            System.out.print(character + " "); //Displaying elements.
        }
    }
}
