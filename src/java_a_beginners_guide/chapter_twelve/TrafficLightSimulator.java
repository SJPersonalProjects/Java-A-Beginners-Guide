package java_a_beginners_guide.chapter_twelve;

/**
 * A simulation of a traffic light that uses an enumeration that describes the light's color.
 */
public class TrafficLightSimulator implements Runnable{
    private TrafficLightColor trafficLightColor; //Holds the traffic light color.
    private boolean stop = false; //Set to true to stop the simulation.
    private boolean changed = false; //True when the light has changed.

    /**
     * Construct an object of TrafficLightSimulator.
     * @param trafficLightColor color of traffic light.
     */
    TrafficLightSimulator(TrafficLightColor trafficLightColor) {
        this.trafficLightColor = trafficLightColor;
    }

    /**
     * Construct an object of TrafficLightSimulator and assign the red color to the variable.
     */
    TrafficLightSimulator() {
        this.trafficLightColor = TrafficLightColor.RED;
    }

    //Start up the traffic lights.
    public void run() {
        while(!stop) {
            try{
                switch(trafficLightColor) {
                    case RED:
                        Thread.sleep(12000/2); //RED sleeps for about 12 seconds.
                        break;
                    case GREEN:
                        Thread.sleep(10000/2); //GREEN sleeps for about 10 seconds.
                        break;
                    case YELLOW:
                        Thread.sleep(2000/2); //YELLOW sleeps for about 2 seconds.
                        break;
                }
            }catch(InterruptedException exception) {
                System.out.println(exception);
            }
            changeColor();
        }
    }

    /**
     * Method to change the color of traffic light of signal.
     */
    public synchronized void changeColor() {
        switch(trafficLightColor) {
            case RED:
                trafficLightColor = TrafficLightColor.GREEN;
                break;
            case GREEN:
                trafficLightColor = TrafficLightColor.YELLOW;
                break;
            case YELLOW:
                trafficLightColor = TrafficLightColor.RED;
                break;
        }
        changed = true;
        notify(); //Signals that light color has changed.
    }

    //Wait until the light change occurs.
    public synchronized void waitForChange() {
        try{
            while(!changed) {
                wait(); //Wait for the light to change.
                changed = false;
            }
        }catch(InterruptedException exception) {
            System.out.println(exception);
        }
    }

    //Return the current color.
    public synchronized TrafficLightColor getColor() {
        return trafficLightColor;
    }

    //Stops the traffic light.
    public synchronized void cancel() {
        stop = true;
    }
}
