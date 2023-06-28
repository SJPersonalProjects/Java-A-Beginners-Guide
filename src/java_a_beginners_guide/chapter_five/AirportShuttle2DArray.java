package java_a_beginners_guide.chapter_five;

public class AirportShuttle2DArray {
    public static void main(String[] args) {
        //Creating 2D array of type int.
        int[][] passengers = new int[7][];

        //Creating the size of 2nd dimension manually.
        //Shuttle goes 10 times back and forth in the airport during the weekdays.
        passengers[0] = new int[10];
        passengers[1] = new int[10];
        passengers[2] = new int[10];
        passengers[3] = new int[10];
        passengers[4] = new int[10];

        //Shuttle goes 2 times back and forth in the airport during the weekends.
        passengers[5] = new int[2];
        passengers[6] = new int[2];

        int a, b;

        //Fabricate some fake data.
        //For the week days.
        for(a = 0; a < 5; a++) {
            for(b = 0; b < 10; b++) {
                passengers[a][b] = a + b + 1;
            }
        }

        //Fabricate some fake data.
        //For the weekends.
        for(a = 5; a < 7; a++) {
            for(b = 0; b <  2; b++) {
                passengers[a][b] = a + b + 1;
            }
        }

        //Extracting data from the weekdays.
        for(a = 0; a < 5; a++) {
            for(b = 0; b < 10; b++) {
                System.out.print(passengers[a][b] + " "); //Extracting data.
            }
            System.out.println(); //Bringing a line of gap on console output.
        }

        //Extracting data from the weekends.
        for(a = 5; a < 7; a++) {
            for(b = 0; b < 2; b++) {
                System.out.print(passengers[a][b] + " ");
            }
            System.out.println();
        }
    }
}
