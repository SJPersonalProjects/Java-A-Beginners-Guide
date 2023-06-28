package java_a_beginners_guide.chapter_seven;

public class Vehicle {
    //Instance fields.
    private int mPassengers;
    private int mFuelCapacity;
    private int mMilesPerGallon;

    /**
     * Parameterized constructor to initialize the Vehicle class object.
     * @param mPassengers: number of passengers in a vehicle.
     * @param mFuelCapacity: fuel capacity of a vehicle.
     * @param mMilesPerGallon: distance covered by a vehicle per gallon.
     */
    public Vehicle(int mPassengers, int mFuelCapacity, int mMilesPerGallon) {
        this.mPassengers = mPassengers;
        this.mFuelCapacity = mFuelCapacity;
        this.mMilesPerGallon = mMilesPerGallon;
    }

    /**
     * Method to set the number of passengers for a vehicle.
     * @param mPassengers: no of passengers for a vehicle.
     */
    public void setPassengers(int mPassengers) {
        this.mPassengers = mPassengers;
    }

    /**
     * Method to get the no of passengers of a vehicle.
     * @return no of passengers.
     */
    public int getPassengers() {
        return mPassengers;
    }

    /**
     * Method to set the fuel capacity of a vehicle.
     * @param mFuelCapacity: fuel capacity of a vehicle.
     */
    public void setFuelCapacity(int mFuelCapacity) {
        this.mFuelCapacity = mFuelCapacity;
    }

    /**
     * Method to get the fuel capacity of a vehicle.
     * @return fuel capacity.
     */
    public int getFuelCapacity() {
        return mFuelCapacity;
    }

    /**
     * Method to set the distance (miles per gallon) of a vehicle.
     * @param mMilesPerGallon: distance of a vehicle in miles.
     */
    public void setMilesPerGallon(int mMilesPerGallon) {
        this.mMilesPerGallon = mMilesPerGallon;
    }

    /**
     * Method to get the distance in miles per gallon.
     * @return distance in miles per gallon.
     */
    public int getMilesPerGallon() {
        return mMilesPerGallon;
    }

    /**
     * Method to get the range a vehicle can cover based on its fuel capacity in tank.
     * @return range of the vehicle.
     */
    public int range() {
        return mFuelCapacity * mMilesPerGallon;
    }

    /**
     * Method to compute fuel needed for a given distance.
     * @param distance: left to cover.
     * @return fuel needed to cover the remaining distance.
     */
    public double fuelNeeded(int distance) {
        return (double) distance / mMilesPerGallon;
    }
}
