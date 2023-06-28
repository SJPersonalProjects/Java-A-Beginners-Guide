package java_a_beginners_guide.chapter_four;

public class VehicleV4Demonstration {
    public static void main(String[] args) {
        //VehicleV4 Class objects.
        VehicleV4 minivan = new VehicleV4();
        VehicleV4 sportsCar = new VehicleV4();

        //Variables to store ranges for both vehicles.
        int rangeOne, rangeTwo;

        //Assigning values to the minivan fields.
        minivan.mPassengers = 7;
        minivan.mFuelCapacity = 16;
        minivan.mMilesPerGallon = 21;

        //Assigning values to the sports car fields.
        sportsCar.mPassengers = 2;
        sportsCar.mFuelCapacity = 14;
        sportsCar.mMilesPerGallon = 12;

        //Storing ranges for both vehicles.
        rangeOne = minivan.calculateRange();
        rangeTwo = sportsCar.calculateRange();

        //Displaying the message for both vehicles.
        System.out.println("Minivan can carry " + minivan.mPassengers + " passengers " +
                " with the range of " + rangeOne + " miles");
        System.out.println("Sports car can carry " + sportsCar.mPassengers + " passengers " +
                " with the range of " + rangeTwo + " miles");
    }
}
