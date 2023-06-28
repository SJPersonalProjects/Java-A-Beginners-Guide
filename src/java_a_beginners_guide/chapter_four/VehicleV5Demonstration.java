package java_a_beginners_guide.chapter_four;

public class VehicleV5Demonstration {
    public static void main(String[] args) {
        //VehicleV5 class objects.
        VehicleV5 minivan = new VehicleV5();
        VehicleV5 sportsCar = new VehicleV5();

        double gallonsNeeded;
        int distance = 252;

        //Assigning the values to the minivan fields.
        minivan.mPassengers = 7;
        minivan.mFuelCapacity = 16;
        minivan.mMilesPerGallon = 21;

        //Assigning the values to the sports car fields.
        sportsCar.mPassengers = 2;
        sportsCar.mFuelCapacity = 14;
        sportsCar.mMilesPerGallon = 12;

        //Getting fuel for minivan and display more info on the console.
        gallonsNeeded = minivan.fuelNeeded(distance);
        System.out.println("Minivan can carry " + minivan.mPassengers + " passengers " + " with the range of " +
                minivan.calculateRange() + " miles. " +
                "To go " + distance + " miles further ahead minivan needs " + gallonsNeeded + " gallons of fuel in its current capacity.");

        //Getting fuel for sports car and display more info on the console.
        gallonsNeeded = sportsCar.fuelNeeded(distance);
        System.out.println("Sports car can carry " + sportsCar.mPassengers + " passengers " + " with the range of " +
                sportsCar.calculateRange() + " miles. " +
                "To go " + distance + " miles further ahead sports car needs " + gallonsNeeded + " gallons of fuel in its current capacity.");
    }
}
