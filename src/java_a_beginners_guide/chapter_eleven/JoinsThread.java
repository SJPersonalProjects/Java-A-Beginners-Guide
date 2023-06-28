package java_a_beginners_guide.chapter_eleven;

public class JoinsThread {
    public static void main(String[] args) {
        System.out.println("Main thread starting.");

        MyThread4 threadOne = MyThread4.createAndStart("Child #1");
        MyThread4 threadTwo = MyThread4.createAndStart("Child #2");
        MyThread4 threadThree = MyThread4.createAndStart("Child #3");

        try{
            threadOne.mThread.join();
            System.out.println("Child #1 Joined.");
            threadTwo.mThread.join();
            System.out.println("Child #2 Joined.");
            threadThree.mThread.join();
            System.out.println("Child #3 Joined.");
        }catch(InterruptedException exception) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("Main thread ending.");
    }
}
