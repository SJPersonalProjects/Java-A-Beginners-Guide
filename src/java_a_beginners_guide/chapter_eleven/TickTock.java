package java_a_beginners_guide.chapter_eleven;

public class TickTock {
    //Instance fields.
    String mState;

    public synchronized void tick(boolean running) {
        if(!running) { //Stop the clock.
            mState = "Ticked";
            notify(); //Notifies any waiting thread.
            return;
        }

        System.out.print("Tick");

        mState = "Ticked"; //Set the current state to the Ticked.

        notify(); //Let clock tock run().

        try{
            while(!mState.equals("Tocked")) {
                wait(); //Waiti the tocked to complete.
            }
        }catch(InterruptedException exception) {
            System.out.println("Thread interrupted.");
        }
    }

    public synchronized void tock(boolean running) {
        if(!running) { //Sto the clock.
            mState = "Tocked";
            notify(); //Notify the waiting thread.
            return;
        }

        System.out.println("Tock");

        mState = "Tocked"; //Set the current state to Tocked.
        notify(); //Let the tick run until released.

        try{
            while(!mState.equals("Ticked")) {
                wait(); //Wait for tick to complete.
            }
        }catch(InterruptedException exception) {
            System.out.println("Thread interrupted.");
        }
    }
}
