package java_a_beginners_guide.chapter_eleven;

public class MyThread1 implements Runnable{
    //Instance field.
    Thread mThread;

    /**
     * Construct a new thread using this runnable and give it a name.
     * @param mThreadName: name of the thread.
     */
    public MyThread1(String mThreadName) {
        mThread = new Thread(this, mThreadName);
    }

    /**
     * A factory method that creates and starts a thread.
     * @param mThreadName: name of the thread.
     * @return the instance of myThread.
     */
    public static MyThread1 createAndStart(String mThreadName) {
        MyThread1 myThread = new MyThread1(mThreadName);

        //Starts the thread.
        myThread.mThread.start();

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
                System.out.println("In " + mThread.getName() + ", count: " + count);
            }
        }catch(InterruptedException exception) {
            System.out.println(mThread.getName() + " interrupted.");
        }

        System.out.println(mThread.getName() + " terminating.");
    }
}
