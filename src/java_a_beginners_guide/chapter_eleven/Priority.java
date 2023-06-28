package java_a_beginners_guide.chapter_eleven;

public class Priority implements Runnable{
    //Instance fields.
    int count;
    Thread mThread;

    public static boolean stop = false;
    public static String currentName;

    /**
     * Construct a new thread.
     * @param threadName: name of the thread.
     */
    public Priority(String threadName) {
        mThread = new Thread(this, threadName);
        count = 0;
        currentName = threadName;
    }

    public void run() {
        System.out.println(mThread.getName() + " starting.");
        do{
            count++;

            if(currentName.compareTo(mThread.getName()) != 0) {
                currentName = mThread.getName();
                System.out.println("In " + currentName);
            }
        }while(stop == false && count < 10000000);
        stop = true;

        System.out.println("\n" + mThread.getName() + " terminating");
    }
}
