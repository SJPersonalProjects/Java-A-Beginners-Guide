package java_a_beginners_guide.chapter_eleven;

public class Sync1 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        MyThread6 thread1 = MyThread6.createAndStart("Child #1", array);
        MyThread6 thread2 = MyThread6.createAndStart("Child #2", array);

        try{
            thread1.mThread.join();
            thread2.mThread.join();
        }catch(InterruptedException exception) {
            System.out.println("Thread interrupted.");
        }
    }
}
