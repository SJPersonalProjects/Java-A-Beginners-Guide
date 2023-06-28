package java_a_beginners_guide.chapter_eleven;

public class MyThread6 implements Runnable{
    Thread mThread;
    static SumArray1 sumArray = new SumArray1();
    int[] numbers;
    int answer;

    /**
     * Construct a new thread.
     * @param threadName: name of the thread.
     * @param numbers: array of the thread.
     */
    public MyThread6(String threadName, int[] numbers) {
        mThread = new Thread(this, threadName);
        this.numbers = numbers;
    }

    //A factory method that creates and starts a thread.
    public static MyThread6 createAndStart(String threadName, int[] numbers) {
        MyThread6 myThread = new MyThread6(threadName, numbers);

        myThread.mThread.start(); //Starts the thread.
        return myThread;
    }

    public void run() {
        int sum;

        System.out.println(mThread.getName() + " starting.");

        //Synchronize calls to sumArray.
        synchronized(sumArray) {
            answer = sumArray.sumArray(numbers);
        }

        System.out.println("Sum for " + mThread.getName() + " is " + answer);

        System.out.println(mThread.getName() + " terminating.");
    }
}
