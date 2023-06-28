package java_a_beginners_guide.chapter_five;

public class Queue {
    public static void main(String[] args) {
        //QueueDemonstration class objects.
        QueueDemonstration bigQueue = new QueueDemonstration(100);
        QueueDemonstration smallQueue = new QueueDemonstration(4);

        char character;
        int i;

        System.out.println("Using bigQueue to store alphabets");
        //Put some numbers in bigQueue.
        for(i = 0; i < 26; i++) {
            bigQueue.put((char) ('A' + i));
        }

        //Retrieving and displaying elements from bigQueue.
        System.out.print("Contents of bigQueue: ");
        for(i = 0; i < 26; i++) {
            character = bigQueue.get();
            if(character != (char) 0) System.out.print(character);
        }

        System.out.println("\n");

        System.out.println("Using small queue to generate errors");
        //Now, use smallQueue to generate some errors.
        for(i = 0; i < 5; i++) {
            System.out.print("Attempting to store " + (char) ('Z' - i));
            smallQueue.put((char) ('Z' - i));
            System.out.println();
        }
        //A gap of line.
        System.out.println();

        //More errors on smallQueue.
        System.out.println("Contents of smallQueue: ");
        for(i = 0; i < 5; i++) {
            character = smallQueue.get();
            if(character != (char) 0) System.out.print(character);
        }
    }
}
