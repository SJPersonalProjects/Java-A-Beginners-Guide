package java_a_beginners_guide.chapter_eleven;

public class PriorityDemonstration {
    public static void main(String[] args) {
        Priority threadOne = new Priority("High Priority");
        Priority threadTwo = new Priority("Low Priority");
        Priority threadThree = new Priority("Normal Priority #1");
        Priority threadFour = new Priority("Normal Priority #2");
        Priority threadFive = new Priority("Normal Priority #3");

        //Set the priorities...
        threadOne.mThread.setPriority(Thread.NORM_PRIORITY + 2);
        threadTwo.mThread.setPriority(Thread.NORM_PRIORITY - 2);

        //Leaving threadThree, threadFour, threadFive at the defualt normal priority level.
        //Start the threads.
        threadOne.mThread.start();
        threadTwo.mThread.start();
        threadThree.mThread.start();
        threadFour.mThread.start();
        threadFive.mThread.start();

        try{
            threadOne.mThread.join();
            threadTwo.mThread.join();
            threadThree.mThread.join();
            threadFour.mThread.join();
            threadFive.mThread.join();
        }catch(InterruptedException exception) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("\nHigh priority thread counted to " + threadOne.count);
        System.out.println("Low priority thread counted to " + threadTwo.count);
        System.out.println("1st Normal priority thread counted to " + threadThree.count);
        System.out.println("2nd Normal priority thread counted to " + threadFour.count);
        System.out.println("3rd Normal priority thread counted to " + threadFive.count);
    }
}
