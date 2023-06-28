package java_a_beginners_guide.chapter_four;

public class VehicleV1Demonstration {
    public static void main(String[] args) {
        //Object of class VehicleV1.
        VehicleV1 minivan = new VehicleV1();

        int range; //to compute the range of minivan.

        //Assigning the values to the minivan object instances.
        minivan.mPassengers = 7;
        minivan.mFuelCapacity = 16;
        minivan.mMilesPerGallon = 22;

        //Calculating range of minivan.
        range = minivan.mFuelCapacity * minivan.mMilesPerGallon;

        //Displaying on console.
        System.out.println("\nMinivan can carry " + minivan.mPassengers + " passengers " +
                " with a range of " + range + " miles");
    }
}
