package java_a_beginners_guide.chapter_twelve;

public class EnumerationDemonstration4 {
    public static void main(String[] args) {
        //Days enumeration reference variable.
        Days dayOne, dayTwo, dayThree;


        System.out.println("Here are all the days constants and their ordinal values: ");
        //Obtain all ordinal values using ordinal().
        for(Days days : Days.values()) {
            System.out.println(days + " " + days.ordinal());
        }

        dayOne = Days.WEDNESDAY;
        dayTwo = Days.SATURDAY;
        dayThree = Days.SUNDAY;

        System.out.println(); //Statement for a gap of line.

        //Demonstrate compareTo().
        if(dayOne.compareTo(dayTwo) < 0) System.out.println("Wednesday comes before Saturday");
        else System.out.println("Wednesday comes after Saturday");

        if(dayOne.compareTo(dayThree) < 0) System.out.println("Wednesday comes before Sunday");
        else System.out.println("Wednesday comes after Sunday");

        if(dayTwo.compareTo(dayOne) < 0) System.out.println("Saturday comes before Wednesday");
        else System.out.println("Saturday comes after Wednesday");

        if(dayTwo.compareTo(dayThree) < 0) System.out.println("Saturday comes before Sunday");
        else System.out.println("Saturday comes after Sunday");

        if(dayThree.compareTo(dayOne) < 0) System.out.println("Sunday comes before Wednesday");
        else System.out.println("Sunday comes after Wednesday");

        if(dayThree.compareTo(dayTwo) < 0) System.out.println("Sunday comes before Saturday");
        else System.out.println("Sunday comes after Saturday");
    }
}
