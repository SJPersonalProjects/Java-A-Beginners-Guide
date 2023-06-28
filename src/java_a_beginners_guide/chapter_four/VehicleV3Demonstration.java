package java_a_beginners_guide.chapter_four;

public class VehicleV3Demonstration {
    public static void main(String[] args) {
        //Objects of class VehicleV3.
        VehicleV3 minivan = new VehicleV3();
        VehicleV3 sportsCar = new VehicleV3();

        //Assigning values to the minivan fields.
        minivan.mPassengers = 7;
        minivan.mFuelCapacity = 16;
        minivan.mMilesPerGallon = 21;

        //Assigning values to the sports car fields.
        sportsCar.mPassengers = 2;
        sportsCar.mFuelCapacity = 14;
        sportsCar.mMilesPerGallon = 12;

        //Display passengers message and calculating range.
        System.out.print("Minivan can carry " + minivan.mPassengers + ". ");
        minivan.calculateRange();

        //Displaying passengers message and calculating range.
        System.out.print("Sports car can carry " + sportsCar.mPassengers + ". ");
        sportsCar.calculateRange();
    }
}
