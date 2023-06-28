package java_a_beginners_guide.chapter_thirteen;

/**
 * This class demonstrates a generic queue class.
 */
public class GenericQueueDemonstration{
    public static void main(String[] args) {
        //Create an integer queue.
        Integer[] iStore = new Integer[10];
        GenericQueue<Integer> queueOne = new GenericQueue<>(iStore);

        Integer integerValue;

        System.out.println("Demonstrate a queue of Integer");
        try{
            for(int i = 0; i < 5; i++) {
                System.out.println("Adding " + i + " to queue.");
                queueOne.put(i); //Put int elements into queue.
            }
        }catch(QueueFullException exception) {
            System.out.println(exception);
        }

        System.out.println(); //Stateemnt for a gap of a line.

        try {
            for(int i = 0; i < 5; i++) {
                System.out.print("Getting next integer from the queue: ");
                integerValue = queueOne.get();
                System.out.println(integerValue);
            }
        }catch(QueueEmptyException exception) {
            System.out.println(exception);
        }

        //Create a double queue.
        Double[] doubleStore = new Double[10];
        GenericQueue<Double> queueTwo = new GenericQueue<>(doubleStore);

        Double doubleValues;

        try{
            for(int i = 0; i < 5; i++) {
                System.out.println("Adding " + (double) i/2 + " to queueTwo.");
                queueTwo.put((double) i/2); //Adding double value to queueTwo.
            }
        }catch(QueueFullException exception) {
            System.out.println(exception);
        }

        System.out.println(); //Statement for a space of line.

        try{
            for(int i = 0; i < 5; i++) {
                System.out.println("Getting next double from queueTwo.");
                doubleValues = queueTwo.get();
                System.out.println(doubleValues);
            }
        }catch(QueueEmptyException exception) {
            System.out.println(exception);
        }

    }
}
