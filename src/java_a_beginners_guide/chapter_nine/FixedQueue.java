package java_a_beginners_guide.chapter_nine;

public class FixedQueue implements InterfaceCharacterQueue{
    //Instance field.
    //This array holds the queue.
    private char queue[];
    //Indices to get and set the elements from the queue.
    private int putLocation, getLocation;

    //Construct an empty queue given its size.
    public FixedQueue(int size) {
        //Allocate the memory from the queue.
        queue = new char[size];
        putLocation = getLocation = 0;
    }

    //Put a character into the queue.
    @Override
    public void put(char character) throws QueueFullException {
        if(putLocation == queue.length) {
            throw new QueueFullException(queue.length);
        }

        queue[putLocation++] = character;
    }

    @Override
    public char get() throws QueueEmptyException {
        if(getLocation == putLocation) {
            throw new QueueEmptyException();
        }

        return queue[getLocation++];
    }
}
