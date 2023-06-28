package java_a_beginners_guide.chapter_eleven;

public class ThreadCom {
    public static void main(String[] args) {
        TickTock tickTock = new TickTock();

        MyThread7 threadOne = MyThread7.createAndStart("Tick", tickTock);
        MyThread7 threadTwo = MyThread7.createAndStart("Tock", tickTock);

        try{
            threadOne.mThread.join();
            threadTwo.mThread.join();
        }catch (InterruptedException exception) {
            System.out.println("Thread interrupted.");
        }
    }
}
