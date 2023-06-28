package java_a_beginners_guide.chapter_nine;

//An exception for queue full errors.
public class QueueFullException extends Exception{
    //Instance field.
    int size;

    public QueueFullException(int size) {
        this.size = size;
    }

    public String toString() {
        return "\nQueue is full. Maximum size is: " + size;
    }
}
