package java_a_beginners_guide.chapter_eight;

public class DynamicQueue implements ICharacterQueue{
    //Instance fields.
    //Array to hold the characters for the queue.
    private char[] queue;
    //Indices to get and set the characters from the queue class.
    private int putLocation, getLocation;

    /**
     * Construct an empty queue given its size.
     * @param size: of an array to hold the characters.
     */
    public DynamicQueue(int size) {
        queue = new char[size];
        putLocation = getLocation = 0;
    }

    /**
     * Put a character into queue.
     * @param character: to store in the queue.
     */
    @Override
    public void put(char character) {
        if(putLocation == queue.length) {
            //Increase queue size.
            char[] increasedSize = new char[queue.length * 2];

            //Copy elements into this new queue.
            for(int i = 0; i < queue.length; i++) {
                increasedSize[i] = queue[i];
            }
            queue = increasedSize;
        }

        queue[putLocation++] = character;
    }

    /**
     * Get a character from the queue.
     * @return character.
     */
    @Override
    public char get() {
        if(putLocation == getLocation) {
            System.out.println("-Queue is empty.");
            return (char) 0;
        }
        return queue[getLocation++];
    }
}
