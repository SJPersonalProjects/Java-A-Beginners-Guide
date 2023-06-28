package java_a_beginners_guide.chapter_eleven;

public class MyThread3 implements Runnable{
    //Instance field.
    Thread mThread;

    /**
     * Construct a new thread.
     * @param threadName: name of the thread.
     */
    public MyThread3(String threadName) {
        mThread = new Thread(this, threadName);
    }

    /**
     * A factory method that creates and starts a new thread.
     * @param threadName: name of the thread.
     */
    public static MyThread3 createAndStart(String threadName) {
        MyThread3 myThread = new MyThread3(threadName);

        myThread.mThread.start();
        return myThread;
    }

    /**
     * Entry point of the new thread.
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
