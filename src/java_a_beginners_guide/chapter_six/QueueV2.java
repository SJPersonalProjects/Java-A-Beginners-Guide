package java_a_beginners_guide.chapter_six;

public class QueueV2 {
    //Instance fields.
    private final char[] queue; //this array holds the queue.
    private int putLocation, getLocation; //these are the indices.

    /**
     * Construct an empty queue and initialize its size.
     * @param size: the size of an array.
     */
    public QueueV2(int size) {
        queue = new char[size]; //Allocate the memory for queue.
        putLocation = getLocation = 0;
    }

    /**
     * This constructor is used to construct a Queue from a Queue.
     * @param object: object of type Queue.
     */
    public QueueV2(QueueV2 object) {
        putLocation = object.putLocation;
        getLocation = object.getLocation;
        this.queue = new char[object.queue.length];

        //Copy elements.
        for(int i = getLocation; i < putLocation; i++) {
            this.queue[i] = object.queue[i];
        }
    }

    /**
     * Construct a queue with initial values.
     * @param character
     */
    public QueueV2(char[] character) {
        putLocation = 0;
        getLocation = 0;
        queue = new char[character.length];

        for(int i = 0; i < character.length; i++) {
            put(character[i]);
        }
    }

    /**
     * Method used to put a character into the queue.
     * @param character: a character to put into the queue as an element.
     */
    public void put(char character) {
        if(putLocation == queue.length) {
            System.out.println(" - Queue is full.");
            return;
        }

        queue[putLocation++] = character;
    }

    /**
     * Get a character form the queue.
     * @return a character from the queue based on the index.
     */
    public char get() {
        if(getLocation == putLocation) {
            System.out.println(" - Queue is empty.");
            return (char) 0;
        }

        return queue[getLocation++];
    }
}
