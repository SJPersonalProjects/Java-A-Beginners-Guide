package java_a_beginners_guide.chapter_eleven;

public class UseMainThread {
    public static void main(String[] args) {
        //Thread reference.
        Thread mThread;

        //Gets the main thread reference.
        mThread = Thread.currentThread();

        //Display main thread's name.
        System.out.println("Main thread is called: " + mThread.getName());

        //Display main thread's priority.
        System.out.println("Priority: " + mThread.getPriority());

        System.out.println();

        //Set the name and priority.
        System.out.println("Setting name and priority.\n");
        mThread.setName("My Thread #1");
        mThread.setPriority(Thread.NORM_PRIORITY + 3);

        System.out.println("Main thread is now called: " + mThread.getName());
        System.out.println("Priority is now: " + mThread.getPriority());
    }
}
