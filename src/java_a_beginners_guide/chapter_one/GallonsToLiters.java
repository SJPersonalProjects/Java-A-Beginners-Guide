package java_a_beginners_guide.chapter_one;

/**
 * This program illustrates some new Java features
 * by simply creating a new project that converts gallons to liters.
 */
public class GallonsToLiters {
    public static void main(String[] args) {
        double gallons; //Holds the number of gallons
        double liters; //Holds the number of liters

        gallons = 10;

        //Conversion to liters
        //There are 3.7854 liters in a gallon
        liters = gallons * 3.7854;

        System.out.println(gallons + " gallons is liters : " + liters);
    }
}
