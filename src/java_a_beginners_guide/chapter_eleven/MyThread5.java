package java_a_beginners_guide.chapter_eleven;

public class MyThread5 implements Runnable{
    Thread mThread;
    public static SumArray sumArray = new SumArray();
    int a[];
    int answer;

    //Construct a new thread.
    public MyThread5(String threadName, int[] numbers) {
        mThread = new Thread(this, threadName);
        a = numbers;
    }

    //A factory method that creates and starts a thread.
    public static MyThread5 createAndStart(String threadName, int[] numbers) {
        MyThread5 myThread = new MyThread5(threadName, numbers);

        //Starts a thread.
        myThread.mThread.start();
        return myThread;
    }

    public void run() {
        int sum;

        System.out.println(mThread.getName() + " starting.");

        answer = sumArray.sumArray(a);
        System.out.println("Sum for " + mThread.getName() + " is " + answer);

        System.out.println(mThread.getName() + " terminating.");
    }
}
