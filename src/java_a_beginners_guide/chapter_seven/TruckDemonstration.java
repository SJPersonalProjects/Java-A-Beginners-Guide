package java_a_beginners_guide.chapter_seven;

public class TruckDemonstration {
    public static void main(String[] args) {
        //Truck class objects.
        Truck semiTruck = new Truck(2, 200, 7, 44000);
        Truck pickupTruck = new Truck(3, 28, 15, 2000);

        double gallons;
        int distance = 252;

        //Information for semi truck object.
        gallons = semiTruck.fuelNeeded(distance);
        System.out.println("Semi truck can carry " + semiTruck.getCargoCapacity() +
                " pounds.");
        System.out.println("To go " + distance + " miles, semi truck needs " +
                gallons + " gallons of fuel.\n");

        //Information for pickup truck object.
        gallons = pickupTruck.fuelNeeded(distance);
        System.out.println("Pickup truck can carry " + pickupTruck.getCargoCapacity() +
                " pounds.");
        System.out.println("To go " + distance + " miles, pickup truck needs " +
                gallons + " gallons of fuel.");
    }
}
