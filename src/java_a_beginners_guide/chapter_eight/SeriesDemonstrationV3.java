package java_a_beginners_guide.chapter_eight;

public class SeriesDemonstrationV3 {
    public static void main(String[] args) {
        //Objects.
        ByTwosV3 byTwos = new ByTwosV3();
        ByThreesV3 byThrees = new ByThreesV3();
        SeriesInterface seriesInterface;

        //using for loop to get the next value.
        for(int i = 0; i < 5; i++) {
            seriesInterface = byTwos;
            System.out.println("Next ByTwos is: " +
                    seriesInterface.getNext());
        }
        System.out.println(); //For a gap of a line.

        for(int i = 0; i < 5; i++) {
            seriesInterface = byThrees;
            System.out.println("Next byThrees is: " +
                    seriesInterface.getNext());
        }
    }

    public static interface B extends A {
        void methodThree();
    }
}
