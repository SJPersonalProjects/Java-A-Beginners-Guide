package java_a_beginners_guide.chapter_seven;

public class Truck extends Vehicle{
    //Instance fields.
    private int mCargoCapacity;

    /**
     * Parameterized constructor to initialize the Truck object.
     * @param mPassengers: no of passengers
     * @param mFuelCapacity: fuel capacity of the truck vehicle.
     * @param mMilesPerGallon: distance truck covers in miles per gallon.
     * @param mCargoCapacity: cargo capacity in the truck.
     */
    public Truck(int mPassengers, int mFuelCapacity, int mMilesPerGallon, int mCargoCapacity) {
        //Initializing vehicle's members using Vehicle constructor.
        super(mPassengers, mFuelCapacity, mMilesPerGallon);
        this.mCargoCapacity = mCargoCapacity;
    }

    /**
     * Method to set the cargo capacity in the truck.
     * @param mCargoCapacity: cargo capacity for each new type of truck.
     */
    public void setCargoCapacity(int mCargoCapacity) {
        this.mCargoCapacity = mCargoCapacity;
    }

    /**
     * Method to get the cargo capacity from each truck.
     * @return cargo capacity of new truck.
     */
    public int getCargoCapacity() {
        return mCargoCapacity;
    }
}
