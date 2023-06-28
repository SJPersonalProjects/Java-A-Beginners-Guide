package java_a_beginners_guide.chapter_eight;

public class CircularQueue implements ICharacterQueue{
    //Instance fields.
    //1D array to hold the characters for queue.
    public char[] queue;
    //Indices to get the set the characters in the queue array.
    public int putLocation, getLocation;

    /**
     * Construct an empty queue given its size.
     * @param size: of the queue array.
     */
    public CircularQueue(int size) {
        queue = new char[size];
        putLocation = getLocation = 0;
    }

    /**
     * Put a characters into the queue.
     * @param character: to store in the queue.
     */
    @Override
    public void put(char character) {
        //Queue is full if either putLocation is one less than getLocation.
        //Or putLocation is at the end of the array and getLocation is at the beginning.
        if((putLocation + 1 == getLocation) | (putLocation == queue.length - 1) & (getLocation == 0)) {
            System.out.println("-Queue is full.");
        }
        queue[putLocation++] = character;
        //If putLocation reaches at the end of the array (as it is a circular queue) 0 is assigned to it.
        if(putLocation == queue.length)
            putLocation = 0;
    }

    /**
     * Get a character from a circular queue.
     * @return character.
     */
    @Override
    public char get() {
        if(getLocation == putLocation) {
            System.out.println("-Queue is empty.");
            return (char) 0;
        }

        char character = queue[getLocation++];
        if(getLocation == queue.length) getLocation = 0;
        return character;
    }
}
