package java_a_beginners_guide.chapter_thirteen;

public class GenericQueue <T> implements InterfaceGenericQueue<T> {
    //Instance variables.
    private T[] queue; //This array holds the queue.
    private int putLocation, getLocation; //The put and get indices.

    //Construct an empty queue with the given array.
    public GenericQueue(T[] queue) {
        this.queue = queue;
        putLocation = getLocation = 0;
    }

    //Put a character into the queue.
    @Override
    public void put(T character) throws QueueFullException {
        if(putLocation == queue.length) {
            throw new QueueFullException(queue.length);
        }

        queue[putLocation++] = character; //Inserting element into the queue, once space found out.
    }

    //Get a character from the queue.
    @Override
    public T get() throws QueueEmptyException {
        if(getLocation == putLocation) {
            throw new QueueEmptyException();
        }

        return queue[getLocation++]; //Getting the element from the queue, once element found.
    }
}
