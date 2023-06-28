package java_a_beginners_guide.chapter_eleven;

public class ThreadVariations {
    public static void main(String[] args) {
        System.out.println("Main thread starting.");

        //Create and start a thread.
        MyThread1 myThread = MyThread1.createAndStart("Child #1");

        for(int i = 0; i < 50; i++) {
            System.out.print(".");
            try{
                Thread.sleep(100);
            }catch(InterruptedException exception){
                System.out.println("Main thread interrupted.");
            }
        }

        System.out.println("Main thread ending.");
    }
}
