package java_a_beginners_guide.chapter_four;

public class VehicleV2Demonstration {
    public static void main(String[] args) {
        //Objects of class VehicleV1.
        VehicleV1 minivan = new VehicleV1();
        VehicleV1 sportsCar = new VehicleV1();

        //To calculate the ranges of both objects.
        int rangeOne, rangeTwo;

        //Assigning values to minivan object.
        minivan.mPassengers = 7;
        minivan.mFuelCapacity = 16;
        minivan.mMilesPerGallon = 21;

        //Assigning values to the sportsCar object.
        sportsCar.mPassengers = 2;
        sportsCar.mFuelCapacity = 14;
        sportsCar.mMilesPerGallon = 12;

        //Compute the ranges assuming the fuel tank of gas.
        rangeOne = minivan.mFuelCapacity * minivan.mMilesPerGallon;
        rangeTwo = sportsCar.mFuelCapacity * sportsCar.mMilesPerGallon;

        //Displaying information on console.
        System.out.println("Minivan can carry " + minivan.mPassengers + " passengers " +
                " with a range of " + rangeOne + " miles");

        System.out.println("Sports car can carry " + sportsCar.mPassengers + " passengers " +
                " with a range of " + rangeTwo + " miles");
    }
}
