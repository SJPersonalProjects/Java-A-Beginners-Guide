package java_a_beginners_guide.chapter_four;

public class VehicleV6 {
    //Instance fields.
    private int mPassengers; //Primitive variable.
    private int mFuelCapacity; //Primitive variable.
    private int mMilesPerGallon; //Primitive variable.
    private String mVehiclePlateNo; //Reference variable.

    /**
     * Parameterized constructor to create the separate copies for each object.
     * @param mPassengers: number of passengers.
     * @param mFuelCapacity: current fuel capacity in the fuel tank.
     * @param mMilesPerGallon: number of miles this vehicle complete per gallon.
     * @param mVehiclePlateNo: plate no of a vehicle.
     */
    public VehicleV6(int mPassengers, int mFuelCapacity, int mMilesPerGallon, String mVehiclePlateNo) {
        this.mPassengers = mPassengers;
        this.mFuelCapacity = mFuelCapacity;
        this.mMilesPerGallon = mMilesPerGallon;
        this.mVehiclePlateNo = mVehiclePlateNo;
    }

    //Accessor Methods.
    public void setPassengers(int mPassengers) {
        this.mPassengers = mPassengers;
    }
    public int getPassengers() {
        return mPassengers;
    }
    public void setVehiclePlateNo(String mVehiclePlateNo) {
        this.mVehiclePlateNo = mVehiclePlateNo;
    }
    public String getVehiclePlateNo() {
        return mVehiclePlateNo;
    }

    /**
     * This method calculates the range of how far can the vehicle go
     * with current fuel capacity.
     * @return range
     */
    public int calculateRange() {
        return mFuelCapacity * mMilesPerGallon;
    }

    /**
     * This method calculates the fuel needed for the journey ahead
     * @param miles: variable for distance to go ahead.
     * @return amount of fuel needed to chase the further distance.
     */
    public double calculateFuelNeeded(int miles) {
        return (double) miles / mMilesPerGallon;
    }
}
