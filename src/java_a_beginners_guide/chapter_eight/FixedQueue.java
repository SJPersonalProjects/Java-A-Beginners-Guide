package java_a_beginners_guide.chapter_eight;

/**
 * A fixed-size queue class for characters.
 */
public class FixedQueue implements ICharacterQueue{
    //Instance fields.
    //Array to hold the queue for characters.
    private final char[] queue;
    //Indices to put and get the location of a character.
    private int putLocation, getLocation;

    /**
     * Construct an empty queue given its size.
     * @param size: size of the array of queue.
     */
    public FixedQueue(int size) {
        queue = new char[size];
        putLocation = getLocation = 0;
    }

    /**
     * Method implemented by the ICharacterQueue Interface.
     * @param character: to store in the queue.
     */
    @Override
    public void put(char character) {
        //Once the putting location reaches to the length of the array
        //it shows the message of queue is full.
        if(putLocation == queue.length) {
            System.out.println("-Queue is full.");
        }
        queue[putLocation++] = character;
    }

    @Override
    public char get() {
        if(getLocation == putLocation) {
            System.out.println("-Queue is empty.");
            return (char) 0;
        }
        return queue[getLocation++];
    }
}
