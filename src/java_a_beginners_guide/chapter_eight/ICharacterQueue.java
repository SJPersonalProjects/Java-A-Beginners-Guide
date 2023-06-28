package java_a_beginners_guide.chapter_eight;

public interface ICharacterQueue {
    /**
     * Method to put a character into a queue.
     * @param character: to store in the queue.
     */
    void put(char character);

    /**
     * Method to get the characters from the queue.
     * @return character.
     */
    char get();
}
