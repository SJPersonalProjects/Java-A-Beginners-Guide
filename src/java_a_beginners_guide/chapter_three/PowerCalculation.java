package java_a_beginners_guide.chapter_three;

public class PowerCalculation {
    public static void main(String[] args) {
        int valueE;
        int result;

        //Calculating power 2 on every value.
        for(int i = 0; i < 10; i++) {
            result = 1;
            valueE = i;
            while(valueE > 0) {
                result *= 2;
                valueE--;
            }

            System.out.println("2 to the " + i + " power is : " + result);
        }
    }
}
