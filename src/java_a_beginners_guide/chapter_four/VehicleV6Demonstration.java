package java_a_beginners_guide.chapter_four;

public class VehicleV6Demonstration {
    public static void main(String[] args) {
        //Vehicles objects.
        VehicleV6 minivan = new VehicleV6(7, 16, 21, "0001");
        VehicleV6 sportsCar = new VehicleV6(2, 14, 12, "0002");

        double gallons; //Variable to store gallons.
        int distance = 252; //Further distance for all vehicles.

        //Gallons calculation for minivan.
        gallons = minivan.calculateFuelNeeded(distance);
        System.out.println("Minivan can carry " + minivan.getPassengers() + " passengers with the range of " + minivan.calculateRange() + " miles." +
                "\nTo go the further distance of " + distance + " miles " + "minivan needs " + gallons + " gallons of fuel.");

        System.out.println();//Statement for a gap of line.

        //Gallons calculation for sports car.
        gallons = sportsCar.calculateFuelNeeded(distance);
        System.out.println("Sports car can carry " + sportsCar.getPassengers() + " passengers with the range of " + sportsCar.calculateRange() + " miles." +
                "\nTo go the further distance of " + distance + " miles " + "sports car needs " + gallons + " gallons of fuel.");
    }
}
