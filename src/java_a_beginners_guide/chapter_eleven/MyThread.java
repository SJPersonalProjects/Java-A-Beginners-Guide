package java_a_beginners_guide.chapter_eleven;

public class MyThread implements Runnable{
    //Instance field.
    String mThreadName;

    /**
     * Parameterized constructor to instantiate MyThread object.
     * @param mThreadName: name of the thread.
     */
    public MyThread(String mThreadName) {
        this.mThreadName = mThreadName;
    }

    /**
     * run() method as it's the entry point to execute the thread.
     */
    public void run() {
        System.out.println(mThreadName + " starting.");
        try{
            for(int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("In " + mThreadName + ", count is : " + count);
            }
        }catch(InterruptedException exception) {
            System.out.println(mThreadName + " interrupted.");
        }
        System.out.println(mThreadName + " terminating.");
    }

}
