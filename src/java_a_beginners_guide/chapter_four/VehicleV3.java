package java_a_beginners_guide.chapter_four;

public class VehicleV3 {
    //Instance fields.
    int mPassengers;
    int mFuelCapacity;
    int mMilesPerGallon;

    //Compute and display the range of the vehicle.
    public void calculateRange() {
        System.out.println("Range is : " + (mFuelCapacity * mMilesPerGallon));
    }
}
