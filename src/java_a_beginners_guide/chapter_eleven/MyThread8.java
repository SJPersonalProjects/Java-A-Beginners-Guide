package java_a_beginners_guide.chapter_eleven;

public class MyThread8 implements Runnable{
    //Instance fields.
    Thread mThread;
    boolean mSuspended;
    boolean mStopped;

    //Construct a new thread.
    public MyThread8(String threadName) {
        mThread = new Thread(this, threadName);
        mSuspended = false;
        mStopped = false;
    }

    //A factory method that creates and starts a new thread.
    public static MyThread8 createAndStart(String threadName) {
        MyThread8 myThread = new MyThread8(threadName);
        myThread.mThread.start(); //Starts the thread.
        return myThread;
    }

    //Entry point of thread.
    public void run() {
        System.out.println(mThread.getName() + " starting.");

        try{
            for(int i = 0; i < 1000; i++) {
                System.out.print(i + " ");
                if((i % 10) == 0) {
                    System.out.println();
                    Thread.sleep(250);
                }
                //Use synchronized block to check suspended and stopped.
                synchronized(this) {
                    while(mSuspended) {
                        wait();
                    }
                    if(mStopped) break;
                }
            }
        }catch(InterruptedException exception) {
            System.out.println("Thread interrupted.");
        }

        System.out.println(mThread.getName() + " terminating.");
    }

    //Stop the thread.
    public synchronized void myStop() {
        mStopped = true;

        //The following ensures that a suspended thread can be stopped.
        mSuspended = false;
        notify();
    }

    //Suspend the thread.
    public synchronized void mySuspend() {
        mSuspended = true;
    }

    //Reusme the thread.
    public synchronized void myResume() {
        mSuspended = false;
        notify();
    }
}
