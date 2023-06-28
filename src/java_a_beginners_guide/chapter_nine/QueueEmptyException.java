package java_a_beginners_guide.chapter_nine;

public class QueueEmptyException extends Exception{
    public String toString() {
        return "\nQueue is empty.";
    }
}
