package java_a_beginners_guide.chapter_eleven;

public class UseThread {
    public static void main(String[] args) {
        System.out.println("Main thread starting.");

        //First construct a MyThread object.
        MyThread myThread = new MyThread("Child #1"); //runnable object.

        //Next, construct a thread from that object.
        Thread newThread = new Thread(myThread);

        //Finally, start execution of the thread.
        newThread.start();

        System.out.println("\n\n");

        for(int i = 0; i < 50; i++) {
            System.out.print(".");
            try{
                Thread.sleep(100);
            }catch(InterruptedException exception) {
                System.out.println("Main thread interrupted.");
            }
        }

        System.out.println("Main thread ending.");
    }
}
