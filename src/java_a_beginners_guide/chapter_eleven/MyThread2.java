package java_a_beginners_guide.chapter_eleven;

public class MyThread2 extends Thread{

    /**
     * Constructing a new thread.
     * @param mThreadName: name of the thread.
     */
    public MyThread2(String mThreadName) {
        super(mThreadName);
    }

    /**
     * run() is the entry point of the thread.
     */
    public void run() {
        System.out.println(getName() + " starting.");

        try{
            //Starts counter while at each iteration thread sleeps for about 0.4 seconds.
            for(int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("In " + getName() + ", count is: " + count);
            }
        }catch(InterruptedException interruptedException) {
            System.out.println(getName() + " interrupted.");
        }

        System.out.println(getName() + " terminating.");
    }
}
