package java_a_beginners_guide.chapter_one;

/**
 * This program introduces to the new concepts in Java programming
 * and combines them all to build an updated version of gallons to liters conversion.
 */
public class GallonsToLitersTable {
    public static void main(String[] args) {
        double gallons, liters;
        int counter = 1;

        //Using for loop, we print a conversion table of gallons to liters
        //from 1 gallon to 100 gallons.
        //and after 10 iterations a blank line is print on console output.
        for(gallons = 1.0; gallons <= 100.0; gallons++) {
            liters = gallons * 3.7854;
            System.out.println(gallons + " gallons is equal to " + liters + " liters");

            //On every 10th iteration, a blank line is printed on console output.
            //and counter is set to zero.
            if(counter == 10) {
                System.out.println();
                counter = 0;
            }

            //random_programs.Counter is incremented by 1 after every iteration.
            //To make it reach 10 to achieve a blank line for console output.
            counter++;
        }
    }
}
