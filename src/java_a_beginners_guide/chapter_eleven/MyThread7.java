package java_a_beginners_guide.chapter_eleven;

public class MyThread7 implements Runnable{
    Thread mThread;
    TickTock timeObject;

    //Constructs a new thread.
    public MyThread7(String mThreadName, TickTock timeObject) {
        mThread = new Thread(this, mThreadName);
        this.timeObject = timeObject;
    }

    //A factory method that creates and starts a new thread.
    public static MyThread7 createAndStart(String mThreadName, TickTock timeObject) {
        MyThread7 myThread = new MyThread7(mThreadName, timeObject);
        myThread.mThread.start();
        return myThread;
    }

    public void run() {
        if(mThread.getName().compareTo("Tick") == 0) {
            for(int i = 0; i < 5; i++) {
                timeObject.tick(true);
            }
            timeObject.tick(false);
        }else {
            for(int i = 0; i < 5; i++) {
                timeObject.tock(true);
            }
            timeObject.tock(false);
        }
    }
}
