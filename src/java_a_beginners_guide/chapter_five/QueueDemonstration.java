package java_a_beginners_guide.chapter_five;

public class QueueDemonstration {
    //Instance fields.
    char[] queue; //this array holds the elements in the queue.
    int putLocation; //this variable is used as index for inserting elements in the queue.
    int getLocation; //this variable is used as index for retrieving elements in the queue.

    /**
     * Parameterized constructor to initialize the object.
     * @param size: variable to that determines the size of queue array.
     */
    public QueueDemonstration(int size) {
        queue = new char[size];
        putLocation = getLocation = 0; //both indices are zero initially.
    }

    /**
     * Method used to insert elements in the queue.
     * @param character: character which is inserted as an element.
     */
    public void put(char character) {
        if(putLocation == queue.length) {
            System.out.println("-- Queue is full");
            return;
        }

        queue[putLocation++] = character;
    }

    /**
     * Method used to retrieve elements from the queue.
     * @return first inserted element from the queue.
     */
    public char get() {
        if(getLocation == putLocation) {
            System.out.println("-- Queue is empty");
            return (char) 0;
        }

        return queue[getLocation++];
    }
}
