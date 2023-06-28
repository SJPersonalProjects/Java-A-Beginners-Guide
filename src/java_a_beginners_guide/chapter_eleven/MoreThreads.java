package java_a_beginners_guide.chapter_eleven;

public class MoreThreads {
    public static void main(String[] args) {
        System.out.println("Main thread starting.");

        MyThread3 threadOne = MyThread3.createAndStart("Child #1");
        MyThread3 threadTwo = MyThread3.createAndStart("Child #2");
        MyThread3 threadThree = MyThread3.createAndStart("Child #3");

//        for(int i = 0; i < 50; i++) {
//            System.out.print(".");
//            try{
//                Thread.sleep(100);
//            }catch(InterruptedException exception){
//                System.out.println("Main thread interrupted.");
//            }
//        }

        do{
            System.out.print(".");
            try{
                Thread.sleep(100);
            }catch(InterruptedException exception) {
                System.out.println("Main thread interrupted.");
            }
        }while(threadOne.mThread.isAlive() || threadTwo.mThread.isAlive() || threadThree.mThread.isAlive());

        System.out.println("Main thread ending.");
    }
}
