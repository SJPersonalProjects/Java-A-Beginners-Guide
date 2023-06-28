package java_a_beginners_guide.chapter_eleven;

public class Suspend {
    public static void main(String[] args) {
        MyThread8 myThread = MyThread8.createAndStart("My Thread");

        try{
            Thread.sleep(1000); //Let object1 thread start excuting.

            myThread.mySuspend();
            System.out.println("Suspending thread.");
            Thread.sleep(1000);

            myThread.myResume();
            System.out.println("Resuming thread.");
            Thread.sleep(1000);

            myThread.mySuspend();
            System.out.println("Suspending thread.");
            Thread.sleep(1000);

            myThread.myResume();
            System.out.println("Resuming thread.");
            Thread.sleep(1000);

            myThread.mySuspend();
            System.out.println("Suspending thread.");
            Thread.sleep(1000);

            myThread.myStop();
            System.out.println("Stopping thread.");
            Thread.sleep(1000);


        }catch(InterruptedException exception) {
            System.out.println("Thread Interrupted.");
        }

        //Wait for the thread to finish.
        try{
            myThread.mThread.join();
        }catch(InterruptedException exception) {
            System.out.println("Main Thread Interrupted.");
        }

        System.out.println("Main Thread Exiting.");
    }
}
