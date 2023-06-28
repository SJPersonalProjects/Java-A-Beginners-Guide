package java_a_beginners_guide.chapter_thirteen;

/**
 * An exception for queue full error.
 */
public class QueueFullException extends Exception{
    int size;

    QueueFullException(int size) {
        this.size = size;
    }

    /**
     * Method to return a message when the QueueFullException occurs.
     * @return message for queue-full exception.
     */
    public String toString() {
        return "\nQueue is full. Maximum size is: " + size;
    }
}
