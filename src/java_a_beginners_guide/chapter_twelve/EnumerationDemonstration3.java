package java_a_beginners_guide.chapter_twelve;

public class EnumerationDemonstration3 {
    public static void main(String[] args) {
        //Transportation enum reference variable.
        Transportation transport;

        //Displaying the speed of a airplane.
        System.out.println("Speed of an Airplane: " + Transportation.AIRPLANE.getSpeed() +
                " miles per hour\n");

        System.out.println("All transports and their values: ");
        //Display all transports and their speeds.
        for(Transportation transportation : Transportation.values()) {
            System.out.println("Transport: " + transportation + " speed: " + transportation.getSpeed());
        }
    }
}
