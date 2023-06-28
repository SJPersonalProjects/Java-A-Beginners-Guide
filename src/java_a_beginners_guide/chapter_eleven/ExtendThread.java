package java_a_beginners_guide.chapter_eleven;

public class ExtendThread {
    public static void main(String[] args) {
        System.out.println("Main thread starting.");

        MyThread2 myThread = new MyThread2("Child #1");
        myThread.start();

        for(int i = 0; i < 50; i++) {
            System.out.print(".");
            //Try-catch statement to sleep the thread and catch exception if interrupted.
            try{
                //Thread sleeps for about 0.1 seconds.
                Thread.sleep(100);
            }catch(InterruptedException exception) {
                System.out.println("Main thread interrupted.");
            }
        }

        System.out.println("Main thread ending.");
    }
}
