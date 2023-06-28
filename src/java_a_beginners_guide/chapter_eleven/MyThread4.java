package java_a_beginners_guide.chapter_eleven;

public class MyThread4 implements Runnable{
    //Instance field.
    Thread mThread;

    /**
     * Construct a new thread.
     * @param threadName: name of the thread.
     */
    public MyThread4(String threadName) {
        mThread = new Thread(this, threadName);
    }

    /**
     * Factory method to create and start a new thread.
     * @param threadName: name of the thread.
     * @return an instance of a new thread.
     */
    public static MyThread4 createAndStart(String threadName) {
        MyThread4 myThread = new MyThread4(threadName);

        myThread.mThread.start(); //Start a new thread.
        return myThread;
    }

    /**
     * Entry point of thread.
     */
    public void run() {
        System.out.println(mThread.getName() + " starting.");
        try{
            for(int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("In " + mThread.getName() + ", count is: " + count);
            }
        }catch(InterruptedException exception) {
            System.out.println(mThread.getName() + " interrupted.");
        }

        System.out.println(mThread.getName() + " terminating.");
    }
}
