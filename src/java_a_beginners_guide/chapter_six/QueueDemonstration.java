package java_a_beginners_guide.chapter_six;

public class QueueDemonstration {
    public static void main(String[] args) {
        //Queue class objects.
        Queue bigQueue = new Queue(100);
        Queue smallQueue = new Queue(4);

        char characterElements;
        int i;

        System.out.println("Using bigQueue to store the elements:");
        //Put some elements into the bigQueue.
        for(i = 0; i < 26; i++) {
            bigQueue.put((char) ('A' + i));
        }

        //Retrieving elements from the bigQueue.
        for(i = 0; i < 26; i++) {
            characterElements = bigQueue.get();
            if(characterElements != 0) System.out.println(characterElements);
        }

        System.out.println("Using smallQueue to store the elements:");
        //Now, using smallQueue to generate some errors.
        for(i = 0; i < 5; i++) {
            System.out.print("Attempting to store " + (char) ('Z' - i));
            smallQueue.put((char) ('Z' - i));
            System.out.println();
        }

        System.out.println(); //A gap of line.

        System.out.println("Contents of smallQueue: ");
        for(i = 0; i < 5; i++) {
            characterElements = smallQueue.get();
            if(characterElements != 0) System.out.println(characterElements);
        }
    }
}
