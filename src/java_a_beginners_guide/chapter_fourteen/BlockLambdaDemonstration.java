package java_a_beginners_guide.chapter_fourteen;

public class BlockLambdaDemonstration {
    public static void main(String[] args) {

        //This lambda returns the smallest positive factor of a value.
        NumericFunction smallestFactor = (valueX) -> {
            int result = 1;

            //Get absolute value of valueX.
            valueX = valueX < 0 ? -valueX : valueX;

            for(int i = 2; i <= valueX/i; i++) {
                if(valueX % i == 0) {
                    result = i;
                    break;
                }
            }

            return result;
        };

        System.out.println("Smallest factor of 12 is: " + smallestFactor.findFactor(12));
        System.out.println("Smallest factor of 11 is: " + smallestFactor.findFactor(11));

        int valueX = -1;

        valueX = (valueX < 0)? -valueX : valueX;
        System.out.println(valueX);
    }
}
