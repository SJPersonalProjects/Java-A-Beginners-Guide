package java_a_beginners_guide.chapter_eleven;

public class Sync {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};

        MyThread5 thread1 = MyThread5.createAndStart("Child #1", a);
        MyThread5 thread2 = MyThread5.createAndStart("Child #2", a);

        try{
            thread1.mThread.join();
            thread2.mThread.join();
        }catch(InterruptedException exception) {
            System.out.println("Main thread interrupted.");
        }
    }
}
