package java_a_beginners_guide.chapter_twelve;

public class EnumerationDemonstration2 {
    public static void main(String[] args) {
        //Declaring Transport enum reference variable.
        Transport[] allTransportTypes;

        //Getting the values from enumeration.
        allTransportTypes = Transport.values();

        //Using for-each loop to retrieve the values of Transport enumeration.
        for(Transport values : allTransportTypes) {
            System.out.println(values);
        }

        System.out.println(); //Statement for a gap of a line.

        //use of valueOf();
        Transport transport = Transport.valueOf("AIRPLANE");
        System.out.println("transport contains: " + transport);
    }
}
