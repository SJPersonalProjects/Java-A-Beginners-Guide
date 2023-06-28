package java_a_beginners_guide.chapter_thirteen;

/**
 * A generic queue interface.
 * @param <T>: a placeholder that represents any valid data-type.
 */
public interface InterfaceGenericQueue<T>{
    //Put an item into the queue.
    void put(T character) throws QueueFullException;

    //Get an item from the queue.
    T get() throws QueueEmptyException;
}
