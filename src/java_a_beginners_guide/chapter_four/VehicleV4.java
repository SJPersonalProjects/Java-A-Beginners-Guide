package java_a_beginners_guide.chapter_four;

public class VehicleV4 {
    //Instance fields.
    int mPassengers;
    int mFuelCapacity;
    int mMilesPerGallon;

    //Method to calculate and return the range of a specific object.
    int calculateRange() {
        return mFuelCapacity * mMilesPerGallon;
    }
}
