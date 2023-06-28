package java_a_beginners_guide.chapter_four;

public class VehicleV5 {
    //Instance fields.
    int mPassengers;
    int mFuelCapacity;
    int mMilesPerGallon;

    //Method to calculate the range of each vehicle.
    int calculateRange() {
        return mMilesPerGallon * mFuelCapacity;
    }

    //Method to calculate the fuel needed for a given distance.
    double fuelNeeded(int miles) {
        return (double) miles / mMilesPerGallon;
    }
}
