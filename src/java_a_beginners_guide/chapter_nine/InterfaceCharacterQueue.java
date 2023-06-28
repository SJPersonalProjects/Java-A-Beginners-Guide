package java_a_beginners_guide.chapter_nine;

public interface InterfaceCharacterQueue {
    //Put a character into the queue.
    void put(char character) throws QueueFullException;

    //Get a character from the queue.
    char get() throws QueueEmptyException;
}
