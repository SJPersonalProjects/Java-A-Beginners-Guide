package java_a_beginners_guide.chapter_six;

public class Queue {
    //Instance fields.
    //This array holds the values into the array.
    private final char[] characterArray;
    private int putLocation, getLocation;

    /**
     * Constructor to initialize the object of the Queue class.
     * @param size: size of the array.
     */
    public Queue(int size) {
        characterArray = new char[size];
        putLocation = getLocation = 0;
    }

    /**
     * Method used to insert elements into the array.
     * @param characterElement: element passed to insert into the array.
     */
    public void put(char characterElement) {
        if(putLocation == characterArray.length) {
            System.out.println(" - Queue is full");
            return;
        }

        characterArray[putLocation++] = characterElement;
    }

    /**
     * Method used to get elements from the array.
     * @return element from the array based on the given character.
     */
    public char get() {
        if(putLocation == getLocation) {
            System.out.println(" - Queue is empty.");
            return (char) 0;
        }

        return characterArray[getLocation++];
    }
}
